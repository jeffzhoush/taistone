/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.web.prod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodinfo;
import com.thinkgem.jeesite.modules.sale.service.prod.ProdinfoService;

/**
 * 产品Controller
 * @author JeffZhou
 * @version 2014-08-03
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/prod/prodinfo")
public class ProdinfoController extends BaseController {

	@Autowired
	private ProdinfoService prodinfoService;
	
	@ModelAttribute
	public Prodinfo get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return prodinfoService.get(id);
		}else{
			return new Prodinfo();
		}
	}
	
	@RequiresPermissions("sale:prod:prodinfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(Prodinfo prodinfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			prodinfo.setCreateBy(user);
		}
        Page<Prodinfo> page = prodinfoService.find(new Page<Prodinfo>(request, response), prodinfo); 
        model.addAttribute("page", page);
		return "modules/sale/prod/prodinfoList";
	}

	@RequiresPermissions("sale:prod:prodinfo:view")
	@RequestMapping(value = "form")
	public String form(Prodinfo prodinfo, Model model) {
		model.addAttribute("prodinfo", prodinfo);
		return "modules/sale/prod/prodinfoForm";
	}

	@RequiresPermissions("sale:prod:prodinfo:edit")
	@RequestMapping(value = "save")
	public String save(Prodinfo prodinfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, prodinfo)){
			return form(prodinfo, model);
		}
		prodinfoService.save(prodinfo);
		addMessage(redirectAttributes, "保存产品'" + prodinfo.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
	}
	
	@RequiresPermissions("sale:prod:prodinfo:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		prodinfoService.delete(id);
		addMessage(redirectAttributes, "删除产品成功");
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
	}

}
