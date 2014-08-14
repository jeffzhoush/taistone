/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.service.market;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sale.entity.market.Applicationstoredisplay;
import com.thinkgem.jeesite.modules.sale.dao.market.ApplicationstoredisplayDao;

/**
 * 特陈计划Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class ApplicationstoredisplayService extends BaseService {

	@Autowired
	private ApplicationstoredisplayDao applicationstoredisplayDao;
	
	public Applicationstoredisplay get(String id) {
		return applicationstoredisplayDao.get(id);
	}
	
	public Page<Applicationstoredisplay> find(Page<Applicationstoredisplay> page, Applicationstoredisplay applicationstoredisplay) {
		DetachedCriteria dc = applicationstoredisplayDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(applicationstoredisplay.getName())){
			dc.add(Restrictions.like("name", "%"+applicationstoredisplay.getName()+"%"));
		}
		dc.add(Restrictions.eq(Applicationstoredisplay.FIELD_DEL_FLAG, Applicationstoredisplay.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return applicationstoredisplayDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Applicationstoredisplay applicationstoredisplay) {
		applicationstoredisplayDao.save(applicationstoredisplay);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		applicationstoredisplayDao.deleteById(id);
	}
	
}
