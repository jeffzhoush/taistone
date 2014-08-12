/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.web.market;

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
import com.thinkgem.jeesite.modules.sale.entity.market.Applicationstoredisplay;
import com.thinkgem.jeesite.modules.sale.service.market.ApplicationstoredisplayService;

/**
 * 特陈计划Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/market/applicationstoredisplay")
public class ApplicationstoredisplayController extends BaseController {

	@Autowired
	private ApplicationstoredisplayService applicationstoredisplayService;
	
	@ModelAttribute
	public Applicationstoredisplay get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return applicationstoredisplayService.get(id);
		}else{
			return new Applicationstoredisplay();
		}
	}
	
	@RequiresPermissions("sale:market:applicationstoredisplay:view")
	@RequestMapping(value = {"list", ""})
	public String list(Applicationstoredisplay applicationstoredisplay, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			applicationstoredisplay.setCreateBy(user);
		}
        Page<Applicationstoredisplay> page = applicationstoredisplayService.find(new Page<Applicationstoredisplay>(request, response), applicationstoredisplay); 
        model.addAttribute("page", page);
		return "modules/sale/market/applicationstoredisplayList";
	}

	@RequiresPermissions("sale:market:applicationstoredisplay:view")
	@RequestMapping(value = "form")
	public String form(Applicationstoredisplay applicationstoredisplay, Model model) {
		model.addAttribute("applicationstoredisplay", applicationstoredisplay);
		return "modules/sale/market/applicationstoredisplayForm";
	}

	@RequiresPermissions("sale:market:applicationstoredisplay:edit")
	@RequestMapping(value = "save")
	public String save(Applicationstoredisplay applicationstoredisplay, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, applicationstoredisplay)){
			return form(applicationstoredisplay, model);
		}
		applicationstoredisplayService.save(applicationstoredisplay);
		addMessage(redirectAttributes, "保存特陈计划'" + applicationstoredisplay.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/applicationstoredisplay/?repage";
	}
	
	@RequiresPermissions("sale:market:applicationstoredisplay:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		applicationstoredisplayService.delete(id);
		addMessage(redirectAttributes, "删除特陈计划成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/applicationstoredisplay/?repage";
	}

}
