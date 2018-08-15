package com.baihoo.estore.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: est_bs_lead_dept </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: EstBsLeadDept.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-28 19:22:32
 */
@Entity
@Table(name="est_bs_lead_dept")
public class EstBsLeadDept implements Serializable{

	/**
	 *
	 * @param est_bs_lead_dept_id		数据唯一识别ID
	 * @param lead_id		关联员工表唯一识别ID
	 * @param lead_code		关联领导编号
	 * @param lead_name		关联领导名字
	 * @param dept_id		关联部门唯一识别ID
	 * @param dept_code		关联部门编号
	 * @param dept_name		关联部门名称
	 * @param remark		备注
	 * @param tittle		标题信息
	 * @param created_by		数据创建者
	 * @param created_time		创建时间
	 * @param last_updated_date		最后更新时间
	 * @param last_updated_by		最后数据更新者
	 * @param last_updated_ip		最后更新数据IP地址
	 * @param version		version 版本号
	 */

	@Id
	@GeneratedValue
	@Column(name = "est_bs_lead_dept_id")
	private Integer estBsLeadDeptId;	//数据唯一识别ID
	@Column(name = "lead_id")
	private Integer leadId;	//关联员工表唯一识别ID
	@Column(name = "lead_code")
	private String leadCode;	//关联领导编号
	@Column(name = "lead_name")
	private String leadName;	//关联领导名字
	@Column(name = "dept_id")
	private Integer deptId;	//关联部门唯一识别ID
	@Column(name = "dept_code")
	private String deptCode;	//关联部门编号
	@Column(name = "dept_name")
	private String deptName;	//关联部门名称
	@Column(name = "remark")
	private String remark;	//备注
	@Column(name = "tittle")
	private String tittle;	//标题信息
	@Column(name = "created_by")
	private Integer createdBy;	//数据创建者
	@Column(name = "created_time")
	private Date createdTime;	//创建时间
	@Column(name = "last_updated_date")
	private Date lastUpdatedDate;	//最后更新时间
	@Column(name = "last_updated_by")
	private Integer lastUpdatedBy;	//最后数据更新者
	@Column(name = "last_updated_ip")
	private String lastUpdatedIp;	//最后更新数据IP地址
	@Column(name = "version")
	private Integer version;	//version 版本号


	public EstBsLeadDept() {
		super();
	}

	public void setEstBsLeadDeptId(Integer estBsLeadDeptId){
		this.estBsLeadDeptId=estBsLeadDeptId;
	}
	public Integer getEstBsLeadDeptId(){
		return estBsLeadDeptId;
	}
	public void setLeadId(Integer leadId){
		this.leadId=leadId;
	}
	public Integer getLeadId(){
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
	public void setDeptId(Integer deptId){
		this.deptId=deptId;
	}
	public Integer getDeptId(){
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
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public Integer getCreatedBy(){
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
	public void setLastUpdatedBy(Integer lastUpdatedBy){
		this.lastUpdatedBy=lastUpdatedBy;
	}
	public Integer getLastUpdatedBy(){
		return lastUpdatedBy;
	}
	public void setLastUpdatedIp(String lastUpdatedIp){
		this.lastUpdatedIp=lastUpdatedIp;
	}
	public String getLastUpdatedIp(){
		return lastUpdatedIp;
	}
	public void setVersion(Integer version){
		this.version=version;
	}
	public Integer getVersion(){
		return version;
	}
}

