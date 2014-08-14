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
 * 车辆Entity
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Entity
@Table(name = "sale_market_carinfo")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Carinfo extends IdEntity<Carinfo> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 名称
	
	private String brand; // 车辆品牌 
	private String licence; //车牌号
	private Double loadup; // 装载上限
	private Double loaddown;// 装载下限
	

	public Carinfo() {
		super();
	}

	public Carinfo(String id){
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public Double getLoadup() {
		return loadup;
	}

	public void setLoadup(Double loadup) {
		this.loadup = loadup;
	}

	public Double getLoaddown() {
		return loaddown;
	}

	public void setLoaddown(Double loaddown) {
		this.loaddown = loaddown;
	}
	
}


