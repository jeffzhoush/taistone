/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.entity.cust;

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
 * 终端Entity
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Entity
@Table(name = "sale_cust_storeinfo")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Storeinfo extends IdEntity<Storeinfo> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 名称
	
	private String storeowner; //老板
	private Double longitude; //经度 
	private Double latitude; // 纬度
	private Integer zip; // 邮编
	private String phone; // 电话
	private String mobile; // 手机
	private String photo; // 照片
	/*private Date checkdate; // 审核时间
	private String checkresult; // 审核结果
	private String checkstatus; // 审核状态
	private User checkuser; // 审核人
	 */
	private String status ;// 门店状态
	
	public Storeinfo() {
		super();
	}

	public Storeinfo(String id){
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

	public String getStoreowner() {
		return storeowner;
	}

	public void setStoreowner(String storeowner) {
		this.storeowner = storeowner;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}


