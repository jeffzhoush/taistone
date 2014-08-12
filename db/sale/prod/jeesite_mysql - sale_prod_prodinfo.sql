SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_prod_prodinfo_id ON sale_prod_prodinfo;



/* Drop Tables */

DROP TABLE sale_prod_prodinfo;




/* Create Tables */

CREATE TABLE sale_prod_prodinfo
(
	id varchar(64) NOT NULL COMMENT '编号',
	name varchar(255) COMMENT '名称',
	lv5id varchar(255) COMMENT '产品编码',
	forwarderprice numeric(18,4) COMMENT '出车价',
 	storeprice numeric(18,4) COMMENT '现销价',
	twosalesprice numeric(18,4) COMMENT '二批价',
	creditprice numeric(18,4) COMMENT '赊销价',
	salesorder numeric(10,0) COMMENT '排序',
	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '项目';



/* Create Indexes */

CREATE INDEX sale_prod_prodinfo_id ON sale_prod_prodinfo (id ASC);



