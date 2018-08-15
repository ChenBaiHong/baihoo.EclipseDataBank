package com.baihoo.ssm.pojoQto;

import java.io.Serializable;

import com.baihoo.ssm.pojoCustom.BhOrderItemCustom;

/**
 * 訂單項自定義查詢擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhOrderItemQto implements Serializable{
	/**
	 * @param bhOrderItemCustom 訂單項自定義擴展類
	 */
	private BhOrderItemCustom bhOrderItemCustom;

	public BhOrderItemCustom getBhOrderItemCustom() {
		return bhOrderItemCustom;
	}

	public void setBhOrderItemCustom(BhOrderItemCustom bhOrderItemCustom) {
		this.bhOrderItemCustom = bhOrderItemCustom;
	}

}

