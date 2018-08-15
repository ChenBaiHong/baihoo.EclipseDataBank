package edu.baiHoo.estore.bs.bean.bean;

import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;
import java.util.Date;
/**
 *
 *
 * <p> 项目名称：baiHoo 电子商城</p>
 * <p>表名称: est_bs_perm </p>
 * <p>表说明: 
 *
 *		功能菜单包含权限功能
 *
 * </p>
 * <p>类名称: EstBsPerm.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-03-23 14:31:24
 */
public class EstBsPerm extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7885896450224256914L;
	private int estBsPermId;	//数据唯一识别ID
	private String permName;	//权限功能名称
	private String permCode;	//权限功能编码
	private String url;	//功能权限的链接访问地址
	private String state;	//功能权限状态:0-开锁（禁止权限） , 1-闭锁（开启权限）
	private int sort;	//排序
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

	public void setEstBsPermId(int estBsPermId){
		this.estBsPermId=estBsPermId;
	}
	public int getEstBsPermId(){
		return estBsPermId;
	}
	public void setPermName(String permName){
		this.permName=permName;
	}
	public String getPermName(){
		return permName;
	}
	public void setPermCode(String permCode){
		this.permCode=permCode;
	}
	public String getPermCode(){
		return permCode;
	}
	public void setUrl(String url){
		this.url=url;
	}
	public String getUrl(){
		return url;
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

