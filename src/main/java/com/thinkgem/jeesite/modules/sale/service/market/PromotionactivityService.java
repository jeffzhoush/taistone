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
import com.thinkgem.jeesite.modules.sale.entity.market.Promotionactivity;
import com.thinkgem.jeesite.modules.sale.dao.market.PromotionactivityDao;

/**
 * 促销活动Service
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Component
@Transactional(readOnly = true)
public class PromotionactivityService extends BaseService {

	@Autowired
	private PromotionactivityDao promotionactivityDao;
	
	public Promotionactivity get(String id) {
		return promotionactivityDao.get(id);
	}
	
	public Page<Promotionactivity> find(Page<Promotionactivity> page, Promotionactivity promotionactivity) {
		DetachedCriteria dc = promotionactivityDao.createDetachedCriteria();
		if (StringUtils.isNotEmpty(promotionactivity.getName())){
			dc.add(Restrictions.like("name", "%"+promotionactivity.getName()+"%"));
		}
		dc.add(Restrictions.eq(Promotionactivity.FIELD_DEL_FLAG, Promotionactivity.DEL_FLAG_NORMAL));
		dc.addOrder(Order.desc("id"));
		return promotionactivityDao.find(page, dc);
	}
	
	@Transactional(readOnly = false)
	public void save(Promotionactivity promotionactivity) {
		promotionactivityDao.save(promotionactivity);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		promotionactivityDao.deleteById(id);
	}
	
}
