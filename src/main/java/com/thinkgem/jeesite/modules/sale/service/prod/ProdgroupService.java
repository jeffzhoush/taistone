/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.service.prod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodgroup;
import com.thinkgem.jeesite.modules.sale.dao.prod.ProdgroupDao;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;

/**
 * 商品类型Service
 * @author jeff.zhou
 * @version 2014-08-12
 */
@Component
@Transactional(readOnly = true)
public class ProdgroupService extends BaseService {

	@Autowired
	private ProdgroupDao prodgroupDao;
	
	public Prodgroup get(String id) {
		return prodgroupDao.get(id);
	}
	
	public List<Prodgroup> findAll(){
		return prodgroupDao.findAllList();
	}

	@Transactional(readOnly = false)
	public void save(Prodgroup prodgroup) {
		prodgroup.setParent(this.get(prodgroup.getParent().getId()));
		String oldParentIds = prodgroup.getParentIds(); // 获取修改前的parentIds，用于更新子节点的parentIds
		prodgroup.setParentIds(prodgroup.getParent().getParentIds()+prodgroup.getParent().getId()+",");
		prodgroupDao.clear();
		prodgroupDao.save(prodgroup);
		// 更新子节点 parentIds
		List<Prodgroup> list = prodgroupDao.findByParentIdsLike("%,"+prodgroup.getId()+",%");
		for (Prodgroup e : list){
			e.setParentIds(e.getParentIds().replace(oldParentIds, prodgroup.getParentIds()));
		}
		prodgroupDao.save(list);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id) {
		prodgroupDao.deleteById(id, "%,"+id+",%");
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
}