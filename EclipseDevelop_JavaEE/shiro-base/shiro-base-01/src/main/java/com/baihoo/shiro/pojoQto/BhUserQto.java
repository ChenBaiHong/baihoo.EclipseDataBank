package com.baihoo.shiro.pojoQto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.baihoo.shiro.pojoCustom.BhUserCustom;

/**
 * 用戶自定義查詢擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhUserQto implements Serializable{
	/**
	 * @param bhUserCustom 用戶自定義擴展類
	 */
	private BhUserCustom bhUserCustom;

	public BhUserCustom getBhUserCustom() {
		return bhUserCustom;
	}

	public void setBhUserCustom(BhUserCustom bhUserCustom) {
		this.bhUserCustom = bhUserCustom;
	}
	
}

