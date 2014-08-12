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
import com.thinkgem.jeesite.modules.sale.entity.cust.Customerinfo;
import com.thinkgem.jeesite.modules.sale.service.cust.CustomerinfoService;

/**
 * 客户Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/cust/customerinfo")
public class CustomerinfoController extends BaseController {

	@Autowired
	private CustomerinfoService customerinfoService;
	
	@ModelAttribute
	public Customerinfo get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return customerinfoService.get(id);
		}else{
			return new Customerinfo();
		}
	}
	
	@RequiresPermissions("sale:cust:customerinfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(Customerinfo customerinfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			customerinfo.setCreateBy(user);
		}
        Page<Customerinfo> page = customerinfoService.find(new Page<Customerinfo>(request, response), customerinfo); 
        model.addAttribute("page", page);
		return "modules/sale/cust/customerinfoList";
	}

	@RequiresPermissions("sale:cust:customerinfo:view")
	@RequestMapping(value = "form")
	public String form(Customerinfo customerinfo, Model model) {
		model.addAttribute("customerinfo", customerinfo);
		return "modules/sale/cust/customerinfoForm";
	}

	@RequiresPermissions("sale:cust:customerinfo:edit")
	@RequestMapping(value = "save")
	public String save(Customerinfo customerinfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, customerinfo)){
			return form(customerinfo, model);
		}
		customerinfoService.save(customerinfo);
		addMessage(redirectAttributes, "保存客户'" + customerinfo.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/cust/customerinfo/?repage";
	}
	
	@RequiresPermissions("sale:cust:customerinfo:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		customerinfoService.delete(id);
		addMessage(redirectAttributes, "删除客户成功");
		return "redirect:"+Global.getAdminPath()+"/sale/cust/customerinfo/?repage";
	}

}
