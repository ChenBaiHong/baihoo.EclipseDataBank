package com.baihoo.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_orders </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhOrders.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 15:16:35
 */
public class BhOrders implements Serializable{
	/**
	 * @param id					唯一识别主键
	 * @param uId				订单用户 , 一个订单对应一个用户
	 * @param orderTime	下单时间
	 * @param money			订单总价
	 * @param state				订单状态
	 * @param createTime
	 * @param updateTime
	 */
	private String id;
	private String uId;
	private Date orderTime;	
	private Double money;
	private String state;
	private Date createTime;
	private Date updateTime;

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setUId(String uId){
		this.uId=uId;
	}
	public String getUId(){
		return uId;
	}
	public void setOrderTime(Date orderTime){
		this.orderTime=orderTime;
	}
	public Date getOrderTime(){
		return orderTime;
	}
	public void setMoney(Double money){
		this.money=money;
	}
	public Double getMoney(){
		return money;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return state;
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
	public BhOrders(String uId, Date orderTime, Double money, String state) {
		super();
		this.uId = uId;
		this.orderTime = orderTime;
		this.money = money;
		this.state = state;
	}
	public BhOrders(String id) {
		super();
		this.id = id;
	}
	public BhOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

