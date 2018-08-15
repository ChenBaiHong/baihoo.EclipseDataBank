package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_role_perm </p>
 * <p>表说明: 
 *
 *		功能权限功能授予角色，功能权限和角色之间是多对多的关系
 *
 * </p>
 * <p>类名称: EstBsRolePerm.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsRolePerm extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1654703491157499661L;
	private int estBsRolePermId;	//数据唯一识别ID
	private int roleId;	//关联角色唯一识别ID
	private String roleCode;	//关联角色编号
	private String roleName;	//关联角色名称
	private int permId;	//关联权限功能唯一识别ID
	private String permCode;	//关联权限功能编码
	private String permName;	//关联权限功能名称
	private String remark;	//备注
	private String tittle;	//标题信息
	private int createdBy;	//数据创建者
	private Date createdTime;	//创建时间
	private Date lastUpdatedDate;	//最后更新时间
	private int lastUpdatedBy;	//最后数据更新者
	private String lastUpdatedIp;	//最后更新数据IP地址
	private int version;	//version 版本号

	public void setEstBsRolePermId(int estBsRolePermId){
		this.estBsRolePermId=estBsRolePermId;
	}
	public int getEstBsRolePermId(){
		return estBsRolePermId;
	}
	public void setRoleId(int roleId){
		this.roleId=roleId;
	}
	public int getRoleId(){
		return roleId;
	}
	public void setRoleCode(String roleCode){
		this.roleCode=roleCode;
	}
	public String getRoleCode(){
		return roleCode;
	}
	public void setRoleName(String roleName){
		this.roleName=roleName;
	}
	public String getRoleName(){
		return roleName;
	}
	public void setPermId(int permId){
		this.permId=permId;
	}
	public int getPermId(){
		return permId;
	}
	public void setPermCode(String permCode){
		this.permCode=permCode;
	}
	public String getPermCode(){
		return permCode;
	}
	public void setPermName(String permName){
		this.permName=permName;
	}
	public String getPermName(){
		return permName;
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

