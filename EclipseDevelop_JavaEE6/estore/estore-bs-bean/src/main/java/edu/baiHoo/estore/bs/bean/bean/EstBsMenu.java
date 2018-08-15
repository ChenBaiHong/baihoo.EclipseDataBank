package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_menu </p>
 * <p>表说明: 
 *
 *		角色授予可视菜单
 *
 * </p>
 * <p>类名称: EstBsMenu.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsMenu extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3555057132674328596L;
	private int estBsMenuId;	//数据唯一识别ID
	private String menuName;	//菜单名称
	private String menuCode;	//菜单编码
	private String menuType;	//类型:0-菜单 , 1-功能
	private String url;	//功能菜单的链接访问地址
	private String icon;	//菜单图标
	private String state;	//菜单状态:0-合并 , 1-展开
	private int sort;	//排序
	private int level;	//菜单层级
	private int menuPId;	//父级菜单唯一识别ID
	private String menuPName;	//父级菜单名称
	private String menuPCode;	//父级菜单编码
	private int menuRootId;	//顶级菜单唯一识别ID
	private String remark;	//备注
	private String tittle;	//标题信息
	private int createdBy;	//数据创建者
	private Date createdTime;	//创建时间
	private Date lastUpdatedDate;	//最后更新时间
	private int lastUpdatedBy;	//最后数据更新者
	private String lastUpdatedIp;	//最后更新数据IP地址
	private int version;	//version 版本号

	public void setEstBsMenuId(int estBsMenuId){
		this.estBsMenuId=estBsMenuId;
	}
	public int getEstBsMenuId(){
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
	public void setSort(int sort){
		this.sort=sort;
	}
	public int getSort(){
		return sort;
	}
	public void setLevel(int level){
		this.level=level;
	}
	public int getLevel(){
		return level;
	}
	public void setMenuPId(int menuPId){
		this.menuPId=menuPId;
	}
	public int getMenuPId(){
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
	public void setMenuRootId(int menuRootId){
		this.menuRootId=menuRootId;
	}
	public int getMenuRootId(){
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

