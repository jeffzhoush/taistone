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
import com.thinkgem.jeesite.modules.sale.entity.market.Storeprodrel;
import com.thinkgem.jeesite.modules.sale.service.market.StoreprodrelService;

/**
 * 陈列Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/market/storeprodrel")
public class StoreprodrelController extends BaseController {

	@Autowired
	private StoreprodrelService storeprodrelService;
	
	@ModelAttribute
	public Storeprodrel get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return storeprodrelService.get(id);
		}else{
			return new Storeprodrel();
		}
	}
	
	@RequiresPermissions("sale:market:storeprodrel:view")
	@RequestMapping(value = {"list", ""})
	public String list(Storeprodrel storeprodrel, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			storeprodrel.setCreateBy(user);
		}
        Page<Storeprodrel> page = storeprodrelService.find(new Page<Storeprodrel>(request, response), storeprodrel); 
        model.addAttribute("page", page);
		return "modules/sale/market/storeprodrelList";
	}

	@RequiresPermissions("sale:market:storeprodrel:view")
	@RequestMapping(value = "form")
	public String form(Storeprodrel storeprodrel, Model model) {
		model.addAttribute("storeprodrel", storeprodrel);
		return "modules/sale/market/storeprodrelForm";
	}

	@RequiresPermissions("sale:market:storeprodrel:edit")
	@RequestMapping(value = "save")
	public String save(Storeprodrel storeprodrel, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, storeprodrel)){
			return form(storeprodrel, model);
		}
		storeprodrelService.save(storeprodrel);
		addMessage(redirectAttributes, "保存陈列'" + storeprodrel.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/storeprodrel/?repage";
	}
	
	@RequiresPermissions("sale:market:storeprodrel:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		storeprodrelService.delete(id);
		addMessage(redirectAttributes, "删除陈列成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/storeprodrel/?repage";
	}

}
