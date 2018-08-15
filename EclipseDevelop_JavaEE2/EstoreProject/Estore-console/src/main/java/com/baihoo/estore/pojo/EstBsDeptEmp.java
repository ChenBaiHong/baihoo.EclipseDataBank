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
 * <p>表名称: est_bs_dept_emp </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: EstBsDeptEmp.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-28 19:22:32
 */
@Entity
@Table(name="est_bs_dept_emp")
public class EstBsDeptEmp implements Serializable{

	/**
	 *
	 * @param est_bs_dept_emp_id		数据唯一识别ID
	 * @param dept_id		关联部门唯一识别ID
	 * @param dept_code		关联部门编号
	 * @param dept_name		关联部门名称
	 * @param emp_id		关联员工表唯一识别ID
	 * @param emp_code		关联员工编号
	 * @param emp_name		关联员工名字
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
	@Column(name = "est_bs_dept_emp_id")
	private Integer estBsDeptEmpId;	//数据唯一识别ID
	@Column(name = "dept_id")
	private Integer deptId;	//关联部门唯一识别ID
	@Column(name = "dept_code")
	private String deptCode;	//关联部门编号
	@Column(name = "dept_name")
	private String deptName;	//关联部门名称
	@Column(name = "emp_id")
	private Integer empId;	//关联员工表唯一识别ID
	@Column(name = "emp_code")
	private String empCode;	//关联员工编号
	@Column(name = "emp_name")
	private String empName;	//关联员工名字
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


	public EstBsDeptEmp() {
		super();
	}

	public void setEstBsDeptEmpId(Integer estBsDeptEmpId){
		this.estBsDeptEmpId=estBsDeptEmpId;
	}
	public Integer getEstBsDeptEmpId(){
		return estBsDeptEmpId;
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
	public void setEmpId(Integer empId){
		this.empId=empId;
	}
	public Integer getEmpId(){
		return empId;
	}
	public void setEmpCode(String empCode){
		this.empCode=empCode;
	}
	public String getEmpCode(){
		return empCode;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public String getEmpName(){
		return empName;
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

