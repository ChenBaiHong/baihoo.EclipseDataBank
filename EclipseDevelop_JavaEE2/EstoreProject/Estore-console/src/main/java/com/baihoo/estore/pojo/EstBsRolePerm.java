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
 * <p>表名称: est_bs_role_perm </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: EstBsRolePerm.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-28 19:22:32
 */
@Entity
@Table(name="est_bs_role_perm")
public class EstBsRolePerm implements Serializable{

	/**
	 *
	 * @param est_bs_role_perm_id		数据唯一识别ID
	 * @param role_id		关联角色唯一识别ID
	 * @param role_code		关联角色编号
	 * @param role_name		关联角色名称
	 * @param perm_id		关联权限功能唯一识别ID
	 * @param perm_code		关联权限功能编码
	 * @param perm_name		关联权限功能名称
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
	@Column(name = "est_bs_role_perm_id")
	private Integer estBsRolePermId;	//数据唯一识别ID
	@Column(name = "role_id")
	private Integer roleId;	//关联角色唯一识别ID
	@Column(name = "role_code")
	private String roleCode;	//关联角色编号
	@Column(name = "role_name")
	private String roleName;	//关联角色名称
	@Column(name = "perm_id")
	private Integer permId;	//关联权限功能唯一识别ID
	@Column(name = "perm_code")
	private String permCode;	//关联权限功能编码
	@Column(name = "perm_name")
	private String permName;	//关联权限功能名称
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


	public EstBsRolePerm() {
		super();
	}

	public void setEstBsRolePermId(Integer estBsRolePermId){
		this.estBsRolePermId=estBsRolePermId;
	}
	public Integer getEstBsRolePermId(){
		return estBsRolePermId;
	}
	public void setRoleId(Integer roleId){
		this.roleId=roleId;
	}
	public Integer getRoleId(){
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
	public void setPermId(Integer permId){
		this.permId=permId;
	}
	public Integer getPermId(){
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

