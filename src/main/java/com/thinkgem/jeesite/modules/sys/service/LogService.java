/**
 * Copyright &copy; 2012-2013 <a href="httparamMap://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.thinkgem.jeesite.modules.sys.service;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.DateUtils;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sys.dao.LogDao;
import com.thinkgem.jeesite.modules.sys.entity.Log;

/**
 * 日志Service
 * @author ThinkGem
 * @version 2013-6-2
 */
@Service
@Transactional(readOnly = true)
public class LogService extends BaseService {

	@Autowired
	private LogDao logDao;
	
	public Log get(String id) {
		return logDao.get(id);
	}
	
	@Transactional(readOnly = false)
	public void save(Log entity){
		logDao.save(entity);
	}
	
	public Page<Log> find(Page<Log> page, Map<String, Object> paramMap) {
		DetachedCriteria dc = logDao.createDetachedCriteria();

		/*Long createById = StringUtils.toLong(paramMap.get("createById"));
		if (createById > 0){
			dc.add(Restrictions.eq("createBy.id", createById));  //特殊情况，如果是对引用对象的id查询，则可以不用建立引用，也就是可以不调用createAlias()语句
		}*/
		
		dc.createAlias("createBy", "u");
		String createByName = ObjectUtils.toString(paramMap.get("createByName"));
		if (StringUtils.isNotBlank(createByName)){
			dc.add(Restrictions.like("u.name", "%"+createByName+"%"));
		}
		
		//如果是按照部门名称查询， 需要从createBy->u->office连起来定义createAlias.
		/*dc.createAlias("u.office", "office");
		String officeName = ObjectUtils.toString(paramMap.get("officeName"));
		if (StringUtils.isNotBlank(officeName)){
			dc.add(Restrictions.like("office.name", "%"+officeName+"%"));
		}*/
		
		
		
		String requestUri = ObjectUtils.toString(paramMap.get("requestUri"));
		if (StringUtils.isNotBlank(requestUri)){
			dc.add(Restrictions.like("requestUri", "%"+requestUri+"%"));
		}

		String exception = ObjectUtils.toString(paramMap.get("exception"));
		if (StringUtils.isNotBlank(exception)){
			dc.add(Restrictions.eq("type", Log.TYPE_EXCEPTION));
		}
		
		Date beginDate = DateUtils.parseDate(paramMap.get("beginDate"));
		if (beginDate == null){
			beginDate = DateUtils.setDays(new Date(), 1);
			paramMap.put("beginDate", DateUtils.formatDate(beginDate, "yyyy-MM-dd"));
		}
		Date endDate = DateUtils.parseDate(paramMap.get("endDate"));
		if (endDate == null){
			endDate = DateUtils.addDays(DateUtils.addMonths(beginDate, 1), -1);
			paramMap.put("endDate", DateUtils.formatDate(endDate, "yyyy-MM-dd"));
		}else{
			endDate=new Date(endDate.getTime()+24*60*60*1000); // 结束时间+1天
		}
		dc.add(Restrictions.between("createDate", beginDate, endDate));
		
		dc.addOrder(Order.desc("createDate"));
		return logDao.find(page, dc);
	}
	
}
