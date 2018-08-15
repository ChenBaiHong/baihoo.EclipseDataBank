package com.baihoo.ssm.pojoQto;

import java.io.Serializable;
import java.util.List;

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
	 * @param prodList  產品集合操作类型
	 */
	private BhProductCustom bhProductCustom;
	
	private List<BhProductCustom> prodList;
	public BhProductCustom getBhProductCustom() {
		return bhProductCustom;
	}

	public void setBhProductCustom(BhProductCustom bhProductCustom) {
		this.bhProductCustom = bhProductCustom;
	}

	public List<BhProductCustom> getProdList() {
		return prodList;
	}

	public void setProdList(List<BhProductCustom> prodList) {
		this.prodList = prodList;
	}

}

