package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_emp </p>
 * <p>表说明: 
 *
 *		后台员工用户信息表
 *
 * </p>
 * <p>类名称: EstBsEmp.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsEmp extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5020402161762143739L;
	private int estBsEmpId;	//后台员工用户数据唯一识别ID
	private String loginName;	//后台员工用户登陆名称
	private String empName;	//后台员工用户真实姓名
	private String empType;	//后台员工用户类型（1:超级管理员，2:普通管理员，3:普通员工 4:用户主帐号，5:用户子帐号）
	private String empCode;	//后台员工用户编号
	private String mainEmpId;	//后台员工用户主帐号ID
	private String empPwd;	//后台员工用户登录密码
	private String mobileNo;	//用户移动座机号码
	private String phoneNo;	//用户手机号
	private Date birthday;	//生日日期
	private String email;	//用户邮箱
	private String gender;	//用户性别
	private String icon;	//显示用户头像
	private String status;	//状态(0:可用，1:不可用 )
	private String salt;	//数据加密，加盐
	private Date lastLoginTime;	//最后登录时间
	private String isChangedTime;	//是否更改过密码（0:是 ，1:否）
	private int pwdErrorCount;	//连续输错密码次数
	private Date pwdErrorTime;	//最后输错密码时间
	private String remark;	//备注
	private String tittle;	//标题信息
	private int createdBy;	//数据创建者
	private Date createdTime;	//创建时间
	private Date lastUpdatedDate;	//最后更新时间
	private int lastUpdatedBy;	//最后数据更新者
	private String lastUpdatedIp;	//最后更新数据IP地址
	private int version;	//version 版本号

	public void setEstBsEmpId(int estBsEmpId){
		this.estBsEmpId=estBsEmpId;
	}
	public int getEstBsEmpId(){
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
	public void setPwdErrorCount(int pwdErrorCount){
		this.pwdErrorCount=pwdErrorCount;
	}
	public int getPwdErrorCount(){
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

