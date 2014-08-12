SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_cust_storeinfo_id ON sale_cust_storeinfo;



/* Drop Tables */

DROP TABLE sale_cust_storeinfo;




/* Create Tables */

CREATE TABLE sale_cust_storeinfo
(
	id varchar(64) NOT NULL COMMENT '编号',
	name varchar(255) COMMENT '名称',
	
	storeowner varchar(100) COMMENT '老板',
	longitude numeric(18,4) COMMENT '经度',
	latitude numeric(18,4) COMMENT '纬度',
	zip numeric(10,0) COMMENT '邮编',
	phone varchar(50) COMMENT '电话',
	mobile varchar(50) COMMENT '手机',
	photo varchar(255) COMMENT '照片',
	checkdate datetime COMMENT '审核时间',
	checkresult varchar(10) COMMENT '审核结果',
	checkstatus varchar(10) COMMENT '审核状态',
	checkuser varchar(64) COMMENT '审核人',
	status varchar(64) COMMENT '门店状态',

	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '项目';



/* Create Indexes */

CREATE INDEX sale_cust_storeinfo_id ON sale_cust_storeinfo (id ASC);



