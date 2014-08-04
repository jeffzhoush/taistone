/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.dao.prod;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thinkgem.jeesite.common.persistence.BaseDao;
import com.thinkgem.jeesite.common.persistence.Parameter;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodgroup;
import com.thinkgem.jeesite.modules.sys.entity.Dict;
import com.thinkgem.jeesite.modules.sys.entity.Menu;

/**
 * 产品层级DAO接口
 * @author JeffZhou
 * @version 2014-08-03
 */
@Repository
public class ProdgroupDao extends BaseDao<Prodgroup> {
	public List<Prodgroup> findAllList(){
		return find("from Prodgroup where delFlag=:p1 order by sort", new Parameter(Dict.DEL_FLAG_NORMAL));
	}
}
