/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.entity.prod;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.persistence.IdEntity;
import com.thinkgem.jeesite.common.utils.excel.annotation.ExcelField;
import com.thinkgem.jeesite.modules.sys.entity.Office;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 商品信息Entity
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Entity
@Table(name = "sale_prod_prodinfo")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Prodinfo extends IdEntity<Prodinfo> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 名称
	
	private String lv5id; // 产品编码
	private Double forwarderprice; // 出车价
	private Double storeprice; // 现销价 
	private Double twosalesprice; // 二批价 
	private Double creditprice; // 赊销价 
	private Integer salesorder ; // 排序 

	private Prodgroup prodgroup;	// 商品类型
	
	
	public Prodinfo() {
		super();
	}

	public Prodinfo(String id){
		this();
		this.id = id;
	}

	@Length(min=1, max=200)
	@ExcelField(title="名称", align=2, sort=10)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ExcelField(title="产品编码", align=2, sort=20)
	public String getLv5id() {
		return lv5id;
	}

	public void setLv5id(String lv5id) {
		this.lv5id = lv5id;
	}

	@ExcelField(title="出车价", align=2, sort=30)
	public Double getForwarderprice() {
		return forwarderprice;
	}

	public void setForwarderprice(Double forwarderprice) {
		this.forwarderprice = forwarderprice;
	}

	@ExcelField(title="现销价", align=2, sort=40)
	public Double getStoreprice() {
		return storeprice;
	}

	public void setStoreprice(Double storeprice) {
		this.storeprice = storeprice;
	}

	@ExcelField(title="二批价 ", align=2, sort=50)
	public Double getTwosalesprice() {
		return twosalesprice;
	}

	public void setTwosalesprice(Double twosalesprice) {
		this.twosalesprice = twosalesprice;
	}

	@ExcelField(title="赊销价 ", align=2, sort=60)
	public Double getCreditprice() {
		return creditprice;
	}

	public void setCreditprice(Double creditprice) {
		this.creditprice = creditprice;
	}

	public Integer getSalesorder() {
		return salesorder;
	}

	public void setSalesorder(Integer salesorder) {
		this.salesorder = salesorder;
	}

	@ManyToOne
	@JoinColumn(name="prodgroup_id")
	@NotFound(action = NotFoundAction.IGNORE)
	@JsonIgnore
	@NotNull(message="商品类型不能为空")
	@ExcelField(type=0,title="商品类型", align=2, sort=25)
	public Prodgroup getProdgroup() {
		return prodgroup;
	}

	public void setProdgroup(Prodgroup prodgroup) {
		this.prodgroup = prodgroup;
	}
	
}


