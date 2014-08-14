SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_cust_customerinfo_id ON sale_cust_customerinfo;



/* Drop Tables */

DROP TABLE sale_cust_customerinfo;




/* Create Tables */

CREATE TABLE sale_cust_customerinfo
(
	id varchar(64) NOT NULL COMMENT '编号',
	name varchar(255) COMMENT '名称',
	linkman varchar(255) COMMENT '联系人',
	phone varchar(20) COMMENT '联系电话',
	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '项目';



/* Create Indexes */

CREATE INDEX sale_cust_customerinfo_id ON sale_cust_customerinfo (id ASC);



