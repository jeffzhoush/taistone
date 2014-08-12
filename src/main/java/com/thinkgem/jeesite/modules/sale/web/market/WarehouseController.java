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
import com.thinkgem.jeesite.modules.sale.entity.market.Warehouse;
import com.thinkgem.jeesite.modules.sale.service.market.WarehouseService;

/**
 * 仓库Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/market/warehouse")
public class WarehouseController extends BaseController {

	@Autowired
	private WarehouseService warehouseService;
	
	@ModelAttribute
	public Warehouse get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return warehouseService.get(id);
		}else{
			return new Warehouse();
		}
	}
	
	@RequiresPermissions("sale:market:warehouse:view")
	@RequestMapping(value = {"list", ""})
	public String list(Warehouse warehouse, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			warehouse.setCreateBy(user);
		}
        Page<Warehouse> page = warehouseService.find(new Page<Warehouse>(request, response), warehouse); 
        model.addAttribute("page", page);
		return "modules/sale/market/warehouseList";
	}

	@RequiresPermissions("sale:market:warehouse:view")
	@RequestMapping(value = "form")
	public String form(Warehouse warehouse, Model model) {
		model.addAttribute("warehouse", warehouse);
		return "modules/sale/market/warehouseForm";
	}

	@RequiresPermissions("sale:market:warehouse:edit")
	@RequestMapping(value = "save")
	public String save(Warehouse warehouse, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, warehouse)){
			return form(warehouse, model);
		}
		warehouseService.save(warehouse);
		addMessage(redirectAttributes, "保存仓库'" + warehouse.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/warehouse/?repage";
	}
	
	@RequiresPermissions("sale:market:warehouse:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		warehouseService.delete(id);
		addMessage(redirectAttributes, "删除仓库成功");
		return "redirect:"+Global.getAdminPath()+"/sale/market/warehouse/?repage";
	}

}
