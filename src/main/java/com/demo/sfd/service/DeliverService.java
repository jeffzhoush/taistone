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
import com.thinkgem.jeesite.modules.sale.dao.prod.ProdinfoDao;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodinfo;
import com.demo.sfd.entity.Deliver;
import com.demo.sfd.dao.DeliverDao;

/**
 * 配送单Service
 * @author jeff.zhou
 * @version 2014-08-18
 */
@Component
@Transactional(readOnly = true)
public class DeliverService extends BaseService {

	@Autowired
	private DeliverDao deliverDao;
	@Autowired
	private ProdinfoDao prodinfoDao; 
	
	public Deliver get(String id) {
		return deliverDao.get(id);
	}
	
	public Page<Deliver> find(Page<Deliver> page, Deliver deliver) {
		DetachedCriteria dc = deliverDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(deliver.getName())){
			dc.add(Restrictions.like("name", "%"+deliver.getName()+"%"));
		}
		dc.add(Restrictions.eq(Deliver.FIELD_DEL_FLAG, Deliver.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return deliverDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Deliver deliver) {
		deliverDao.getSession().clear();
		deliverDao.save(deliver);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		deliverDao.deleteById(id);
	}
	
}
