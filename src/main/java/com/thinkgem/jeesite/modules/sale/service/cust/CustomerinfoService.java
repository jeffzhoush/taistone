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
import com.thinkgem.jeesite.modules.sale.entity.cust.Customerinfo;
import com.thinkgem.jeesite.modules.sale.dao.cust.CustomerinfoDao;

/**
 * 客户Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class CustomerinfoService extends BaseService {

	@Autowired
	private CustomerinfoDao customerinfoDao;
	
	public Customerinfo get(String id) {
		return customerinfoDao.get(id);
	}
	
	public Page<Customerinfo> find(Page<Customerinfo> page, Customerinfo customerinfo) {
		DetachedCriteria dc = customerinfoDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(customerinfo.getName())){
			dc.add(Restrictions.like("name", "%"+customerinfo.getName()+"%"));
		}
		dc.add(Restrictions.eq(Customerinfo.FIELD_DEL_FLAG, Customerinfo.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return customerinfoDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Customerinfo customerinfo) {
		customerinfoDao.save(customerinfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		customerinfoDao.deleteById(id);
	}
	
}
