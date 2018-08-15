package com.baihoo.shiro.pojoQto;

import java.io.Serializable;

import com.baihoo.shiro.pojoCustom.BhCateCustom;

/**
 * 類別自定義查詢擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhCateQto implements Serializable{
	/**
	 * @param bhCateCustom 類別自定義擴展類
	 */
	private BhCateCustom bhCateCustom;

	public BhCateCustom getBhCateCustom() {
		return bhCateCustom;
	}

	public void setBhCateCustom(BhCateCustom bhCateCustom) {
		this.bhCateCustom = bhCateCustom;
	}
	
	
}
