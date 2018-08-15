package com.baihoo.ssm.pojoCustom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.baihoo.ssm.pojo.BhOrders;


/**
 * 訂單自定義擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhOrdersCustom extends BhOrders implements Serializable{
	/**
	 * 
	 * @param bhUserCustom			订单用户 , 一个订单对应一个用户
	 * @param oiList 							一个订单有多个订单项信息 ， 建立一对多的关系
	 */

	private BhUserCustom bhUserCustom; 
	/**
	 * 一个订单有多个订单项信息 ， 建立一对多的关系
	 */
	List<BhOrderItemCustom> oiList = new ArrayList<BhOrderItemCustom>();
	

	public BhUserCustom getBhUserCustom() {
		return bhUserCustom;
	}
	public void setBhUserCustom(BhUserCustom bhUserCustom) {
		this.bhUserCustom = bhUserCustom;
	}
	public List<BhOrderItemCustom> getOiList() {
		return oiList;
	}
	public void setOiList(List<BhOrderItemCustom> oiList) {
		this.oiList = oiList;
	}

}

