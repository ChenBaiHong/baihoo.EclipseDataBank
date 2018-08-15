package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_dept </p>
 * <p>表说明: 
 *
 *		后台部门管理信息表
 *
 * </p>
 * <p>类名称: EstBsDept.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsDept extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int estBsDeptId;	//部门数据唯一识别ID
	private String deptName;	//部门名称
	private String deptCode;	//部门编号
	private String mobileNo;	//部门座机号码
	private String deptType;	//部门类别
	private int level;	//部门层级
	private int deptPId;	//部门父级唯一识别ID
	private String deptPCode;	//部门父级编号
	private String deptPName;	//部门父级名称
	private int deptRootId;	//顶级部门节点唯一识别ID
	private String remark;	//备注
	private String tittle;	//标题信息
	private long createdBy;	//数据创建者
	private Date createdTime;	//创建时间
	private Date lastUpdatedDate;	//最后更新时间
	private long lastUpdatedBy;	//最后数据更新者
	private String lastUpdatedIp;	//最后更新数据IP地址
	private int version;	//version 版本号

	public void setEstBsDeptId(int estBsDeptId){
		this.estBsDeptId=estBsDeptId;
	}
	public int getEstBsDeptId(){
		return estBsDeptId;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}
	public String getDeptName(){
		return deptName;
	}
	public void setDeptCode(String deptCode){
		this.deptCode=deptCode;
	}
	public String getDeptCode(){
		return deptCode;
	}
	public void setMobileNo(String mobileNo){
		this.mobileNo=mobileNo;
	}
	public String getMobileNo(){
		return mobileNo;
	}
	public void setDeptType(String deptType){
		this.deptType=deptType;
	}
	public String getDeptType(){
		return deptType;
	}
	public void setLevel(int level){
		this.level=level;
	}
	public int getLevel(){
		return level;
	}
	public void setDeptPId(int deptPId){
		this.deptPId=deptPId;
	}
	public int getDeptPId(){
		return deptPId;
	}
	public void setDeptPCode(String deptPCode){
		this.deptPCode=deptPCode;
	}
	public String getDeptPCode(){
		return deptPCode;
	}
	public void setDeptPName(String deptPName){
		this.deptPName=deptPName;
	}
	public String getDeptPName(){
		return deptPName;
	}
	public void setDeptRootId(int deptRootId){
		this.deptRootId=deptRootId;
	}
	public int getDeptRootId(){
		return deptRootId;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public void setTittle(String tittle){
		this.tittle=tittle;
	}
	public String getTittle(){
		return tittle;
	}
	public void setCreatedBy(long createdBy){
		this.createdBy=createdBy;
	}
	public long getCreatedBy(){
		return createdBy;
	}
	public void setCreatedTime(Date createdTime){
		this.createdTime=createdTime;
	}
	public Date getCreatedTime(){
		return createdTime;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate){
		this.lastUpdatedDate=lastUpdatedDate;
	}
	public Date getLastUpdatedDate(){
		return lastUpdatedDate;
	}
	public void setLastUpdatedBy(long lastUpdatedBy){
		this.lastUpdatedBy=lastUpdatedBy;
	}
	public long getLastUpdatedBy(){
		return lastUpdatedBy;
	}
	public void setLastUpdatedIp(String lastUpdatedIp){
		this.lastUpdatedIp=lastUpdatedIp;
	}
	public String getLastUpdatedIp(){
		return lastUpdatedIp;
	}
	public void setVersion(int version){
		this.version=version;
	}
	public int getVersion(){
		return version;
	}
}

