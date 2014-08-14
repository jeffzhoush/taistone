SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_market_storeprodrel_id ON sale_market_storeprodrel;



/* Drop Tables */

DROP TABLE sale_market_storeprodrel;




/* Create Tables */

CREATE TABLE sale_market_storeprodrel
(
	id varchar(64) NOT NULL COMMENT '编号',
	name varchar(255) COMMENT '名称',
	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '项目';



/* Create Indexes */

CREATE INDEX sale_market_storeprodrel_id ON sale_market_storeprodrel (id ASC);



