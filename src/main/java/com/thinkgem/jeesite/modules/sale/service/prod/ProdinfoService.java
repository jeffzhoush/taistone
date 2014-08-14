/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.service.prod;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodinfo;
import com.thinkgem.jeesite.modules.sale.dao.prod.ProdinfoDao;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 商品信息Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class ProdinfoService extends BaseService {

	@Autowired
	private ProdinfoDao prodinfoDao;
	
	public Prodinfo get(String id) {
		return prodinfoDao.get(id);
	}
	
	public Page<Prodinfo> find(Page<Prodinfo> page, Prodinfo prodinfo) {
		DetachedCriteria dc = prodinfoDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(prodinfo.getName())){
			dc.add(Restrictions.like("name", "%"+prodinfo.getName()+"%"));
		}
		dc.add(Restrictions.eq(Prodinfo.FIELD_DEL_FLAG, Prodinfo.DEL_FLAG_NORMAL));
		
		//dc.addOrder(Order.desc("id"));
		return prodinfoDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Prodinfo prodinfo) {
		prodinfoDao.save(prodinfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		prodinfoDao.deleteById(id);
	}
	
	@Transactional(readOnly = false)
	 public Prodinfo getByName(String name) {
	  return prodinfoDao.findByName(name);
	 }
	
}
