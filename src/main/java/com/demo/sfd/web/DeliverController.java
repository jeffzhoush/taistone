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
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodinfo;
import com.thinkgem.jeesite.modules.sale.service.prod.ProdinfoService;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import com.demo.sfd.entity.Deliver;
import com.demo.sfd.service.DeliverService;

/**
 * 配送单Controller
 * @author jeff.zhou
 * @version 2014-08-18
 */
@Controller
@RequestMapping(value = "${adminPath}/sfd/deliver")
public class DeliverController extends BaseController {

	@Autowired
	private DeliverService deliverService;
	
	@Autowired
	private ProdinfoService prodinfoService;	
	
	@ModelAttribute
	public Deliver get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return deliverService.get(id);
		}else{
			return new Deliver();
		}
	}
	
	@RequiresPermissions("sfd:deliver:view")
	@RequestMapping(value = {"list", ""})
	public String list(Deliver deliver, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			deliver.setCreateBy(user);
		}
        Page<Deliver> page = deliverService.find(new Page<Deliver>(request, response), deliver); 
        model.addAttribute("page", page);
		return "demo/sfd/deliverList";
	}

	@RequiresPermissions("sfd:deliver:view")
	@RequestMapping(value = "form")
	public String form(Deliver deliver, Model model) {
		model.addAttribute("deliver", deliver);
		return "demo/sfd/deliverForm";
	}

	@RequiresPermissions("sfd:deliver:edit")
	@RequestMapping(value = "save")
	public String save(Deliver deliver, Model model, RedirectAttributes redirectAttributes,HttpServletRequest request) {
		Prodinfo prodinfo=prodinfoService.get(request.getParameter("deliver.prodinfo.id"));
		deliver.setProdinfo(prodinfo);
		if (!beanValidator(model, deliver)){
			return form(deliver, model);
		}
		
		deliverService.save(deliver);
		addMessage(redirectAttributes, "保存配送单'" + deliver.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sfd/deliver/?repage";
	}
	
	@RequiresPermissions("sfd:deliver:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		deliverService.delete(id);
		addMessage(redirectAttributes, "删除配送单成功");
		return "redirect:"+Global.getAdminPath()+"demo/sfd/deliver/?repage";
	}

}
