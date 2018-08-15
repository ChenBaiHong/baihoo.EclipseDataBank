package com.baihoo.shiro.pojoCustom;

import java.io.Serializable;

import com.baihoo.shiro.pojo.BhCate;

/**
 * 類別自定義擴展類
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class BhCateCustom extends BhCate implements Serializable{
	/**
	 * @param parentCateCustom		父级类
	 * @param topCateCustom			隶属祖宗类
	 */
	private BhCateCustom parentCateCustom;	
	private BhCateCustom topCateCustom;
	
	public BhCateCustom getParentCateCustom() {
		return parentCateCustom;
	}
	public void setParentCateCustom(BhCateCustom parentCateCustom) {
		this.parentCateCustom = parentCateCustom;
	}
	public BhCateCustom getTopCateCustom() {
		return topCateCustom;
	}
	public void setTopCateCustom(BhCateCustom topCateCustom) {
		this.topCateCustom = topCateCustom;
	}	
	
}
