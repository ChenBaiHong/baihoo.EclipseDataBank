package com.baihoo.mybatis.mapper;

import com.baihoo.mybatis.pojo.BhProduct;

public interface BhProductMapper {
	/**
	 * 
	 * @param bhProduct
	 */
	void insertBhProduct(BhProduct bhProduct);
	/**
	 * 
	 * @param bhProduct
	 */
	void updateBhProduct(BhProduct bhProduct);
	/**
	 * 
	 * @param bhProduct
	 */
	void deleteBhProduct(BhProduct bhProduct);
}
