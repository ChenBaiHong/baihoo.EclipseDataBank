package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_role_menu </p>
 * <p>表说明: 
 *
 *		建立角色和菜单之间的关系，一个角色可有多个菜单功能
 *
 * </p>
 * <p>类名称: EstBsRoleMenu.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsRoleMenu extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int estBsRoleMenu;	//数据唯一识别ID
	private int roleId;	//关联角色唯一识别ID
	private String roleCode;	//关联角色编号
	private String roleName;	//关联角色名称
	private int menuId;	//关联菜单唯一识别ID
	private String menuCode;	//关联菜单编号
	private String menuName;	//关联菜单名称
	private String remark;	//备注
	private String tittle;	//标题信息
	private int createdBy;	//数据创建者
	private Date createdTime;	//创建时间
	private Date lastUpdatedDate;	//最后更新时间
	private int lastUpdatedBy;	//最后数据更新者
	private String lastUpdatedIp;	//最后更新数据IP地址
	private int version;	//version 版本号

	public void setEstBsRoleMenu(int estBsRoleMenu){
		this.estBsRoleMenu=estBsRoleMenu;
	}
	public int getEstBsRoleMenu(){
		return estBsRoleMenu;
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
	public void setMenuId(int menuId){
		this.menuId=menuId;
	}
	public int getMenuId(){
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

