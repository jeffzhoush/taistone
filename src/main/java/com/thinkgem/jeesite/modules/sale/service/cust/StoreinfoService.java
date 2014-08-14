/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.service.cust;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sale.entity.cust.Storeinfo;
import com.thinkgem.jeesite.modules.sale.dao.cust.StoreinfoDao;

/**
 * 终端Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class StoreinfoService extends BaseService {

	@Autowired
	private StoreinfoDao storeinfoDao;
	
	public Storeinfo get(String id) {
		return storeinfoDao.get(id);
	}
	
	public Page<Storeinfo> find(Page<Storeinfo> page, Storeinfo storeinfo) {
		DetachedCriteria dc = storeinfoDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(storeinfo.getName())){
			dc.add(Restrictions.like("name", "%"+storeinfo.getName()+"%"));
		}
		dc.add(Restrictions.eq(Storeinfo.FIELD_DEL_FLAG, Storeinfo.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return storeinfoDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Storeinfo storeinfo) {
		storeinfoDao.save(storeinfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		storeinfoDao.deleteById(id);
	}
	
}
