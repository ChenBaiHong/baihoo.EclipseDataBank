package com.baihoo.mybatis.mapper;

import com.baihoo.mybatis.pojo.BhCate;
/**
 * 
 * @author Administrator
 *
 */
public interface BhCateMapper {
	/**
	 * 
	 * @param bhCate
	 */
	void insertBhCate(BhCate bhCate);
	/**
	 * 
	 * @param bhCate
	 */
	void updateBhCate(BhCate bhCate);
	/**
	 * 
	 * @param bhCate
	 */
	void deleteBhCate(BhCate bhCate);
}
