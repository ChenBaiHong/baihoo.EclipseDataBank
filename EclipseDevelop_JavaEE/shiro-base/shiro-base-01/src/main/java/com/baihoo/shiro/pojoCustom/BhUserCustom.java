package com.baihoo.shiro.pojoCustom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.baihoo.shiro.pojo.BhUser;

/**
 * 用戶自定義擴展類
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhUserCustom extends BhUser implements Serializable{
	/**
	 * 
	 * @param oList					一个用户有多个订单，建立一对多的关系
	 */

	/**
	 * 一个用户有多个订单，建立一对多的关系
	 */
	private List<BhOrdersCustom> oList = new ArrayList<BhOrdersCustom>();
	

}

