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
import com.thinkgem.jeesite.modules.sale.entity.market.Carinfo;
import com.thinkgem.jeesite.modules.sale.service.market.CarinfoService;

/**
 * 车辆Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/market/carinfo")
public class CarinfoController extends BaseController {

	@Autowired
	private CarinfoService carinfoService;
	
	@ModelAttribute
	public Carinfo get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return carinfoService.get(id);
		}else{
			return new Carinfo();
		}
	}
	
	@RequiresPermissions("sale:market:carinfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(Carinfo carinfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			carinfo.setCreateBy(user);
		}
        Page<Carinfo> page = carinfoService.find(new Page<Carinfo>(request, response), carinfo); 
        model.addAttribute("page", page);
		return "modules/sale/market/carinfoList";
	}

	@RequiresPermissions("sale:market:carinfo:view")
	@RequestMapping(value = "form")
	public String form(Carinfo carinfo, Model model) {
		model.addAttribute("carinfo", carinfo);
		return "modules/sale/market/carinfoForm";
	}

	@RequiresPermissions("sale:market:carinfo:edit")
	@RequestMapping(value = "save")
	public String save(Carinfo carinfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, carinfo)){
			return form(carinfo, model);
		}
		carinfoService.save(carinfo);
		addMessage(redirectAttributes, "保存车辆'" + carinfo.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/carinfo/?repage";
	}
	
	@RequiresPermissions("sale:market:carinfo:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		carinfoService.delete(id);
		addMessage(redirectAttributes, "删除车辆成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/carinfo/?repage";
	}

}
