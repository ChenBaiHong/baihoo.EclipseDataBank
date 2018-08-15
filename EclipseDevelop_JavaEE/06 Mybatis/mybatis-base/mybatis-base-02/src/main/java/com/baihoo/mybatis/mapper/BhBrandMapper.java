package com.baihoo.mybatis.mapper;

import com.baihoo.mybatis.pojo.BhBrand;

/**
 * 
 * @author Administrator
 *
 */
public interface BhBrandMapper {
	/**
	 * 
	 * @param bhBrand
	 */
	void insertBhBrand(BhBrand bhBrand);
	/**
	 * 
	 * @param bhBrand
	 */
	void updateBhBrand(BhBrand bhBrand);
	/**
	 * 
	 * @param bhBrand
	 */
	void deleteBhBrand(BhBrand bhBrand);
}
