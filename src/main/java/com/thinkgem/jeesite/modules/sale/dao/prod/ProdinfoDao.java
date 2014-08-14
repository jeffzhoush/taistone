/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.dao.prod;

import org.springframework.stereotype.Repository;

import com.thinkgem.jeesite.common.persistence.BaseDao;
import com.thinkgem.jeesite.common.persistence.Parameter;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodinfo;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 商品信息DAO接口
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Repository
public class ProdinfoDao extends BaseDao<Prodinfo> {
	public Prodinfo findByName(String name){
		  return getByHql("from Prodinfo where name = :p1 and delFlag = :p2", new Parameter(name, Prodinfo.DEL_FLAG_NORMAL));
	}
}
