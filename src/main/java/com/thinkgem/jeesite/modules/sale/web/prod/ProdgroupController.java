/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.web.prod;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.sys.entity.Menu;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodgroup;
import com.thinkgem.jeesite.modules.sale.service.prod.ProdgroupService;

/**
 * 产品层级Controller
 * @author JeffZhou
 * @version 2014-08-03
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/prod/prodgroup")
public class ProdgroupController extends BaseController {

	@Autowired
	private ProdgroupService prodgroupService;
	
	@ModelAttribute("prodgroup")
	public Prodgroup get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return prodgroupService.get(id);
		}else{
			return new Prodgroup();
		}
	}
	
	@RequiresPermissions("sale:prod:prodgroup:view")
	@RequestMapping(value = {"list", ""})
	public String list(Prodgroup prodgroup, HttpServletRequest request, HttpServletResponse response, Model model) {
		List<Prodgroup> list = Lists.newArrayList();
		List<Prodgroup> sourcelist = prodgroupService.findAllProdgroup();
		Prodgroup.sortList(list, sourcelist, "1");
        model.addAttribute("list", list);
		return "modules/sale/prod/prodgroupList";
	}

	@RequiresPermissions("sale:prod:prodgroup:view")
	@RequestMapping(value = "form")
	public String form(Prodgroup prodgroup, Model model) {
		if (prodgroup.getParent()==null||prodgroup.getParent().getId()==null){
			prodgroup.setParent(new Prodgroup("1"));
		}
		prodgroup.setParent(prodgroupService.get(prodgroup.getParent().getId()));
		model.addAttribute("prodgroup", prodgroup);
		return "modules/sale/prod/prodgroupForm";
	}

	@RequiresPermissions("sale:prod:prodgroup:edit")
	@RequestMapping(value = "save")
	public String save(Prodgroup prodgroup, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, prodgroup)){
			return form(prodgroup, model);
		}
		prodgroupService.save(prodgroup);
		addMessage(redirectAttributes, "保存产品层级'" + prodgroup.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodgroup/?repage";
	}
	
	@RequiresPermissions("sale:prod:prodgroup:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		if (Prodgroup.isRoot(id)){
			addMessage(redirectAttributes, "删除产品层级失败, 不允许删除顶级编号为空");
		}else{
			prodgroupService.delete(id);
			addMessage(redirectAttributes, "删除产品层级成功");
		}
		
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodgroup/?repage";
	}
	
	@RequiresUser
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) Long extId, HttpServletResponse response) {
		response.setContentType("application/json; charset=UTF-8");
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<Prodgroup> list = prodgroupService.findAllProdgroup();
		for (int i=0; i<list.size(); i++){
			Prodgroup e = list.get(i);
			if (extId == null || (extId!=null && !extId.equals(e.getId()) && e.getParentIds().indexOf(","+extId+",")==-1)){
				Map<String, Object> map = Maps.newHashMap();
				map.put("id", e.getId());
				map.put("pId", e.getParent()!=null?e.getParent().getId():0);
				map.put("name", e.getName());
				mapList.add(map);
			}
		}
		return mapList;
	}

}
