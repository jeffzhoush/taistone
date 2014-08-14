/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.entity.visit;

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
 * 拜访计划Entity
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Entity
@Table(name = "sale_visit_visitplan")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Visitplan extends IdEntity<Visitplan> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 名称
	
	private Integer visitorder; //拜访顺序
	private Date plantime; //计划拜访时间
	private Date starttime; //拜访开始时间
	private Date endtime; //拜访结束时间
	private Double longtitude; //经度
	private Double latitude; //纬度

	public Visitplan() {
		super();
	}

	public Visitplan(String id){
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

	public Integer getVisitorder() {
		return visitorder;
	}

	public void setVisitorder(Integer visitorder) {
		this.visitorder = visitorder;
	}

	public Date getPlantime() {
		return plantime;
	}

	public void setPlantime(Date plantime) {
		this.plantime = plantime;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(Double longtitude) {
		this.longtitude = longtitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
}


