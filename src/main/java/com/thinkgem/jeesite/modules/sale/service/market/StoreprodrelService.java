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
import com.thinkgem.jeesite.modules.sale.entity.market.Storeprodrel;
import com.thinkgem.jeesite.modules.sale.dao.market.StoreprodrelDao;

/**
 * 陈列Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class StoreprodrelService extends BaseService {

	@Autowired
	private StoreprodrelDao storeprodrelDao;
	
	public Storeprodrel get(String id) {
		return storeprodrelDao.get(id);
	}
	
	public Page<Storeprodrel> find(Page<Storeprodrel> page, Storeprodrel storeprodrel) {
		DetachedCriteria dc = storeprodrelDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(storeprodrel.getName())){
			dc.add(Restrictions.like("name", "%"+storeprodrel.getName()+"%"));
		}
		dc.add(Restrictions.eq(Storeprodrel.FIELD_DEL_FLAG, Storeprodrel.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return storeprodrelDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Storeprodrel storeprodrel) {
		storeprodrelDao.save(storeprodrel);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		storeprodrelDao.deleteById(id);
	}
	
}
