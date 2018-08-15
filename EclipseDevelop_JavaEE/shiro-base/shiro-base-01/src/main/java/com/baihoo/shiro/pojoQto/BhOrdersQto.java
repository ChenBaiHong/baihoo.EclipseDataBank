package com.baihoo.shiro.pojoQto;

import java.io.Serializable;

import com.baihoo.shiro.pojoCustom.BhOrdersCustom;

/**
 * 訂單自定義查詢擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhOrdersQto implements Serializable{
	/**
	 * @param bhaOrdersCustom 訂單自定義擴展類
	 */
	private BhOrdersCustom bhaOrdersCustom;

	public BhOrdersCustom getBhaOrdersCustom() {
		return bhaOrdersCustom;
	}

	public void setBhaOrdersCustom(BhOrdersCustom bhaOrdersCustom) {
		this.bhaOrdersCustom = bhaOrdersCustom;
	}

}

