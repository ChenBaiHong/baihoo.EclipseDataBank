package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_dept_emp </p>
 * <p>表说明: 
 *
 *		分配员工隶属部门（一个部门，分配了多个员工）
 *
 * </p>
 * <p>类名称: EstBsDeptEmp.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsDeptEmp extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4742676804269487614L;
	private int estBsDeptEmpId;	//数据唯一识别ID
	private int deptId;	//关联部门唯一识别ID
	private String deptCode;	//关联部门编号
	private String deptName;	//关联部门名称
	private int empId;	//关联员工表唯一识别ID
	private String empCode;	//关联员工编号
	private String empName;	//关联员工名字
	private String remark;	//备注
	private String tittle;	//标题信息
	private int createdBy;	//数据创建者
	private Date createdTime;	//创建时间
	private Date lastUpdatedDate;	//最后更新时间
	private int lastUpdatedBy;	//最后数据更新者
	private String lastUpdatedIp;	//最后更新数据IP地址
	private int version;	//version 版本号

	public void setEstBsDeptEmpId(int estBsDeptEmpId){
		this.estBsDeptEmpId=estBsDeptEmpId;
	}
	public int getEstBsDeptEmpId(){
		return estBsDeptEmpId;
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
	public void setEmpId(int empId){
		this.empId=empId;
	}
	public int getEmpId(){
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

