package com.baihoo.ssm.pojoCustom;

import java.io.Serializable;

import com.baihoo.ssm.pojo.BhOrderItem;

/**
 * 訂單項自定義擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhOrderItemCustom extends BhOrderItem implements Serializable{
	/**
	 * @param bhProductCustom		关联产品 , 一对一，一个订单项是关联的那个产品
	 * @param bhOrdersCustom		关联订单 , 一对一，一个订单项是关联的一个订单
	 */

	private BhProductCustom bhProductCustom; 
	private BhOrdersCustom bhOrdersCustom;
	
	public BhProductCustom getBhProductCustom() {
		return bhProductCustom;
	}
	public void setBhProductCustom(BhProductCustom bhProductCustom) {
		this.bhProductCustom = bhProductCustom;
	}
	public BhOrdersCustom getBhOrdersCustom() {
		return bhOrdersCustom;
	}
	public void setBhOrdersCustom(BhOrdersCustom bhOrdersCustom) {
		this.bhOrdersCustom = bhOrdersCustom;
	} 
}

