/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.demo.sfd.service;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.demo.sfd.entity.Workreport;
import com.demo.sfd.dao.WorkreportDao;

/**
 * 工作汇报Service
 * @author jeff.zhou
 * @version 2014-08-18
 */
@Component
@Transactional(readOnly = true)
public class WorkreportService extends BaseService {

	@Autowired
	private WorkreportDao workreportDao;
	
	public Workreport get(String id) {
		return workreportDao.get(id);
	}
	
	public Page<Workreport> find(Page<Workreport> page, Workreport workreport) {
		DetachedCriteria dc = workreportDao.createDetachedCriteria();
		
		dc.add(Restrictions.eq(Workreport.FIELD_DEL_FLAG, Workreport.DEL_FLAG_NORMAL));
		
		if (StringUtils.isNotEmpty(workreport.getReportType())){
			dc.add(Restrictions.eq("reportType", workreport.getReportType()));
		}

		if(workreport.getCreateDateStart()!=null) {
			dc.add(Restrictions.ge("submitTime", workreport.getCreateDateStart()));
		} 
		if(workreport.getCreateDateEnd()!=null) {
			dc.add(Restrictions.le("submitTime", workreport.getCreateDateEnd()));
		}
		
		
		dc.createAlias("user", "user");
		if (workreport.getUser()!=null && StringUtils.isNotEmpty(workreport.getUser().getName())){
			dc.add(Restrictions.ilike("user.name", "%"+workreport.getUser().getName()+"%"));
		}
		if (workreport.getUser()!=null && StringUtils.isNotEmpty(workreport.getUser().getMobile())){
			dc.add(Restrictions.ilike("user.mobile", "%"+workreport.getUser().getMobile() +"%"));
		}
		// 部门
		if(workreport.getUser()!=null && workreport.getUser().getOffice()!=null && StringUtils.isNotEmpty(workreport.getUser().getOffice().getId())){
			dc.add(Restrictions.or(
					Restrictions.eq("user.office.id", workreport.getUser().getOffice().getId())
					//,Restrictions.like("user.office.parentIds", "%,"+workreport.getUser().getOffice().getId()+",%")
					));
		}
				
		
		dc.addOrder(Order.desc("id"));
		return workreportDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Workreport workreport) {
		workreportDao.save(workreport);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		workreportDao.deleteById(id);
	}
	
}
