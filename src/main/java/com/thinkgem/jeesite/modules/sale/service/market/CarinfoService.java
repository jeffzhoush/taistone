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
import com.thinkgem.jeesite.modules.sale.entity.market.Carinfo;
import com.thinkgem.jeesite.modules.sale.dao.market.CarinfoDao;

/**
 * 车辆Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class CarinfoService extends BaseService {

	@Autowired
	private CarinfoDao carinfoDao;
	
	public Carinfo get(String id) {
		return carinfoDao.get(id);
	}
	
	public Page<Carinfo> find(Page<Carinfo> page, Carinfo carinfo) {
		DetachedCriteria dc = carinfoDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(carinfo.getName())){
			dc.add(Restrictions.like("name", "%"+carinfo.getName()+"%"));
		}
		dc.add(Restrictions.eq(Carinfo.FIELD_DEL_FLAG, Carinfo.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return carinfoDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Carinfo carinfo) {
		carinfoDao.save(carinfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		carinfoDao.deleteById(id);
	}
	
}
