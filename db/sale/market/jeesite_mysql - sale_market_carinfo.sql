SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_market_carinfo_id ON sale_market_carinfo;



/* Drop Tables */

DROP TABLE sale_market_carinfo;




/* Create Tables */

CREATE TABLE sale_market_carinfo
(
	id varchar(64) NOT NULL COMMENT '编号',
	name varchar(255) COMMENT '名称',

	brand varchar(100) COMMENT '车辆品牌',
	licence varchar(20) COMMENT '车牌号',
	loadup numeric(10,2) COMMENT '装载上限',
	loaddown numeric(10,2) COMMENT '装载下限',

	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '项目';



/* Create Indexes */

CREATE INDEX sale_market_carinfo_id ON sale_market_carinfo (id ASC);



