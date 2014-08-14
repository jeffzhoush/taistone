/**
 * Copyright &copy; 2012-2013 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.thinkgem.jeesite.common.utils.excel.fieldtype;

import com.thinkgem.jeesite.modules.sale.entity.prod.Prodgroup;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;

/**
 * 字段类型转换
 * @author jeff.zou
 * @version 2014-08-13
 */
public class ProdgroupType {
	
	/**
	 * 获取对象值（导入）
	 */
	public static Object getValue(String val) {
		for (Prodgroup e : UserUtils.getProdgroupList()){
			if (val.equals(e.getName())){
				return e;
			}
		}
		return null;
	}

	/**
	 * 设置对象值（导出）
	 */
	public static String setValue(Object val) {
		if (val != null && ((Prodgroup)val).getName() != null){
			return ((Prodgroup)val).getName();
		}
		return "";
	}
}
