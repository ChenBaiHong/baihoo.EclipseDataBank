package com.baihoo.mybatis.pojo;

import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_brand </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhBrand.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 11:52:20
 */
public class BhBrand {
	/**
	 * @param id					主键
	 * @param name			品牌名称
	 * @param description	品牌描述
	 * @param createTime
	 * @param updateTime
	 * @param 
	 */
	private String id;	
	private String name;	
	private String description;	
	private Date createTime;
	private Date updateTime;

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
	public BhBrand( String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public BhBrand(String id) {
		super();
		this.id = id;
	}
	public BhBrand() {
		super();
	}
	
}

