package com.baihoo.mybatis.pojoDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
 * @date 2018-07-20 11:52:20
 */
public class BhOrdersDto {
	/**
	 * @param id					唯一识别主键
	 * @param bhUser			订单用户 , 一个订单对应一个用户
	 * @param orderTime	下单时间
	 * @param money			订单总价
	 * @param state				订单状态
	 * @param createTime
	 * @param updateTime
	 * @param oiList 			一个订单有多个订单项信息 ， 建立一对多的关系
	 */
	private String id;	
	private BhUserDto bhUserDto; private String uId;
	private String orderTime;	
	private Double money;	
	private String state;	
	private Date createTime;
	private Date updateTime;
	/**
	 * 一个订单有多个订单项信息 ， 建立一对多的关系
	 */
	List<BhOrderItemDto> oiList = new ArrayList<BhOrderItemDto>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BhUserDto getBhUserDto() {
		return bhUserDto;
	}
	public void setBhUserDto(BhUserDto bhUserDto) {
		this.bhUserDto = bhUserDto;
	}
	
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public List<BhOrderItemDto> getOiList() {
		return oiList;
	}
	public void setOiList(List<BhOrderItemDto> oiList) {
		this.oiList = oiList;
	}
	@Override
	public String toString() {
		return "BhOrdersDto [id=" + id + ", bhUserDto=" + bhUserDto + ", orderTime=" + orderTime + ", money=" + money
				+ ", state=" + state + ", createTime=" + createTime + ", updateTime=" + updateTime + ", oiList="
				+ oiList + "]";
	}
}

