SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX sale_market_applicationstoredisplay_id ON sale_market_applicationstoredisplay;



/* Drop Tables */

DROP TABLE sale_market_applicationstoredisplay;




/* Create Tables */

CREATE TABLE sale_market_applicationstoredisplay
(
	id varchar(64) NOT NULL COMMENT '编号',
	name varchar(255) COMMENT '名称',

	displayacreage numeric(18,2) COMMENT '地堆面积',
	displaysidecount numeric(10,0) COMMENT '包住数',
	promotiondatestart date COMMENT '促销开始日期',
	promotiondateend date COMMENT '促销结束日期',

	create_by varchar(64) COMMENT '创建者',
	create_date datetime COMMENT '创建时间',
	update_by varchar(64) COMMENT '更新者',
	update_date datetime COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) NOT NULL COMMENT '删除标志',
	PRIMARY KEY (id)
) COMMENT = '项目';



/* Create Indexes */

CREATE INDEX sale_market_applicationstoredisplay_id ON sale_market_applicationstoredisplay (id ASC);



