/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.service.prod;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodgroup;
import com.thinkgem.jeesite.modules.sale.dao.prod.ProdgroupDao;
import com.thinkgem.jeesite.modules.sys.entity.Menu;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;

/**
 * 产品层级Service
 * @author JeffZhou
 * @version 2014-08-03
 */
@Component
@Transactional(readOnly = true)
public class ProdgroupService extends BaseService {

	@Autowired
	private ProdgroupDao prodgroupDao;
	
	public Prodgroup get(String id) {
		return prodgroupDao.get(id);
	}
	
	public Page<Prodgroup> find(Page<Prodgroup> page, Prodgroup prodgroup) {
		DetachedCriteria dc = prodgroupDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(prodgroup.getName())){
			dc.add(Restrictions.like("name", "%"+prodgroup.getName()+"%"));
		}
		dc.add(Restrictions.eq(Prodgroup.FIELD_DEL_FLAG, Prodgroup.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return prodgroupDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Prodgroup prodgroup) {
		prodgroupDao.save(prodgroup);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		prodgroupDao.deleteById(id);
	}
	
	public List<Prodgroup> findAllProdgroup(){
		return prodgroupDao.findAllList();
	}
	
}
