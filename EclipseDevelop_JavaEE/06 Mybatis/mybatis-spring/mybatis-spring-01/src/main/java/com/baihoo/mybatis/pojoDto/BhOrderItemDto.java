package com.baihoo.mybatis.pojoDto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * <p> 项目名称：baiHoo 出品系列</p>
 * <p>表名称: bh_order_item </p>
 * <p>表说明: 
 *
 *		
 *
 * </p>
 * <p>类名称: BhOrderItem.java </p>
 * <p>类说明: 
 *
 *
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018-07-20 11:52:20
 */
public class BhOrderItemDto implements Serializable{
	/**
	 * @param id				唯一识别主键
	 * @param buyNum	购买商品数量
	 * @param price			订单项产品单价
	 * @param subtotal	小计产品价钱
	 * @param bhProduct	关联产品 , 一对一，一个订单项是关联的那个产品
	 * @param bhOrders		关联订单 , 一对一，一个订单项是关联的一个订单
	 * @param createTime
	 * @param updateTime
	 */
	private String id;	
	private String buyNum;	
	private Double price;	
	private Double subtotal;	
	private BhProductDto bhProductDto; 
	private BhOrdersDto bhOrdersDto; 
	private Date createTime;
	private Date updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(String buyNum) {
		this.buyNum = buyNum;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public BhProductDto getBhProductDto() {
		return bhProductDto;
	}
	public void setBhProductDto(BhProductDto bhProductDto) {
		this.bhProductDto = bhProductDto;
	}
	public BhOrdersDto getBhOrdersDto() {
		return bhOrdersDto;
	}
	public void setBhOrdersDto(BhOrdersDto bhOrdersDto) {
		this.bhOrdersDto = bhOrdersDto;
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
	@Override
	public String toString() {
		return "BhOrderItemDto [id=" + id + ", buyNum=" + buyNum + ", price=" + price + ", subtotal=" + subtotal
				+ ", bhProductDto=" + bhProductDto + ", bhOrdersDto=" + bhOrdersDto + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
	
}

