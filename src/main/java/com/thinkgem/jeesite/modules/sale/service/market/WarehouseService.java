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
import com.thinkgem.jeesite.modules.sale.entity.market.Warehouse;
import com.thinkgem.jeesite.modules.sale.dao.market.WarehouseDao;

/**
 * 仓库Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class WarehouseService extends BaseService {

	@Autowired
	private WarehouseDao warehouseDao;
	
	public Warehouse get(String id) {
		return warehouseDao.get(id);
	}
	
	public Page<Warehouse> find(Page<Warehouse> page, Warehouse warehouse) {
		DetachedCriteria dc = warehouseDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(warehouse.getName())){
			dc.add(Restrictions.like("name", "%"+warehouse.getName()+"%"));
		}
		dc.add(Restrictions.eq(Warehouse.FIELD_DEL_FLAG, Warehouse.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return warehouseDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Warehouse warehouse) {
		warehouseDao.save(warehouse);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		warehouseDao.deleteById(id);
	}
	
}
