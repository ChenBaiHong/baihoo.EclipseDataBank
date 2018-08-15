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
 * <p>表名称: est_bs_menu </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: EstBsMenu.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-28 19:22:32
 */
@Entity
@Table(name="est_bs_menu")
public class EstBsMenu implements Serializable{

	/**
	 *
	 * @param est_bs_menu_id		数据唯一识别ID
	 * @param menu_name		菜单名称
	 * @param menu_code		菜单编码
	 * @param menu_type		类型:0-菜单 , 1-功能
	 * @param url		功能菜单的链接访问地址
	 * @param icon		菜单图标
	 * @param state		菜单状态:0-合并 , 1-展开
	 * @param sort		排序
	 * @param level		菜单层级
	 * @param menu_p_id		父级菜单唯一识别ID
	 * @param menu_p_name		父级菜单名称
	 * @param menu_p_code		父级菜单编码
	 * @param menu_root_id		顶级菜单唯一识别ID
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
	@Column(name = "est_bs_menu_id")
	private Integer estBsMenuId;	//数据唯一识别ID
	@Column(name = "menu_name")
	private String menuName;	//菜单名称
	@Column(name = "menu_code")
	private String menuCode;	//菜单编码
	@Column(name = "menu_type")
	private String menuType;	//类型:0-菜单 , 1-功能
	@Column(name = "url")
	private String url;	//功能菜单的链接访问地址
	@Column(name = "icon")
	private String icon;	//菜单图标
	@Column(name = "state")
	private String state;	//菜单状态:0-合并 , 1-展开
	@Column(name = "sort")
	private Integer sort;	//排序
	@Column(name = "level")
	private Integer level;	//菜单层级
	@Column(name = "menu_p_id")
	private Integer menuPId;	//父级菜单唯一识别ID
	@Column(name = "menu_p_name")
	private String menuPName;	//父级菜单名称
	@Column(name = "menu_p_code")
	private String menuPCode;	//父级菜单编码
	@Column(name = "menu_root_id")
	private Integer menuRootId;	//顶级菜单唯一识别ID
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


	public EstBsMenu() {
		super();
	}

	public void setEstBsMenuId(Integer estBsMenuId){
		this.estBsMenuId=estBsMenuId;
	}
	public Integer getEstBsMenuId(){
		return estBsMenuId;
	}
	public void setMenuName(String menuName){
		this.menuName=menuName;
	}
	public String getMenuName(){
		return menuName;
	}
	public void setMenuCode(String menuCode){
		this.menuCode=menuCode;
	}
	public String getMenuCode(){
		return menuCode;
	}
	public void setMenuType(String menuType){
		this.menuType=menuType;
	}
	public String getMenuType(){
		return menuType;
	}
	public void setUrl(String url){
		this.url=url;
	}
	public String getUrl(){
		return url;
	}
	public void setIcon(String icon){
		this.icon=icon;
	}
	public String getIcon(){
		return icon;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return state;
	}
	public void setSort(Integer sort){
		this.sort=sort;
	}
	public Integer getSort(){
		return sort;
	}
	public void setLevel(Integer level){
		this.level=level;
	}
	public Integer getLevel(){
		return level;
	}
	public void setMenuPId(Integer menuPId){
		this.menuPId=menuPId;
	}
	public Integer getMenuPId(){
		return menuPId;
	}
	public void setMenuPName(String menuPName){
		this.menuPName=menuPName;
	}
	public String getMenuPName(){
		return menuPName;
	}
	public void setMenuPCode(String menuPCode){
		this.menuPCode=menuPCode;
	}
	public String getMenuPCode(){
		return menuPCode;
	}
	public void setMenuRootId(Integer menuRootId){
		this.menuRootId=menuRootId;
	}
	public Integer getMenuRootId(){
		return menuRootId;
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

