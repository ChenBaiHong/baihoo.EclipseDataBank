package com.baihoo.mybatis.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * 	@description 	
 * parameterType传递pojo包装对象
		可以定义pojo包装类型扩展mapper接口输入参数的内容。

		需求：
				自定义查询条件查询用户信息，需要向statement输入查询条件，查询条件可以有user信息、商品信息。。。。


 * 包装查询类型
 * @author Administrator
 *
 */
public class SellerInfoQueryVo {
	/**
	 * @param sellerInfo 实体类型 
	 * @param sellerInfoCustom 的扩展类型
	 */
	private SellerInfo sellerInfo;
	private SellerInfoCustom sellerInfoCustom;
	
	private List<Integer> ids = new ArrayList<Integer>();
	
	public SellerInfo getSellerInfo() {
		return sellerInfo;
	}
	public void setSellerInfo(SellerInfo sellerInfo) {
		this.sellerInfo = sellerInfo;
	}
	public SellerInfoCustom getSellerInfoCustom() {
		return sellerInfoCustom;
	}
	public void setSellerInfoCustom(SellerInfoCustom sellerInfoCustom) {
		this.sellerInfoCustom = sellerInfoCustom;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
}
