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
 * <p>表名称: est_bs_dept </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: EstBsDept.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-28 19:22:32
 */
@Entity
@Table(name="est_bs_dept")
public class EstBsDept implements Serializable{

	/**
	 *
	 * @param est_bs_dept_id		部门数据唯一识别ID
	 * @param dept_name		部门名称
	 * @param dept_code		部门编号
	 * @param mobile_no		部门座机号码
	 * @param dept_type		部门类别
	 * @param level		部门层级
	 * @param dept_p_id		部门父级唯一识别ID
	 * @param dept_p_code		部门父级编号
	 * @param dept_p_name		部门父级名称
	 * @param dept_root_id		顶级部门节点唯一识别ID
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
	@Column(name = "est_bs_dept_id")
	private Integer estBsDeptId;	//部门数据唯一识别ID
	@Column(name = "dept_name")
	private String deptName;	//部门名称
	@Column(name = "dept_code")
	private String deptCode;	//部门编号
	@Column(name = "mobile_no")
	private String mobileNo;	//部门座机号码
	@Column(name = "dept_type")
	private String deptType;	//部门类别
	@Column(name = "level")
	private Integer level;	//部门层级
	@Column(name = "dept_p_id")
	private Integer deptPId;	//部门父级唯一识别ID
	@Column(name = "dept_p_code")
	private String deptPCode;	//部门父级编号
	@Column(name = "dept_p_name")
	private String deptPName;	//部门父级名称
	@Column(name = "dept_root_id")
	private Integer deptRootId;	//顶级部门节点唯一识别ID
	@Column(name = "remark")
	private String remark;	//备注
	@Column(name = "tittle")
	private String tittle;	//标题信息
	@Column(name = "created_by")
	private String createdBy;	//数据创建者
	@Column(name = "created_time")
	private Date createdTime;	//创建时间
	@Column(name = "last_updated_date")
	private Date lastUpdatedDate;	//最后更新时间
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;	//最后数据更新者
	@Column(name = "last_updated_ip")
	private String lastUpdatedIp;	//最后更新数据IP地址
	@Column(name = "version")
	private Integer version;	//version 版本号


	public EstBsDept() {
		super();
	}

	public void setEstBsDeptId(Integer estBsDeptId){
		this.estBsDeptId=estBsDeptId;
	}
	public Integer getEstBsDeptId(){
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
	public void setLevel(Integer level){
		this.level=level;
	}
	public Integer getLevel(){
		return level;
	}
	public void setDeptPId(Integer deptPId){
		this.deptPId=deptPId;
	}
	public Integer getDeptPId(){
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
	public void setDeptRootId(Integer deptRootId){
		this.deptRootId=deptRootId;
	}
	public Integer getDeptRootId(){
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
	public void setCreatedBy(String createdBy){
		this.createdBy=createdBy;
	}
	public String getCreatedBy(){
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
	public void setLastUpdatedBy(String lastUpdatedBy){
		this.lastUpdatedBy=lastUpdatedBy;
	}
	public String getLastUpdatedBy(){
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

