SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_prod_prodgroup_id ON sale_prod_prodgroup;



/* Drop Tables */

DROP TABLE sale_prod_prodgroup;




/* Create Tables */

CREATE TABLE sale_prod_prodgroup
(
	id varchar(64) NOT NULL COMMENT '编号',
	parent_id varchar(64) NOT NULL COMMENT '父级编号',
	parent_ids varchar(2000) NOT NULL COMMENT '所有父级编号',
	name varchar(255) COMMENT '名称',	
	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '产品';



/* Create Indexes */

CREATE INDEX sale_prod_prodgroup_id ON sale_prod_prodgroup (id ASC);



