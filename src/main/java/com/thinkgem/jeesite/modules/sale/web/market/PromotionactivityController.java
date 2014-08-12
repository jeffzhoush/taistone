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
import com.thinkgem.jeesite.modules.sale.entity.market.Promotionactivity;
import com.thinkgem.jeesite.modules.sale.service.market.PromotionactivityService;

/**
 * 促销活动Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/market/promotionactivity")
public class PromotionactivityController extends BaseController {

	@Autowired
	private PromotionactivityService promotionactivityService;
	
	@ModelAttribute
	public Promotionactivity get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return promotionactivityService.get(id);
		}else{
			return new Promotionactivity();
		}
	}
	
	@RequiresPermissions("sale:market:promotionactivity:view")
	@RequestMapping(value = {"list", ""})
	public String list(Promotionactivity promotionactivity, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			promotionactivity.setCreateBy(user);
		}
        Page<Promotionactivity> page = promotionactivityService.find(new Page<Promotionactivity>(request, response), promotionactivity); 
        model.addAttribute("page", page);
		return "modules/sale/market/promotionactivityList";
	}

	@RequiresPermissions("sale:market:promotionactivity:view")
	@RequestMapping(value = "form")
	public String form(Promotionactivity promotionactivity, Model model) {
		model.addAttribute("promotionactivity", promotionactivity);
		return "modules/sale/market/promotionactivityForm";
	}

	@RequiresPermissions("sale:market:promotionactivity:edit")
	@RequestMapping(value = "save")
	public String save(Promotionactivity promotionactivity, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, promotionactivity)){
			return form(promotionactivity, model);
		}
		promotionactivityService.save(promotionactivity);
		addMessage(redirectAttributes, "保存促销活动'" + promotionactivity.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/promotionactivity/?repage";
	}
	
	@RequiresPermissions("sale:market:promotionactivity:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		promotionactivityService.delete(id);
		addMessage(redirectAttributes, "删除促销活动成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/promotionactivity/?repage";
	}

}
