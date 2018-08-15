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
  is 'ģ���ҹ�˾�̨ⷿ��';
-- Add comments to the columns 
comment on column SIMC_STORE_IN.object_id
  is '����';
comment on column SIMC_STORE_IN.drawing_no
  is 'ͼ��';
comment on column SIMC_STORE_IN.gpn
  is '����ͳһ���';
comment on column SIMC_STORE_IN.custom_code
  is '�Ա��';
comment on column SIMC_STORE_IN.custom_name
  is 'ʵ������';
comment on column SIMC_STORE_IN.specification
  is '���/�ͺ�';
comment on column SIMC_STORE_IN.brand
  is 'Ʒ��';
comment on column SIMC_STORE_IN.manufacturer
  is '�������쵥λ';
comment on column SIMC_STORE_IN.factory_no
  is '�������';
comment on column SIMC_STORE_IN.serial_number
  is '���к�';
comment on column SIMC_STORE_IN.instore_date
  is '���ʱ��';
comment on column SIMC_STORE_IN.unit_price
  is '��λ�۸�';
comment on column SIMC_STORE_IN.instore_num
  is '�������';
comment on column SIMC_STORE_IN.flag
  is '��Ч��';
comment on column SIMC_STORE_IN.attribute1
  is '#��ע';
comment on column SIMC_STORE_IN.attribute2
  is '#��ע';
comment on column SIMC_STORE_IN.attribute3
  is '#��ע';
comment on column SIMC_STORE_IN.created_by
  is '#��ע';
comment on column SIMC_STORE_IN.creation_date
  is '����ʱ��';
comment on column SIMC_STORE_IN.last_updated_by
  is '��������';
comment on column SIMC_STORE_IN.last_update_date
  is '������ʱ��';
comment on column SIMC_STORE_IN.last_update_ip
  is '�����µ�IP��ַ';
comment on column SIMC_STORE_IN.security_level
  is '��ȫ����';
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
