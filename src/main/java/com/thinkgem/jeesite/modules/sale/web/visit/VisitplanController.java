/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.web.visit;

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
import com.thinkgem.jeesite.modules.sale.entity.visit.Visitplan;
import com.thinkgem.jeesite.modules.sale.service.visit.VisitplanService;

/**
 * 拜访计划Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/visit/visitplan")
public class VisitplanController extends BaseController {

	@Autowired
	private VisitplanService visitplanService;
	
	@ModelAttribute
	public Visitplan get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return visitplanService.get(id);
		}else{
			return new Visitplan();
		}
	}
	
	@RequiresPermissions("sale:visit:visitplan:view")
	@RequestMapping(value = {"list", ""})
	public String list(Visitplan visitplan, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			visitplan.setCreateBy(user);
		}
        Page<Visitplan> page = visitplanService.find(new Page<Visitplan>(request, response), visitplan); 
        model.addAttribute("page", page);
		return "modules/sale/visit/visitplanList";
	}

	@RequiresPermissions("sale:visit:visitplan:view")
	@RequestMapping(value = "form")
	public String form(Visitplan visitplan, Model model) {
		model.addAttribute("visitplan", visitplan);
		return "modules/sale/visit/visitplanForm";
	}

	@RequiresPermissions("sale:visit:visitplan:edit")
	@RequestMapping(value = "save")
	public String save(Visitplan visitplan, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, visitplan)){
			return form(visitplan, model);
		}
		visitplanService.save(visitplan);
		addMessage(redirectAttributes, "保存拜访计划'" + visitplan.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/visit/visitplan/?repage";
	}
	
	@RequiresPermissions("sale:visit:visitplan:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		visitplanService.delete(id);
		addMessage(redirectAttributes, "删除拜访计划成功");
		return "redirect:"+Global.getAdminPath()+"/sale/visit/visitplan/?repage";
	}

}
