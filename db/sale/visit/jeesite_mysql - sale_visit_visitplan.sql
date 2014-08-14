SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_visit_visitplan_id ON sale_visit_visitplan;



/* Drop Tables */

DROP TABLE sale_visit_visitplan;




/* Create Tables */

CREATE TABLE sale_visit_visitplan
(
	id varchar(64) NOT NULL COMMENT '编号',
	name varchar(255) COMMENT '名称',

	visitorder numeric(1,0) COMMENT '拜访顺序',
	plantime datetime COMMENT '计划拜访时间',
	starttime datetime COMMENT '拜访开始时间',
	endtime datetime COMMENT '拜访结束时间',
	longtitude numeric(18,4) COMMENT '经度',
	latitude numeric(18,4) COMMENT '纬度',

	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '项目';



/* Create Indexes */

CREATE INDEX sale_visit_visitplan_id ON sale_visit_visitplan (id ASC);



