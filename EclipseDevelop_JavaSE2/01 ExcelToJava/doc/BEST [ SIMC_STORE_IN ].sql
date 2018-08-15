-- Create table
create table SIMC_STORE_IN
(
  object_id        VARCHAR2(32) not null,
  drawing_no       VARCHAR2(355),
  gpn              VARCHAR2(32),
  custom_code      VARCHAR2(32),
  custom_name      VARCHAR2(255),
  specification    VARCHAR2(32),
  brand            VARCHAR2(32),
  manufacturer     VARCHAR2(32),
  factory_no       VARCHAR2(32),
  serial_number    VARCHAR2(32),
  instore_date     DATE,
  unit_price       NUMBER(11,2),
  instore_num      NUMBER(11),
  flag             VARCHAR2(3),
  attribute1       VARCHAR2(200),
  attribute2       VARCHAR2(200),
  attribute3       VARCHAR2(200),
  created_by       VARCHAR2(32),
  creation_date    DATE,
  last_updated_by  VARCHAR2(32),
  last_update_date DATE,
  last_update_ip   VARCHAR2(128),
  security_level   NUMBER
)
tablespace BAIHOO_ERP
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table SIMC_STORE_IN
  is '模拟我公司库房台账';
-- Add comments to the columns 
comment on column SIMC_STORE_IN.object_id
  is '主键';
comment on column SIMC_STORE_IN.drawing_no
  is '图号';
comment on column SIMC_STORE_IN.gpn
  is '厂内统一编号';
comment on column SIMC_STORE_IN.custom_code
  is '自编号';
comment on column SIMC_STORE_IN.custom_name
  is '实体名称';
comment on column SIMC_STORE_IN.specification
  is '规格/型号';
comment on column SIMC_STORE_IN.brand
  is '品牌';
comment on column SIMC_STORE_IN.manufacturer
  is '生产制造单位';
comment on column SIMC_STORE_IN.factory_no
  is '出厂编号';
comment on column SIMC_STORE_IN.serial_number
  is '序列号';
comment on column SIMC_STORE_IN.instore_date
  is '入库时间';
comment on column SIMC_STORE_IN.unit_price
  is '单位价格';
comment on column SIMC_STORE_IN.instore_num
  is '入库数量';
comment on column SIMC_STORE_IN.flag
  is '有效性';
comment on column SIMC_STORE_IN.attribute1
  is '#备注';
comment on column SIMC_STORE_IN.attribute2
  is '#备注';
comment on column SIMC_STORE_IN.attribute3
  is '#备注';
comment on column SIMC_STORE_IN.created_by
  is '#备注';
comment on column SIMC_STORE_IN.creation_date
  is '创建时间';
comment on column SIMC_STORE_IN.last_updated_by
  is '最后更新人';
comment on column SIMC_STORE_IN.last_update_date
  is '最后更新时间';
comment on column SIMC_STORE_IN.last_update_ip
  is '最后更新的IP地址';
comment on column SIMC_STORE_IN.security_level
  is '安全级别';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SIMC_STORE_IN
  add constraint SIMC_STORE_IN_PK_OBJECT_ID primary key (OBJECT_ID)
  using index 
  tablespace BAIHOO_ERP
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Grant/Revoke object privileges 
grant select, insert, update, delete, references, alter, index on SIMC_STORE_IN to APPS;
