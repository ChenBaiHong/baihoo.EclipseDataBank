package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_lead_dept </p>
 * <p>表说明: 
 *
 *		领导执属部门信息表（一个领导，可以领导多个部门班子）
 *
 * </p>
 * <p>类名称: EstBsLeadDept.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsLeadDept extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 80534604451890267L;
	private int estBsLeadDeptId;	//数据唯一识别ID
	private int leadId;	//关联员工表唯一识别ID
	private String leadCode;	//关联领导编号
	private String leadName;	//关联领导名字
	private int deptId;	//关联部门唯一识别ID
	private String deptCode;	//关联部门编号
	private String deptName;	//关联部门名称
	private String remark;	//备注
	private String tittle;	//标题信息
	private int createdBy;	//数据创建者
	private Date createdTime;	//创建时间
	private Date lastUpdatedDate;	//最后更新时间
	private int lastUpdatedBy;	//最后数据更新者
	private String lastUpdatedIp;	//最后更新数据IP地址
	private int version;	//version 版本号

	public void setEstBsLeadDeptId(int estBsLeadDeptId){
		this.estBsLeadDeptId=estBsLeadDeptId;
	}
	public int getEstBsLeadDeptId(){
		return estBsLeadDeptId;
	}
	public void setLeadId(int leadId){
		this.leadId=leadId;
	}
	public int getLeadId(){
		return leadId;
	}
	public void setLeadCode(String leadCode){
		this.leadCode=leadCode;
	}
	public String getLeadCode(){
		return leadCode;
	}
	public void setLeadName(String leadName){
		this.leadName=leadName;
	}
	public String getLeadName(){
		return leadName;
	}
	public void setDeptId(int deptId){
		this.deptId=deptId;
	}
	public int getDeptId(){
		return deptId;
	}
	public void setDeptCode(String deptCode){
		this.deptCode=deptCode;
	}
	public String getDeptCode(){
		return deptCode;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}
	public String getDeptName(){
		return deptName;
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
	public void setCreatedBy(int createdBy){
		this.createdBy=createdBy;
	}
	public int getCreatedBy(){
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
	public void setLastUpdatedBy(int lastUpdatedBy){
		this.lastUpdatedBy=lastUpdatedBy;
	}
	public int getLastUpdatedBy(){
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

