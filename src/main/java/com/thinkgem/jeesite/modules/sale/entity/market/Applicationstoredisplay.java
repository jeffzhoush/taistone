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
 * 特陈计划Entity
 * @author jeff.zhou
 * @version 2014-08-06
 */
@Entity
@Table(name = "sale_market_applicationstoredisplay")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Applicationstoredisplay extends IdEntity<Applicationstoredisplay> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 名称
	
	private Double displayacreage; //地堆面积
	private Long displaysidecount ;// 包住数
	private Date promotiondatestart; //促销开始日期
	private Date promotiondateend; // 促销结束日期

	public Applicationstoredisplay() {
		super();
	}

	public Applicationstoredisplay(String id){
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

	public Double getDisplayacreage() {
		return displayacreage;
	}

	public void setDisplayacreage(Double displayacreage) {
		this.displayacreage = displayacreage;
	}

	public Long getDisplaysidecount() {
		return displaysidecount;
	}

	public void setDisplaysidecount(Long displaysidecount) {
		this.displaysidecount = displaysidecount;
	}

	public Date getPromotiondatestart() {
		return promotiondatestart;
	}

	public void setPromotiondatestart(Date promotiondatestart) {
		this.promotiondatestart = promotiondatestart;
	}

	public Date getPromotiondateend() {
		return promotiondateend;
	}

	public void setPromotiondateend(Date promotiondateend) {
		this.promotiondateend = promotiondateend;
	}
	
}


