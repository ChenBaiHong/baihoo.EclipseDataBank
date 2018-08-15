package org.estore.common.bean;

import java.util.Date;

import org.estore.common.annotation.OraFieldName;
import org.estore.common.annotation.OraTableName;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: fdmp_store_in </p>
 * <p>表说明: 
 *
 *		库房在库数据
 *
 * </p>
 * <p>类名称: FdmpStoreIn.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.Chen
 * @date 2018-06-12 16:06:43
 */
@OraTableName(tableName = "FDMP_STORE_IN")
public class FdmpStoreIn  extends BaseBean {

	@OraFieldName(fieldName = "STORE_IN_ID")
	private String storeInId;	//主键
	@OraFieldName(fieldName = "DRAWING_NO")
	private String drawingNo;	//图号
	@OraFieldName(fieldName = "GPN")
	private String gpn;	//厂内统一编号
	@OraFieldName(fieldName = "CUSTOM_CODE")
	private String customCode;	//自编号
	@OraFieldName(fieldName = "ENTITY_NAME")
	private String entityName;	//要素名称
	@OraFieldName(fieldName = "CUSTOM_NAME")
	private String customName;	//实体名称
	@OraFieldName(fieldName = "SPECIFICATION")
	private String specification;	//规格/型号
	@OraFieldName(fieldName = "FIT_SPECIFICATION")
	private String fitSpecification;	//配用工具型号
	@OraFieldName(fieldName = "BRAND")
	private String brand;	//品牌
	@OraFieldName(fieldName = "MANUFACTURER")
	private String manufacturer;	//生产制造单位
	@OraFieldName(fieldName = "FACTORY_NO")
	private String factoryNo;	//出厂编号
	@OraFieldName(fieldName = "FACTORY_DATE")
	private Date factoryDate;	//出厂日期
	@OraFieldName(fieldName = "SERIAL_NUMBER")
	private String serialNumber;	//序列号
	@OraFieldName(fieldName = "PRODUCT_CODE")
	private String productCode;	//订货/使用机型
	@OraFieldName(fieldName = "CLASSIFY_ID")
	private String classifyId;	//分类ID，通过关联分类主键显示分类
	@OraFieldName(fieldName = "WAREHOSE_ID")
	private String warehoseId;	//库位ID，通过关联库房库位ID
	@OraFieldName(fieldName = "STORE_LIMIT")
	private String storeLimit;	//库存限额数
	@OraFieldName(fieldName = "INSTORE_NUM")
	private String instoreNum;	//入库数量
	@OraFieldName(fieldName = "UNIT_PRICE")
	private String unitPrice;	//单位价格
	@OraFieldName(fieldName = "CHECKS_CYCLE")
	private String checksCycle;	//定检周期，以天为单位
	@OraFieldName(fieldName = "CHECKS_START_DATE")
	private Date checksStartDate;	//定检计算起始日期
	@OraFieldName(fieldName = "CHECKS_UNIT")
	private String checksUnit;	//定检单位
	@OraFieldName(fieldName = "CHECKS_CLASSIFY")
	private String checksClassify;	//检验分类，使用业务字典
	@OraFieldName(fieldName = "TECHNICAL_INDICATOR")
	private String technicalIndicator;	//技术指标
	@OraFieldName(fieldName = "FUNTIONS")
	private String funtions;	//功能描述
	@OraFieldName(fieldName = "INSTORE_DATE")
	private Date instoreDate;	//入库时间
	@OraFieldName(fieldName = "WEIGHT")
	private String weight;	//重量/单位重量，重量单位通过人工录入
	@OraFieldName(fieldName = "MAINTENANCE_CYCLE")
	private String maintenanceCycle;	//维护周期，以天为单位
	@OraFieldName(fieldName = "COMPETENT_DEPT_ID")
	private String competentDeptId;	//主管部门
	@OraFieldName(fieldName = "ATTRIBUTE1")
	private String attribute1;	//自定义字段1(库位名称)
	@OraFieldName(fieldName = "ATTRIBUTE2")
	private String attribute2;	//自定义字段2(工装工具返修单号)
	@OraFieldName(fieldName = "ATTRIBUTE3")
	private String attribute3;	//自定义字段3(分类顶级id)
	@OraFieldName(fieldName = "ATTRIBUTE4")
	private String attribute4;	//自定义字段4(类型全称)
	@OraFieldName(fieldName = "ATTRIBUTE5")
	private String attribute5;	//自定义字段5(备注1)
	@OraFieldName(fieldName = "ATTRIBUTE6")
	private String attribute6;	//自定义字段6(备注2)
	@OraFieldName(fieldName = "ATTRIBUTE7")
	private String attribute7;	//自定义字段7
	@OraFieldName(fieldName = "ATTRIBUTE8")
	private String attribute8;	//自定义字段8(借用数量)
	@OraFieldName(fieldName = "ATTRIBUTE9")
	private String attribute9;	//自定义字段9(借用状态 0 正常;1待借;2借出;3待维修;4维修;5待维护;6维护;7待定检;8定检;9待巡检;10巡检;;;;;;;;;;;; 用于附件状态控制)
	@OraFieldName(fieldName = "ATTRIBUTE10")
	private String attribute10;	//自定义字段10(库房状态)1合格 2禁用 3维修合格 4限用 5准用
	@OraFieldName(fieldName = "ATTRIBUTE1_DESC")
	private String attribute1Desc;	//ATTRIBUTE1描述
	@OraFieldName(fieldName = "ATTRIBUTE2_DESC")
	private String attribute2Desc;	//ATTRIBUTE2描述
	@OraFieldName(fieldName = "ATTRIBUTE3_DESC")
	private String attribute3Desc;	//ATTRIBUTE3描述
	@OraFieldName(fieldName = "ATTRIBUTE4_DESC")
	private String attribute4Desc;	//ATTRIBUTE4描述
	@OraFieldName(fieldName = "ATTRIBUTE5_DESC")
	private String attribute5Desc;	//ATTRIBUTE5描述
	@OraFieldName(fieldName = "ATTRIBUTE6_DESC")
	private String attribute6Desc;	//ATTRIBUTE6描述
	@OraFieldName(fieldName = "ATTRIBUTE7_DESC")
	private String attribute7Desc;	//ATTRIBUTE7描述
	@OraFieldName(fieldName = "ATTRIBUTE8_DESC")
	private String attribute8Desc;	//ATTRIBUTE8描述
	@OraFieldName(fieldName = "ATTRIBUTE9_DESC")
	private String attribute9Desc;	//ATTRIBUTE9描述
	@OraFieldName(fieldName = "ATTRIBUTE10_DESC")
	private String attribute10Desc;	//ATTRIBUTE10描述
	@OraFieldName(fieldName = "CREATED_BY")
	private String createdBy;	//创建人：引用AC_OPERATOR表ID
	@OraFieldName(fieldName = "CREATION_DATE")
	private Date creationDate;	//创建时间
	@OraFieldName(fieldName = "LAST_UPDATED_BY")
	private String lastUpdatedBy;	//最后修改人：引用AC_OPERATOR表ID
	@OraFieldName(fieldName = "LAST_UPDATE_DATE")
	private Date lastUpdateDate;	//最后修改时间
	@OraFieldName(fieldName = "LAST_UPDATE_IP")
	private String lastUpdateIp;	//最后更新IP
	@OraFieldName(fieldName = "VERSION")
	private String version;	//版本
	@OraFieldName(fieldName = "SECUIRITY_LEVEL")
	private String secuirityLevel;	//密级
	@OraFieldName(fieldName = "ATTRIBUTE_CATEGORY")
	private String attributeCategory;	//弹性域上下文
	@OraFieldName(fieldName = "CREATED_BY_DEPT_ID")
	private String createdByDeptId;	//数据录入部门
	@OraFieldName(fieldName = "PID")
	private String pid;	//父主键（0为机动设备，大于0为子清单）
	@OraFieldName(fieldName = "STORE_STATUS")
	private String storeStatus;	//入库状态(0在库,1停用.2定检,3维修,4报废.5借出.6入库.7删除.8已预约借用)
	@OraFieldName(fieldName = "STOREIN_STATUS")
	private String storeinStatus;	//在库状态(针对机动设备:1计划巡检，2检修，3完好，4停用，5其他)
	@OraFieldName(fieldName = "IMG_PATH")
	private String imgPath;	//图片存储路径
	@OraFieldName(fieldName = "REMARK")
	private String remark;	//备注
	@OraFieldName(fieldName = "REPAIR_DESC")
	private String repairDesc;	//维修内容
	@OraFieldName(fieldName = "PLAN_DATE")
	private Date planDate;	//计划时间
	@OraFieldName(fieldName = "PLAN_END_DATE")
	private Date planEndDate;	//计划完成时间
	@OraFieldName(fieldName = "END_DATE")
	private Date endDate;	//实际完工时间
	@OraFieldName(fieldName = "NEXT_CHECK_DATE")
	private Date nextCheckDate;	//下次定检日期
	@OraFieldName(fieldName = "ORDER_CODE")
	private String orderCode;	//订货机型
	@OraFieldName(fieldName = "ORDER_FROM")
	private String orderFrom;	//订货来源
	@OraFieldName(fieldName = "ENTITY_TYPE")
	private String entityType;	//要素类型
	@OraFieldName(fieldName = "CHECK_DATE")
	private Date checkDate;	//验收日期
	@OraFieldName(fieldName = "ORDER_PRICE")
	private String orderPrice;	//订货价格
	@OraFieldName(fieldName = "QUALITY_TIME")
	private String qualityTime;	//质保期
	@OraFieldName(fieldName = "OUTNO")
	private String outno;	//出厂编号
	@OraFieldName(fieldName = "NATURE")
	private String nature;	//属性（T国产通用，J进口工具，Z专用采购，443专用自制）
	@OraFieldName(fieldName = "STOCK_TYPE")
	private String stockType;	//存货类别（A普通道具，B数控道具，C量具，D气动工具，E数控机床用辅具，F其他辅具）
	@OraFieldName(fieldName = "TOOL_TYPE")
	private String toolType;	//工具类别（1专用辅助，2专用切削，3专用量具，4通用切削，5进口辅助，6国产易耗品，7进口易耗品，8进口切削，9进口量具，10废旧利用，11通用量具，12通用辅助，13其他）
	@OraFieldName(fieldName = "CHECK_EMPNAME")
	private String checkEmpname;	//办理人
	@OraFieldName(fieldName = "LAST_CHECK_DATE")
	private Date lastCheckDate;	//上次定检日期
	@OraFieldName(fieldName = "CHECKS_NO")
	private String checksNo;	//定检编号
	@OraFieldName(fieldName = "CHECK_BACK_DATE")
	private Date checkBackDate;	//定检返回日期
	@OraFieldName(fieldName = "SEND_CHECK_EMPNAME")
	private String sendCheckEmpname;	//送检人
	@OraFieldName(fieldName = "GET_CHECK_EMPNAME")
	private String getCheckEmpname;	//定检单位接收人
	@OraFieldName(fieldName = "CHECK_OUT_TIME")
	private String checkOutTime;	//定检是否延期
	@OraFieldName(fieldName = "SEND_CHECK_DATE")
	private Date sendCheckDate;	//本次送检日期
	@OraFieldName(fieldName = "CHECK_LATE_DATE")
	private Date checkLateDate;	//延期到期日期
	@OraFieldName(fieldName = "TRY_DATE")
	private Date tryDate;	//试用日期
	@OraFieldName(fieldName = "TRY_DEPT")
	private String tryDept;	//试用单位
	@OraFieldName(fieldName = "SCRIPT_LEVEL")
	private String scriptLevel;	//设备密级
	@OraFieldName(fieldName = "EQUIP_NO")
	private String equipNo;	//设备编号
	@OraFieldName(fieldName = "MAJOR")
	private String major;	//专业（0动力 ， 1航电 ， 2机械 ， 3军械 ， 4特设 ， 5通用）
	@OraFieldName(fieldName = "DISPLAY_PRODUCT_NAME")
	private String displayProductName;	//展示订货/使用机型名称
	@OraFieldName(fieldName = "MAJOR_NAME")
	private String majorName;	//专业名称
	@OraFieldName(fieldName = "DISCARDING_CRITERIA")
	private String discardingCriteria;	//报废依据
	@OraFieldName(fieldName = "REPEAL_CRITERIA")
	private String repealCriteria;	//撤销依据
	@OraFieldName(fieldName = "INVENTORY_ACOUNT")
	private String inventoryAcount;	//库存数量
	@OraFieldName(fieldName = "FLAG")
	private String flag;	//有效性

