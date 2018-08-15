package com.baihoo.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_cate </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhCate.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 11:52:20
 */
public class BhCate implements Serializable{
	/**
	 * @param id 			唯一识别主键
	 * @param pId		父主键
	 * @param tId		隶属祖宗层主键
	 * @param name 	分类名称
	 * @param layer 	分类层级
	 * @param updateTime 	最后更新时间
	 * @param createTime 		创建时间
	 */
	private String id;	
	private String pId;	
	private String tId;	
	private String name;	
	private String layer;	
	private Date updateTime;	
	private Date createTime;	

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setPId(String pId){
		this.pId=pId;
	}
	public String getPId(){
		return pId;
	}
	public void setTId(String tId){
		this.tId=tId;
	}
	public String getTId(){
		return tId;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setLayer(String layer){
		this.layer=layer;
	}
	public String getLayer(){
		return layer;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public BhCate(String pId, String tId, String name, String layer) {
		super();
		this.pId = pId;
		this.tId = tId;
		this.name = name;
		this.layer = layer;
	}
	public BhCate(String id) {
		super();
		this.id = id;
	}
	public BhCate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

