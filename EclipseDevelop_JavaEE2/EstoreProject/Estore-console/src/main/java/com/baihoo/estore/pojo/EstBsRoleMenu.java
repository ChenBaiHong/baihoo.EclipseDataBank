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
 * <p>表名称: est_bs_role_menu </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: EstBsRoleMenu.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-28 19:22:32
 */
@Entity
@Table(name="est_bs_role_menu")
public class EstBsRoleMenu implements Serializable{

	/**
	 *
	 * @param est_bs_role_menu_id		数据唯一识别ID
	 * @param role_id		关联角色唯一识别ID
	 * @param role_code		关联角色编号
	 * @param role_name		关联角色名称
	 * @param menu_id		关联菜单唯一识别ID
	 * @param menu_code		关联菜单编号
	 * @param menu_name		关联菜单名称
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
	@Column(name = "est_bs_role_menu_id")
	private Integer estBsRoleMenuId;	//数据唯一识别ID
	@Column(name = "role_id")
	private Integer roleId;	//关联角色唯一识别ID
	@Column(name = "role_code")
	private String roleCode;	//关联角色编号
	@Column(name = "role_name")
	private String roleName;	//关联角色名称
	@Column(name = "menu_id")
	private Integer menuId;	//关联菜单唯一识别ID
	@Column(name = "menu_code")
	private String menuCode;	//关联菜单编号
	@Column(name = "menu_name")
	private String menuName;	//关联菜单名称
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


	public EstBsRoleMenu() {
		super();
	}

	public void setEstBsRoleMenuId(Integer estBsRoleMenuId){
		this.estBsRoleMenuId=estBsRoleMenuId;
	}
	public Integer getEstBsRoleMenuId(){
		return estBsRoleMenuId;
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
	public void setMenuId(Integer menuId){
		this.menuId=menuId;
	}
	public Integer getMenuId(){
		return menuId;
	}
	public void setMenuCode(String menuCode){
		this.menuCode=menuCode;
	}
	public String getMenuCode(){
		return menuCode;
	}
	public void setMenuName(String menuName){
		this.menuName=menuName;
	}
	public String getMenuName(){
		return menuName;
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

