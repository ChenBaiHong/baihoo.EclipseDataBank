package com.baihoo.mybatis.pojo;

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
 * @date 2018-07-20 15:16:35
 */
public class BhOrderItem {
	/**
	 * @param id				唯一识别主键
	 * @param buyNum	购买商品数量
	 * @param price			订单项产品单价
	 * @param subtotal	小计产品价钱
	 * @param pId			关联产品 , 一对一，一个订单项是关联的那个产品
	 * @param oId			关联订单 , 一对一，一个订单项是关联的一个订单
	 * @param createTime
	 * @param updateTime
	 */
	private String id;	
	private String buyNum;	
	private Double price;	
	private Double subtotal;	
	private String pId;	
	private String oId;	
	private String createTime;
	private String updateTime;

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setBuyNum(String buyNum){
		this.buyNum=buyNum;
	}
	public String getBuyNum(){
		return buyNum;
	}
	public void setPrice(Double price){
		this.price=price;
	}
	public Double getPrice(){
		return price;
	}
	public void setSubtotal(Double subtotal){
		this.subtotal=subtotal;
	}
	public Double getSubtotal(){
		return subtotal;
	}
	public void setPId(String pId){
		this.pId=pId;
	}
	public String getPId(){
		return pId;
	}
	public void setOId(String oId){
		this.oId=oId;
	}
	public String getOId(){
		return oId;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	public String getCreateTime(){
		return createTime;
	}
	public void setUpdateTime(String updateTime){
		this.updateTime=updateTime;
	}
	public String getUpdateTime(){
		return updateTime;
	}
	public BhOrderItem(String buyNum, Double price, Double subtotal, String pId, String oId) {
		super();
		this.buyNum = buyNum;
		this.price = price;
		this.subtotal = subtotal;
		this.pId = pId;
		this.oId = oId;
	}
	public BhOrderItem(String id) {
		super();
		this.id = id;
	}
	public BhOrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

