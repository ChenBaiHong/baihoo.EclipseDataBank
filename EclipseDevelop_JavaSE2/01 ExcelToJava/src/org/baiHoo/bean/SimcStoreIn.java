package org.baiHoo.bean;

import java.util.Date;

import org.baiHoo.anno.OraFieldName;
import org.baiHoo.anno.OraTableName;
import org.baiHoo.anno.PrimaryKey;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: simc_store_in </p>
 * <p>表说明: 
 *
 *		模拟我公司库房台账
 *
 * </p>
 * <p>类名称: SimcStoreIn.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.Chen
 * @date 2018-06-18 12:00:55
 */
@OraTableName(tableName = "SIMC_STORE_IN")
public class SimcStoreIn  extends BaseBean {

	@OraFieldName(fieldName = "OBJECT_ID")
	@PrimaryKey
	private String objectId;	//主键
	@OraFieldName(fieldName = "DRAWING_NO")
	private String drawingNo;	//图号
	@OraFieldName(fieldName = "GPN")
	private String gpn;	//厂内统一编号
	@OraFieldName(fieldName = "CUSTOM_CODE")
	private String customCode;	//自编号
	@OraFieldName(fieldName = "CUSTOM_NAME")
	private String customName;	//实体名称
	@OraFieldName(fieldName = "SPECIFICATION")
	private String specification;	//规格/型号
	@OraFieldName(fieldName = "BRAND")
	private String brand;	//品牌
	@OraFieldName(fieldName = "MANUFACTURER")
	private String manufacturer;	//生产制造单位
	@OraFieldName(fieldName = "FACTORY_NO")
	private String factoryNo;	//出厂编号
	@OraFieldName(fieldName = "SERIAL_NUMBER")
	private String serialNumber;	//序列号
	@OraFieldName(fieldName = "INSTORE_DATE")
	private Date instoreDate;	//入库时间
	@OraFieldName(fieldName = "UNIT_PRICE")
	private String unitPrice;	//单位价格
	@OraFieldName(fieldName = "INSTORE_NUM")
	private String instoreNum;	//入库数量
	@OraFieldName(fieldName = "FLAG")
	private String flag;	//有效性
	@OraFieldName(fieldName = "ATTRIBUTE1")
	private String attribute1;	//#备注
	@OraFieldName(fieldName = "ATTRIBUTE2")
	private String attribute2;	//#备注
	@OraFieldName(fieldName = "ATTRIBUTE3")
	private String attribute3;	//#备注
	@OraFieldName(fieldName = "CREATED_BY")
	private String createdBy;	//#备注
	@OraFieldName(fieldName = "CREATION_DATE")
	private Date creationDate;	//创建时间
	@OraFieldName(fieldName = "LAST_UPDATED_BY")
	private String lastUpdatedBy;	//最后更新人
	@OraFieldName(fieldName = "LAST_UPDATE_DATE")
	private Date lastUpdateDate;	//最后更新时间
	@OraFieldName(fieldName = "LAST_UPDATE_IP")
	private String lastUpdateIp;	//最后更新的IP地址
	@OraFieldName(fieldName = "SECURITY_LEVEL")
	private String securityLevel;	//安全级别
	@OraFieldName(fieldName = "PID")
	private String pid;	//附件父ID

	public void setObjectId(String objectId){
		this.objectId=objectId;
	}
	public String getObjectId(){
		return objectId;
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
	public void setSerialNumber(String serialNumber){
		this.serialNumber=serialNumber;
	}
	public String getSerialNumber(){
		return serialNumber;
	}
	public void setInstoreDate(Date instoreDate){
		this.instoreDate=instoreDate;
	}
	public Date getInstoreDate(){
		return instoreDate;
	}
	public void setUnitPrice(String unitPrice){
		this.unitPrice=unitPrice;
	}
	public String getUnitPrice(){
		return unitPrice;
	}
	public void setInstoreNum(String instoreNum){
		this.instoreNum=instoreNum;
	}
	public String getInstoreNum(){
		return instoreNum;
	}
	public void setFlag(String flag){
		this.flag=flag;
	}
	public String getFlag(){
		return flag;
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
	public void setSecurityLevel(String securityLevel){
		this.securityLevel=securityLevel;
	}
	public String getSecurityLevel(){
		return securityLevel;
	}
	public void setPid(String pid){
		this.pid=pid;
	}
	public String getPid(){
		return pid;
	}
}

