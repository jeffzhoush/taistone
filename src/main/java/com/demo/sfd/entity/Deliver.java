/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.demo.sfd.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.persistence.IdEntity;
import com.thinkgem.jeesite.modules.sale.entity.cust.Customerinfo;
import com.thinkgem.jeesite.modules.sale.entity.prod.Prodinfo;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 配送单Entity
 * @author jeff.zhou
 * @version 2014-08-18
 */
@Entity
@Table(name = "sfd_deliver")
public class Deliver extends IdEntity<Deliver> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 配送单号
	
	private Customerinfo supply; //合作商
	private Prodinfo prodinfo; //配送品
	private User deliveruser;//配送员
	private VisitPhoto photo;//照片
	
	private String customer; //终端客户
	private String address; //地址
	private String linkman; //联系人
	private String phone; //电话
	private Double money ; //金额
	private Date orderTime; //预约时间
	private String status; //状态
	
	
	public Deliver() {
		super();
	}

	public Deliver(String id){
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

	@ManyToOne
	@JoinColumn(name="supply_id")
	public Customerinfo getSupply() {
		return supply;
	}

	public void setSupply(Customerinfo supply) {
		this.supply = supply;
	}

	@ManyToOne
	@JoinColumn(name="prodinfo_id" )
	@NotFound(action = NotFoundAction.IGNORE)
	public Prodinfo getProdinfo() {
		return prodinfo;
	}

	public void setProdinfo(Prodinfo prodinfo) {
		this.prodinfo = prodinfo;
	}

	@ManyToOne
	@JoinColumn(name="deliveruser_id")
	public User getDeliveruser() {
		return deliveruser;
	}

	public void setDeliveruser(User deliveruser) {
		this.deliveruser = deliveruser;
	}

	@OneToOne
	@JoinColumn(name="photo_id")
	public VisitPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(VisitPhoto photo) {
		this.photo = photo;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}


