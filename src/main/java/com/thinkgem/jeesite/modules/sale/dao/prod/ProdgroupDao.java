/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.dao.prod;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thinkgem.jeesite.common.persistence.BaseDao;
import com.thinkgem.jeesite.common.persistence.Parameter;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodgroup;

/**
 * 商品类型DAO接口
 * @author jeff.zhou
 * @version 2014-08-12
 */
@Repository
public class ProdgroupDao extends BaseDao<Prodgroup> {
	
	public List<Prodgroup> findByParentIdsLike(String parentIds){
		return find("from Prodgroup where parentIds like :p1", new Parameter(parentIds));
	}

	public List<Prodgroup> findAllList(){
		return find("from Prodgroup where delFlag=:p1 order by code", new Parameter(Prodgroup.DEL_FLAG_NORMAL));
	}
	
	public List<Prodgroup> findAllChild(Long parentId, String likeParentIds){
		return find("from Prodgroup where delFlag=:p1 and (id=:p2 or parent.id=:p2 or parentIds like :p3) order by code", 
				new Parameter(Prodgroup.DEL_FLAG_NORMAL, parentId, likeParentIds));
	}
}
