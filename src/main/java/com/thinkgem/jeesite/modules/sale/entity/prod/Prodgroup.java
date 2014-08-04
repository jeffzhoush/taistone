/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.sale.entity.prod;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.Length;

import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.persistence.IdEntity;

/**
 * 产品层级Entity
 * @author JeffZhou
 * @version 2014-08-03
 */
@Entity
@Table(name = "sale_prod_prodgroup")
public class Prodgroup extends IdEntity<Prodgroup> {
	
	private static final long serialVersionUID = 1L;
	private Prodgroup parent;	// 父级
	private String parentIds; // 所有父级编号
	private String name; 	// 名称

	private List<Prodgroup> childList = Lists.newArrayList();// 拥有子列表
	
	public Prodgroup() {
		super();
	}

	public Prodgroup(String id){
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="parent_id")
	@NotFound(action = NotFoundAction.IGNORE)
	@NotNull
	public Prodgroup getParent() {
		return parent;
	}

	public void setParent(Prodgroup parent) {
		this.parent = parent;
	}

	
	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	@OneToMany(mappedBy = "parent", fetch=FetchType.LAZY)
	@Where(clause="del_flag='"+DEL_FLAG_NORMAL+"'")
	@OrderBy(value="sort") @Fetch(FetchMode.SUBSELECT)
	@NotFound(action = NotFoundAction.IGNORE)
	public List<Prodgroup> getChildList() {
		return childList;
	}

	public void setChildList(List<Prodgroup> childList) {
		this.childList = childList;
	}

	@Transient
	public static void sortList(List<Prodgroup> list, List<Prodgroup> sourcelist, String parentId){
		for (int i=0; i<sourcelist.size(); i++){
			Prodgroup e = sourcelist.get(i);
			if (e.getParent()!=null && e.getParent().getId()!=null
					&& e.getParent().getId().equals(parentId)){
				list.add(e);
				// 判断是否还有子节点, 有则继续获取子节点
				for (int j=0; j<sourcelist.size(); j++){
					Prodgroup child = sourcelist.get(j);
					if (child.getParent()!=null && child.getParent().getId()!=null
							&& child.getParent().getId().equals(e.getId())){
						sortList(list, sourcelist, e.getId());
						break;
					}
				}
			}
		}
	}

	@Transient
	public boolean isRoot(){
		return isRoot(this.id);
	}
	
	@Transient
	public static boolean isRoot(String id){
		return id != null && id.equals("1");
	}
	
}


