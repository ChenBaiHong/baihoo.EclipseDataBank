package com.baihoo.shiro.pojoQto;

import java.io.Serializable;
import java.util.Date;

import com.baihoo.shiro.pojoCustom.BhBrandCustom;

/**
 * 品牌自定義查詢擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhBrandQto implements Serializable{
	/**
	 * @param bhBrandCustom 品牌自定義擴展類
	 */
	private BhBrandCustom bhBrandCustom;

	public BhBrandCustom getBhBrandCustom() {
		return bhBrandCustom;
	}

	public void setBhBrandCustom(BhBrandCustom bhBrandCustom) {
		this.bhBrandCustom = bhBrandCustom;
	}
	
}

