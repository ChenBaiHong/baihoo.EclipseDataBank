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
 * <p>表名称: est_bs_emp </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: EstBsEmp.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-28 19:22:32
 */
@Entity
@Table(name="est_bs_emp")
public class EstBsEmp implements Serializable{

	/**
	 *
	 * @param est_bs_emp_id		后台员工用户数据唯一识别ID
	 * @param login_name		后台员工用户登陆名称
	 * @param emp_name		后台员工用户真实姓名
	 * @param emp_type		后台员工用户类型（1:超级管理员，2:普通管理员，3:普通员工 4:用户主帐号，5:用户子帐号）
	 * @param emp_code		后台员工用户编号
	 * @param main_emp_id		后台员工用户主帐号ID
	 * @param emp_pwd		后台员工用户登录密码
	 * @param mobile_no		用户移动座机号码
	 * @param phone_no		用户手机号
	 * @param birthday		生日日期
	 * @param email		用户邮箱
	 * @param gender		用户性别
	 * @param icon		显示用户头像
	 * @param status		状态(0:可用，1:不可用 )
	 * @param salt		数据加密，加盐
	 * @param last_login_time		最后登录时间
	 * @param is_changed_time		是否更改过密码（0:是 ，1:否）
	 * @param pwd_error_count		连续输错密码次数
	 * @param pwd_error_time		最后输错密码时间
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
	@Column(name = "est_bs_emp_id")
	private Integer estBsEmpId;	//后台员工用户数据唯一识别ID
	@Column(name = "login_name")
	private String loginName;	//后台员工用户登陆名称
	@Column(name = "emp_name")
	private String empName;	//后台员工用户真实姓名
	@Column(name = "emp_type")
	private String empType;	//后台员工用户类型（1:超级管理员，2:普通管理员，3:普通员工 4:用户主帐号，5:用户子帐号）
	@Column(name = "emp_code")
	private String empCode;	//后台员工用户编号
	@Column(name = "main_emp_id")
	private String mainEmpId;	//后台员工用户主帐号ID
	@Column(name = "emp_pwd")
	private String empPwd;	//后台员工用户登录密码
	@Column(name = "mobile_no")
	private String mobileNo;	//用户移动座机号码
	@Column(name = "phone_no")
	private String phoneNo;	//用户手机号
	@Column(name = "birthday")
	private Date birthday;	//生日日期
	@Column(name = "email")
	private String email;	//用户邮箱
	@Column(name = "gender")
	private String gender;	//用户性别
	@Column(name = "icon")
	private String icon;	//显示用户头像
	@Column(name = "status")
	private String status;	//状态(0:可用，1:不可用 )
	@Column(name = "salt")
	private String salt;	//数据加密，加盐
	@Column(name = "last_login_time")
	private Date lastLoginTime;	//最后登录时间
	@Column(name = "is_changed_time")
	private String isChangedTime;	//是否更改过密码（0:是 ，1:否）
	@Column(name = "pwd_error_count")
	private Integer pwdErrorCount;	//连续输错密码次数
	@Column(name = "pwd_error_time")
	private Date pwdErrorTime;	//最后输错密码时间
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


	public EstBsEmp() {
		super();
	}

	public void setEstBsEmpId(Integer estBsEmpId){
		this.estBsEmpId=estBsEmpId;
	}
	public Integer getEstBsEmpId(){
		return estBsEmpId;
	}
	public void setLoginName(String loginName){
		this.loginName=loginName;
	}
	public String getLoginName(){
		return loginName;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public String getEmpName(){
		return empName;
	}
	public void setEmpType(String empType){
		this.empType=empType;
	}
	public String getEmpType(){
		return empType;
	}
	public void setEmpCode(String empCode){
		this.empCode=empCode;
	}
	public String getEmpCode(){
		return empCode;
	}
	public void setMainEmpId(String mainEmpId){
		this.mainEmpId=mainEmpId;
	}
	public String getMainEmpId(){
		return mainEmpId;
	}
	public void setEmpPwd(String empPwd){
		this.empPwd=empPwd;
	}
	public String getEmpPwd(){
		return empPwd;
	}
	public void setMobileNo(String mobileNo){
		this.mobileNo=mobileNo;
	}
	public String getMobileNo(){
		return mobileNo;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}
	public Date getBirthday(){
		return birthday;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	public void setIcon(String icon){
		this.icon=icon;
	}
	public String getIcon(){
		return icon;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void setSalt(String salt){
		this.salt=salt;
	}
	public String getSalt(){
		return salt;
	}
	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime=lastLoginTime;
	}
	public Date getLastLoginTime(){
		return lastLoginTime;
	}
	public void setIsChangedTime(String isChangedTime){
		this.isChangedTime=isChangedTime;
	}
	public String getIsChangedTime(){
		return isChangedTime;
	}
	public void setPwdErrorCount(Integer pwdErrorCount){
		this.pwdErrorCount=pwdErrorCount;
	}
	public Integer getPwdErrorCount(){
		return pwdErrorCount;
	}
	public void setPwdErrorTime(Date pwdErrorTime){
		this.pwdErrorTime=pwdErrorTime;
	}
	public Date getPwdErrorTime(){
		return pwdErrorTime;
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

