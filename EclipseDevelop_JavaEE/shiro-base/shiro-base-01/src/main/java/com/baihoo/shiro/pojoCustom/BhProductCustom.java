package com.baihoo.shiro.pojoCustom;

import java.io.Serializable;

import com.baihoo.shiro.pojo.BhProduct;

/**
 * 產品自定義擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhProductCustom extends BhProduct implements Serializable{
	/**
	 * 
	 * @param bhCate 			关联分类 ， 一个商品关联它的分类 ， 一对一
	 * @param bhBrand 			关联品牌 ， 一个商品关联它的品牌，一对一
	 * 
	 */
	private BhCateCustom bhCateCustom; 
	private BhBrandCustom bhBrandCustom;
	
	public BhCateCustom getBhCateCustom() {
		return bhCateCustom;
	}
	public void setBhCateCustom(BhCateCustom bhCateCustom) {
		this.bhCateCustom = bhCateCustom;
	}
	public BhBrandCustom getBhBrandCustom() {
		return bhBrandCustom;
	}
	public void setBhBrandCustom(BhBrandCustom bhBrandCustom) {
		this.bhBrandCustom = bhBrandCustom;
	}
}

