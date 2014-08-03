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

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.persistence.IdEntity;
import com.thinkgem.jeesite.modules.prj.entity.Project;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 产品Entity
 * @author JeffZhou
 * @version 2014-08-03
 */
@Entity
@Table(name = "sale_prod_prodinfo")
public class Prodinfo extends IdEntity<Prodinfo> {
	
	private static final long serialVersionUID = 1L;
//	private String id; 		// 编号
	private String name; 	// 名称

	private Double forwarderprice;
	private Double storeprice;
	private Double twosalesprice;
	private Double creditprice;
	private Integer salesorder;
	
	
	public Prodinfo() {
		super();
	}

	public Prodinfo(String id){
		this();
		this.id = id;
	}
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_sale_prod_prodinfo")
	//@SequenceGenerator(name = "seq_sale_prod_prodinfo", sequenceName = "seq_sale_prod_prodinfo")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}*/

	@Length(min=1, max=200)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getForwarderprice() {
		return forwarderprice;
	}

	public void setForwarderprice(Double forwarderprice) {
		this.forwarderprice = forwarderprice;
	}

	public Double getStoreprice() {
		return storeprice;
	}

	public void setStoreprice(Double storeprice) {
		this.storeprice = storeprice;
	}

	public Double getTwosalesprice() {
		return twosalesprice;
	}

	public void setTwosalesprice(Double twosalesprice) {
		this.twosalesprice = twosalesprice;
	}

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
	
}


