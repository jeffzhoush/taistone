/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.entity.market;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.persistence.IdEntity;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 促销活动Entity
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Entity
@Table(name = "sale_market_promotionactivity")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Promotionactivity extends IdEntity<Promotionactivity> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 名称

	private Date startdate; // 促销开始日期
	private Date enddate ; // 促销结束日期
	private Double storeareamax ; // 终端最大面积
	private Double storeareamin ; // 终端最小面积
	
	public Promotionactivity() {
		super();
	}

	public Promotionactivity(String id){
		this();
		this.id = id;
	}
	

	@Length(min=1, max=200)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Double getStoreareamax() {
		return storeareamax;
	}

	public void setStoreareamax(Double storeareamax) {
		this.storeareamax = storeareamax;
	}

	public Double getStoreareamin() {
		return storeareamin;
	}

	public void setStoreareamin(Double storeareamin) {
		this.storeareamin = storeareamin;
	}

	

	
	
}


