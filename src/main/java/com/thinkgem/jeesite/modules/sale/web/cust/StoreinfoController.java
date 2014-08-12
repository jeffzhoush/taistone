/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.web.cust;

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
import com.thinkgem.jeesite.modules.sale.entity.cust.Storeinfo;
import com.thinkgem.jeesite.modules.sale.service.cust.StoreinfoService;

/**
 * 终端Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/cust/storeinfo")
public class StoreinfoController extends BaseController {

	@Autowired
	private StoreinfoService storeinfoService;
	
	@ModelAttribute
	public Storeinfo get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return storeinfoService.get(id);
		}else{
			return new Storeinfo();
		}
	}
	
	@RequiresPermissions("sale:cust:storeinfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(Storeinfo storeinfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			storeinfo.setCreateBy(user);
		}
        Page<Storeinfo> page = storeinfoService.find(new Page<Storeinfo>(request, response), storeinfo); 
        model.addAttribute("page", page);
		return "modules/sale/cust/storeinfoList";
	}

	@RequiresPermissions("sale:cust:storeinfo:view")
	@RequestMapping(value = "form")
	public String form(Storeinfo storeinfo, Model model) {
		model.addAttribute("storeinfo", storeinfo);
		return "modules/sale/cust/storeinfoForm";
	}

	@RequiresPermissions("sale:cust:storeinfo:edit")
	@RequestMapping(value = "save")
	public String save(Storeinfo storeinfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, storeinfo)){
			return form(storeinfo, model);
		}
		storeinfoService.save(storeinfo);
		addMessage(redirectAttributes, "保存终端'" + storeinfo.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/cust/storeinfo/?repage";
	}
	
	@RequiresPermissions("sale:cust:storeinfo:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		storeinfoService.delete(id);
		addMessage(redirectAttributes, "删除终端成功");
		return "redirect:"+Global.getAdminPath()+"/sale/cust/storeinfo/?repage";
	}

}
