/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.web.prod;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.beanvalidator.BeanValidators;
import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.DateUtils;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.utils.excel.ExportExcel;
import com.thinkgem.jeesite.common.utils.excel.ImportExcel;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.service.SystemService;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodinfo;
import com.thinkgem.jeesite.modules.sale.service.prod.ProdinfoService;

/**
 * 商品信息Controller
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Controller
@RequestMapping(value = "${adminPath}/sale/prod/prodinfo")
public class ProdinfoController extends BaseController {

	@Autowired
	private ProdinfoService prodinfoService;
	
	@ModelAttribute
	public Prodinfo get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return prodinfoService.get(id);
		}else{
			return new Prodinfo();
		}
	}
	
	@RequiresPermissions("sale:prod:prodinfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(Prodinfo prodinfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			prodinfo.setCreateBy(user);
		}
        Page<Prodinfo> page = prodinfoService.find(new Page<Prodinfo>(request, response), prodinfo); 
        model.addAttribute("page", page);
		return "modules/sale/prod/prodinfoList";
	}

	@RequiresPermissions("sale:prod:prodinfo:view")
	@RequestMapping(value = "form")
	public String form(Prodinfo prodinfo, Model model) {
		model.addAttribute("prodinfo", prodinfo);
		return "modules/sale/prod/prodinfoForm";
	}

	@RequiresPermissions("sale:prod:prodinfo:edit")
	@RequestMapping(value = "save")
	public String save(Prodinfo prodinfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, prodinfo)){
			return form(prodinfo, model);
		}
		prodinfoService.save(prodinfo);
		addMessage(redirectAttributes, "保存商品信息'" + prodinfo.getName() + "'成功");
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
	}
	
	@RequiresPermissions("sale:prod:prodinfo:edit")
	@RequestMapping(value = "delete")
	public String delete(String id, RedirectAttributes redirectAttributes) {
		prodinfoService.delete(id);
		addMessage(redirectAttributes, "删除商品信息成功");
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
	}
	
	@ResponseBody
	 @RequiresPermissions("sale:prod:prodinfo:edit")
	 @RequestMapping(value = "checkNameUnique")
	 public String checkNameUnique(String oldName, String name) {
	  if (name !=null && name.equals(oldName)) {
	   return "true";
	  } else if (name !=null && prodinfoService.getByName(name) == null) {
	   return "true";
	  }
	  return "false";
	 }
	
	
	@RequiresPermissions("sale:prod:prodinfo:view")
    @RequestMapping(value = "export", method=RequestMethod.POST)
    public String exportFile(Prodinfo prodinfo, HttpServletRequest request, HttpServletResponse response, RedirectAttributes redirectAttributes) {
		try {
            String fileName = "用户数据"+DateUtils.getDate("yyyyMMddHHmmss")+".xlsx"; 
    		//Page<User> page = systemService.findUser(new Page<User>(request, response, -1), user); 
    		Page<Prodinfo> page = prodinfoService.find(new Page<Prodinfo>(request, response), prodinfo); 
    		new ExportExcel("商品信息数据", Prodinfo.class).setDataList(page.getList()).write(response, fileName).dispose();
    		return null;
		} catch (Exception e) {
			addMessage(redirectAttributes, "导出商品信息失败！失败信息："+e.getMessage());
		}
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
    }
	
	
	@RequiresPermissions("sale:prod:prodinfo:edit")
    @RequestMapping(value = "import", method=RequestMethod.POST)
    public String importFile(MultipartFile file, RedirectAttributes redirectAttributes) {
		if(Global.isDemoMode()){
			addMessage(redirectAttributes, "演示模式，不允许操作！");
			return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
		}
		try {
			int successNum = 0;
			int failureNum = 0;
			StringBuilder failureMsg = new StringBuilder();
			ImportExcel ei = new ImportExcel(file, 1, 0);
			List<Prodinfo> list = ei.getDataList(Prodinfo.class);
			for (Prodinfo prodinfo : list){
				try{
					if ("true".equals(checkProdinfo(prodinfo)) ){ 
						BeanValidators.validateWithException(validator, prodinfo);
						prodinfoService.save(prodinfo);
						successNum++;
					}else{
						failureMsg.append("<br/>数据无效!名称 "+prodinfo.getName()+" ; ");
						failureNum++;
					}
				}catch(ConstraintViolationException ex){
					failureMsg.append("<br/>名称 "+prodinfo.getName()+" 导入失败：");
					List<String> messageList = BeanValidators.extractPropertyAndMessageAsList(ex, ": ");
					for (String message : messageList){
						failureMsg.append(message+"; ");
						failureNum++;
					}
				}catch (Exception ex) {
					failureMsg.append("<br/>名称 "+prodinfo.getName()+" 导入失败："+ex.getMessage());
				}
			}
			if (failureNum>0){
				failureMsg.insert(0, "，失败 "+failureNum+" 条数据，导入信息如下：");
			}
			addMessage(redirectAttributes, "已成功导入 "+successNum+" 条用户"+failureMsg);
		} catch (Exception e) {
			addMessage(redirectAttributes, "导入数据失败！失败信息："+e.getMessage());
		}
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
    }
	
	@RequiresPermissions("sale:prod:prodinfo:view")
    @RequestMapping(value = "import/template")
    public String importFileTemplate(HttpServletResponse response, RedirectAttributes redirectAttributes) {
		try {
            String fileName = "商品信息数据导入模板.xlsx";
    		List<Prodinfo> list = Lists.newArrayList(); list.add(new Prodinfo());
    		new ExportExcel("商品信息数据", Prodinfo.class, 2).setDataList(list).write(response, fileName).dispose();
    		return null;
		} catch (Exception e) {
			addMessage(redirectAttributes, "导入模板下载失败！失败信息："+e.getMessage());
		}
		return "redirect:"+Global.getAdminPath()+"/sale/prod/prodinfo/?repage";
    }
	
	//根据后台数据，验证当前导入数据是否能导入
	public String checkProdinfo(Prodinfo prodinfo) {
		if(!StringUtils.isBlank( prodinfo.getName())){
			return "true";
		}
		return "false";
		
	}

}