	public void setStoreInId(String storeInId){
		this.storeInId=storeInId;
	}
	public String getStoreInId(){
		return storeInId;
	}
	public void setDrawingNo(String drawingNo){
		this.drawingNo=drawingNo;
	}
	public String getDrawingNo(){
		return drawingNo;
	}
	public void setGpn(String gpn){
		this.gpn=gpn;
	}
	public String getGpn(){
		return gpn;
	}
	public void setCustomCode(String customCode){
		this.customCode=customCode;
	}
	public String getCustomCode(){
		return customCode;
	}
	public void setEntityName(String entityName){
		this.entityName=entityName;
	}
	public String getEntityName(){
		return entityName;
	}
	public void setCustomName(String customName){
		this.customName=customName;
	}
	public String getCustomName(){
		return customName;
	}
	public void setSpecification(String specification){
		this.specification=specification;
	}
	public String getSpecification(){
		return specification;
	}
	public void setFitSpecification(String fitSpecification){
		this.fitSpecification=fitSpecification;
	}
	public String getFitSpecification(){
		return fitSpecification;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer=manufacturer;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public void setFactoryNo(String factoryNo){
		this.factoryNo=factoryNo;
	}
	public String getFactoryNo(){
		return factoryNo;
	}
	public void setFactoryDate(Date factoryDate){
		this.factoryDate=factoryDate;
	}
	public Date getFactoryDate(){
		return factoryDate;
	}
	public void setSerialNumber(String serialNumber){
		this.serialNumber=serialNumber;
	}
	public String getSerialNumber(){
		return serialNumber;
	}
	public void setProductCode(String productCode){
		this.productCode=productCode;
	}
	public String getProductCode(){
		return productCode;
	}
	public void setClassifyId(String classifyId){
		this.classifyId=classifyId;
	}
	public String getClassifyId(){
		return classifyId;
	}
	public void setWarehoseId(String warehoseId){
		this.warehoseId=warehoseId;
	}
	public String getWarehoseId(){
		return warehoseId;
	}
	public void setStoreLimit(String storeLimit){
		this.storeLimit=storeLimit;
	}
	public String getStoreLimit(){
		return storeLimit;
	}
	public void setInstoreNum(String instoreNum){
		this.instoreNum=instoreNum;
	}
	public String getInstoreNum(){
		return instoreNum;
	}
	public void setUnitPrice(String unitPrice){
		this.unitPrice=unitPrice;
	}
	public String getUnitPrice(){
		return unitPrice;
	}
	public void setChecksCycle(String checksCycle){
		this.checksCycle=checksCycle;
	}
	public String getChecksCycle(){
		return checksCycle;
	}
	public void setChecksStartDate(Date checksStartDate){
		this.checksStartDate=checksStartDate;
	}
	public Date getChecksStartDate(){
		return checksStartDate;
	}
	public void setChecksUnit(String checksUnit){
		this.checksUnit=checksUnit;
	}
	public String getChecksUnit(){
		return checksUnit;
	}
	public void setChecksClassify(String checksClassify){
		this.checksClassify=checksClassify;
	}
	public String getChecksClassify(){
		return checksClassify;
	}
	public void setTechnicalIndicator(String technicalIndicator){
		this.technicalIndicator=technicalIndicator;
	}
	public String getTechnicalIndicator(){
		return technicalIndicator;
	}
	public void setFuntions(String funtions){
		this.funtions=funtions;
	}
	public String getFuntions(){
		return funtions;
	}
	public void setInstoreDate(Date instoreDate){
		this.instoreDate=instoreDate;
	}
	public Date getInstoreDate(){
		return instoreDate;
	}
	public void setWeight(String weight){
		this.weight=weight;
	}
	public String getWeight(){
		return weight;
	}
	public void setMaintenanceCycle(String maintenanceCycle){
		this.maintenanceCycle=maintenanceCycle;
	}
	public String getMaintenanceCycle(){
		return maintenanceCycle;
	}
	public void setCompetentDeptId(String competentDeptId){
		this.competentDeptId=competentDeptId;
	}
	public String getCompetentDeptId(){
		return competentDeptId;
	}
	public void setAttribute1(String attribute1){
		this.attribute1=attribute1;
	}
	public String getAttribute1(){
		return attribute1;
	}
	public void setAttribute2(String attribute2){
		this.attribute2=attribute2;
	}
	public String getAttribute2(){
		return attribute2;
	}
	public void setAttribute3(String attribute3){
		this.attribute3=attribute3;
	}
	public String getAttribute3(){
		return attribute3;
	}
	public void setAttribute4(String attribute4){
		this.attribute4=attribute4;
	}
	public String getAttribute4(){
		return attribute4;
	}
	public void setAttribute5(String attribute5){
		this.attribute5=attribute5;
	}
	public String getAttribute5(){
		return attribute5;
	}
	public void setAttribute6(String attribute6){
		this.attribute6=attribute6;
	}
	public String getAttribute6(){
		return attribute6;
	}
	public void setAttribute7(String attribute7){
		this.attribute7=attribute7;
	}
	public String getAttribute7(){
		return attribute7;
	}
	public void setAttribute8(String attribute8){
		this.attribute8=attribute8;
	}
	public String getAttribute8(){
		return attribute8;
	}
	public void setAttribute9(String attribute9){
		this.attribute9=attribute9;
	}
	public String getAttribute9(){
		return attribute9;
	}
	public void setAttribute10(String attribute10){
		this.attribute10=attribute10;
	}
	public String getAttribute10(){
		return attribute10;
	}
	public void setAttribute1Desc(String attribute1Desc){
		this.attribute1Desc=attribute1Desc;
	}
	public String getAttribute1Desc(){
		return attribute1Desc;
	}
	public void setAttribute2Desc(String attribute2Desc){
		this.attribute2Desc=attribute2Desc;
	}
	public String getAttribute2Desc(){
		return attribute2Desc;
	}
	public void setAttribute3Desc(String attribute3Desc){
		this.attribute3Desc=attribute3Desc;
	}
	public String getAttribute3Desc(){
		return attribute3Desc;
	}
	public void setAttribute4Desc(String attribute4Desc){
		this.attribute4Desc=attribute4Desc;
	}
	public String getAttribute4Desc(){
		return attribute4Desc;
	}
	public void setAttribute5Desc(String attribute5Desc){
		this.attribute5Desc=attribute5Desc;
	}
	public String getAttribute5Desc(){
		return attribute5Desc;
	}
	public void setAttribute6Desc(String attribute6Desc){
		this.attribute6Desc=attribute6Desc;
	}
	public String getAttribute6Desc(){
		return attribute6Desc;
	}
	public void setAttribute7Desc(String attribute7Desc){
		this.attribute7Desc=attribute7Desc;
	}
	public String getAttribute7Desc(){
		return attribute7Desc;
	}
	public void setAttribute8Desc(String attribute8Desc){
		this.attribute8Desc=attribute8Desc;
	}
	public String getAttribute8Desc(){
		return attribute8Desc;
	}
	public void setAttribute9Desc(String attribute9Desc){
		this.attribute9Desc=attribute9Desc;
	}
	public String getAttribute9Desc(){
		return attribute9Desc;
	}
	public void setAttribute10Desc(String attribute10Desc){
		this.attribute10Desc=attribute10Desc;
	}
	public String getAttribute10Desc(){
		return attribute10Desc;
	}
	public void setCreatedBy(String createdBy){
		this.createdBy=createdBy;
	}
	public String getCreatedBy(){
		return createdBy;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate=creationDate;
	}
	public Date getCreationDate(){
		return creationDate;
	}
	public void setLastUpdatedBy(String lastUpdatedBy){
		this.lastUpdatedBy=lastUpdatedBy;
	}
	public String getLastUpdatedBy(){
		return lastUpdatedBy;
	}
	public void setLastUpdateDate(Date lastUpdateDate){
		this.lastUpdateDate=lastUpdateDate;
	}
	public Date getLastUpdateDate(){
		return lastUpdateDate;
	}
	public void setLastUpdateIp(String lastUpdateIp){
		this.lastUpdateIp=lastUpdateIp;
	}
	public String getLastUpdateIp(){
		return lastUpdateIp;
	}
	public void setVersion(String version){
		this.version=version;
	}
	public String getVersion(){
		return version;
	}
	public void setSecuirityLevel(String secuirityLevel){
		this.secuirityLevel=secuirityLevel;
	}
	public String getSecuirityLevel(){
		return secuirityLevel;
	}
	public void setAttributeCategory(String attributeCategory){
		this.attributeCategory=attributeCategory;
	}
	public String getAttributeCategory(){
		return attributeCategory;
	}
	public void setCreatedByDeptId(String createdByDeptId){
		this.createdByDeptId=createdByDeptId;
	}
	public String getCreatedByDeptId(){
		return createdByDeptId;
	}
	public void setPid(String pid){
		this.pid=pid;
	}
	public String getPid(){
		return pid;
	}
	public void setStoreStatus(String storeStatus){
		this.storeStatus=storeStatus;
	}
	public String getStoreStatus(){
		return storeStatus;
	}
	public void setStoreinStatus(String storeinStatus){
		this.storeinStatus=storeinStatus;
	}
	public String getStoreinStatus(){
		return storeinStatus;
	}
	public void setImgPath(String imgPath){
		this.imgPath=imgPath;
	}
	public String getImgPath(){
		return imgPath;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public void setRepairDesc(String repairDesc){
		this.repairDesc=repairDesc;
	}
	public String getRepairDesc(){
		return repairDesc;
	}
	public void setPlanDate(Date planDate){
		this.planDate=planDate;
	}
	public Date getPlanDate(){
		return planDate;
	}
	public void setPlanEndDate(Date planEndDate){
		this.planEndDate=planEndDate;
	}
	public Date getPlanEndDate(){
		return planEndDate;
	}
	public void setEndDate(Date endDate){
		this.endDate=endDate;
	}
	public Date getEndDate(){
		return endDate;
	}
	public void setNextCheckDate(Date nextCheckDate){
		this.nextCheckDate=nextCheckDate;
	}
	public Date getNextCheckDate(){
		return nextCheckDate;
	}
	public void setOrderCode(String orderCode){
		this.orderCode=orderCode;
	}
	public String getOrderCode(){
		return orderCode;
	}
	public void setOrderFrom(String orderFrom){
		this.orderFrom=orderFrom;
	}
	public String getOrderFrom(){
		return orderFrom;
	}
	public void setEntityType(String entityType){
		this.entityType=entityType;
	}
	public String getEntityType(){
		return entityType;
	}
	public void setCheckDate(Date checkDate){
		this.checkDate=checkDate;
	}
	public Date getCheckDate(){
		return checkDate;
	}
	public void setOrderPrice(String orderPrice){
		this.orderPrice=orderPrice;
	}
	public String getOrderPrice(){
		return orderPrice;
	}
	public void setQualityTime(String qualityTime){
		this.qualityTime=qualityTime;
	}
	public String getQualityTime(){
		return qualityTime;
	}
	public void setOutno(String outno){
		this.outno=outno;
	}
	public String getOutno(){
		return outno;
	}
	public void setNature(String nature){
		this.nature=nature;
	}
	public String getNature(){
		return nature;
	}
	public void setStockType(String stockType){
		this.stockType=stockType;
	}
	public String getStockType(){
		return stockType;
	}
	public void setToolType(String toolType){
		this.toolType=toolType;
	}
	public String getToolType(){
		return toolType;
	}
	public void setCheckEmpname(String checkEmpname){
		this.checkEmpname=checkEmpname;
	}
	public String getCheckEmpname(){
		return checkEmpname;
	}
	public void setLastCheckDate(Date lastCheckDate){
		this.lastCheckDate=lastCheckDate;
	}
	public Date getLastCheckDate(){
		return lastCheckDate;
	}
	public void setChecksNo(String checksNo){
		this.checksNo=checksNo;
	}
	public String getChecksNo(){
		return checksNo;
	}
	public void setCheckBackDate(Date checkBackDate){
		this.checkBackDate=checkBackDate;
	}
	public Date getCheckBackDate(){
		return checkBackDate;
	}
	public void setSendCheckEmpname(String sendCheckEmpname){
		this.sendCheckEmpname=sendCheckEmpname;
	}
	public String getSendCheckEmpname(){
		return sendCheckEmpname;
	}
	public void setGetCheckEmpname(String getCheckEmpname){
		this.getCheckEmpname=getCheckEmpname;
	}
	public String getGetCheckEmpname(){
		return getCheckEmpname;
	}
	public void setCheckOutTime(String checkOutTime){
		this.checkOutTime=checkOutTime;
	}
	public String getCheckOutTime(){
		return checkOutTime;
	}
	public void setSendCheckDate(Date sendCheckDate){
		this.sendCheckDate=sendCheckDate;
	}
	public Date getSendCheckDate(){
		return sendCheckDate;
	}
	public void setCheckLateDate(Date checkLateDate){
		this.checkLateDate=checkLateDate;
	}
	public Date getCheckLateDate(){
		return checkLateDate;
	}
	public void setTryDate(Date tryDate){
		this.tryDate=tryDate;
	}
	public Date getTryDate(){
		return tryDate;
	}
	public void setTryDept(String tryDept){
		this.tryDept=tryDept;
	}
	public String getTryDept(){
		return tryDept;
	}
	public void setScriptLevel(String scriptLevel){
		this.scriptLevel=scriptLevel;
	}
	public String getScriptLevel(){
		return scriptLevel;
	}
	public void setEquipNo(String equipNo){
		this.equipNo=equipNo;
	}
	public String getEquipNo(){
		return equipNo;
	}
	public void setMajor(String major){
		this.major=major;
	}
	public String getMajor(){
		return major;
	}
	public void setDisplayProductName(String displayProductName){
		this.displayProductName=displayProductName;
	}
	public String getDisplayProductName(){
		return displayProductName;
	}
	public void setMajorName(String majorName){
		this.majorName=majorName;
	}
	public String getMajorName(){
		return majorName;
	}
	public void setDiscardingCriteria(String discardingCriteria){
		this.discardingCriteria=discardingCriteria;
	}
	public String getDiscardingCriteria(){
		return discardingCriteria;
	}
	public void setRepealCriteria(String repealCriteria){
		this.repealCriteria=repealCriteria;
	}
	public String getRepealCriteria(){
		return repealCriteria;
	}
	public void setInventoryAcount(String inventoryAcount){
		this.inventoryAcount=inventoryAcount;
	}
	public String getInventoryAcount(){
		return inventoryAcount;
	}
	public void setFlag(String flag){
		this.flag=flag;
	}
	public String getFlag(){
		return flag;
	}
}

