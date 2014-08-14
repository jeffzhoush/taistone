/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.service.visit;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sale.entity.visit.Visitplan;
import com.thinkgem.jeesite.modules.sale.dao.visit.VisitplanDao;

/**
 * 拜访计划Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class VisitplanService extends BaseService {

	@Autowired
	private VisitplanDao visitplanDao;
	
	public Visitplan get(String id) {
		return visitplanDao.get(id);
	}
	
	public Page<Visitplan> find(Page<Visitplan> page, Visitplan visitplan) {
		DetachedCriteria dc = visitplanDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(visitplan.getName())){
			dc.add(Restrictions.like("name", "%"+visitplan.getName()+"%"));
		}
		dc.add(Restrictions.eq(Visitplan.FIELD_DEL_FLAG, Visitplan.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return visitplanDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Visitplan visitplan) {
		visitplanDao.save(visitplan);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		visitplanDao.deleteById(id);
	}
	
}
