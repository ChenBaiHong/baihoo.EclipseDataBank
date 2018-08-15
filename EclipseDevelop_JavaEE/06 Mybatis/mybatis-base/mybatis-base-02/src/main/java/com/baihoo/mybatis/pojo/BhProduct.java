package com.baihoo.mybatis.pojo;

import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_product </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhProduct.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 15:16:35
 */
public class BhProduct {
	/**
	 * @param id						唯一识别主键
	 * @param name				产品名称
	 * @param price					价格
	 * @param cId 					关联分类 ， 一个商品关联它的分类 ， 一对一
	 * @param bId	 				关联品牌 ， 一个商品关联它的品牌，一对一
	 * @param createTime		创建时间
	 * @param updateTime		最后更新时间
	 */
	private String id;	
	private String name;	
	private Double price;
	private String cId;
	private String bId;
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
	public void setPrice(Double price){
		this.price=price;
	}
	public Double getPrice(){
		return price;
	}
	public void setCId(String cId){
		this.cId=cId;
	}
	public String getCId(){
		return cId;
	}
	public void setBId(String bId){
		this.bId=bId;
	}
	public String getBId(){
		return bId;
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
	public BhProduct(String name, Double price, String cId, String bId) {
		super();
		this.name = name;
		this.price = price;
		this.cId = cId;
		this.bId = bId;
	}
	public BhProduct(String id) {
		super();
		this.id = id;
	}
	public BhProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

