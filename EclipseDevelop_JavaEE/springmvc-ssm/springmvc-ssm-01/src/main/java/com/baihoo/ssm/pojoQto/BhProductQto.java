package com.baihoo.ssm.pojoQto;

import java.io.Serializable;

import com.baihoo.ssm.pojoCustom.BhProductCustom;

/**
 * 產品自定義查詢擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhProductQto implements Serializable{
	/**
	 * @param bhProductCustom 產品項自定義擴展類
	 */
	private BhProductCustom bhProductCustom;

	public BhProductCustom getBhProductCustom() {
		return bhProductCustom;
	}

	public void setBhProductCustom(BhProductCustom bhProductCustom) {
		this.bhProductCustom = bhProductCustom;
	}

}

