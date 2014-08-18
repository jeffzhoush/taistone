/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.demo.sfd.web;

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
import com.demo.sfd.entity.Workreport;
import com.demo.sfd.service.WorkreportService;

/**
 * 工作汇报Controller
 * @author jeff.zhou
 * @version 2014-08-18
 */
@Controller
@RequestMapping(value = "${adminPath}/sfd/workreport")
public class WorkreportController extends BaseController {

	@Autowired
	private WorkreportService workreportService;
	
	@ModelAttribute
	public Workreport get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return workreportService.get(id);
		}else{
			return new Workreport();
		}
	}
	
	@RequiresPermissions("sfd:workreport:view")
	@RequestMapping(value = {"list", ""})
	public String list(Workreport workreport, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			workreport.setCreateBy(user);
		}
        Page<Workreport> page = workreportService.find(new Page<Workreport>(request, response), workreport); 
        model.addAttribute("page", page);
		return "demo/sfd/workreportList";
	}

	@RequiresPermissions("sfd:workreport:view")
	@RequestMapping(value = "form")
	public String form(Workreport workreport, Model model) {
		model.addAttribute("workreport", workreport);
		return "demo/sfd/workreportForm";
	}

	@RequiresPermissions("sfd:workreport:edit")
	@RequestMapping(value = "save")
	public String save(Workreport workreport, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, workreport)){
			return form(workreport, model);
		}
		workreportService.save(workreport);
		addMessage(redirectAttributes, "保存工作汇报'" + workreport.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"demo/sfd/workreport/?repage";
	}
	
	@RequiresPermissions("sfd:workreport:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		workreportService.delete(id);
		addMessage(redirectAttributes, "删除工作汇报成功");
		return "redirect:"+Global.getAdminPath()+"demo/sfd/workreport/?repage";
	}

}
