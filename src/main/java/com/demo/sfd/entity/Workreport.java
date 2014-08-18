/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.demo.sfd.entity;

import java.beans.Transient;
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
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 工作汇报Entity
 * @author jeff.zhou
 * @version 2014-08-18
 */
@Entity
@Table(name = "sfd_workreport")
public class Workreport extends IdEntity<Workreport> {
	
	private static final long serialVersionUID = 1L;

	private String name; 	// 名称

	private User user ; //汇报人
	private Date submitTime;//提交时间
	private String reportType;//汇报类型
	private String content;//汇报内容
	private VisitPhoto photo; //图片
	
	
	public Workreport() {
		super();
	}

	public Workreport(String id){
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

	
	@ManyToOne(optional=false)
	@JoinColumn(name="user_id", nullable=false, updatable=false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@OneToOne(optional=false)
	@JoinColumn(name="photo_id", unique=true, nullable=false, updatable=false)
	public VisitPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(VisitPhoto photo) {
		this.photo = photo;
	}
	
}


