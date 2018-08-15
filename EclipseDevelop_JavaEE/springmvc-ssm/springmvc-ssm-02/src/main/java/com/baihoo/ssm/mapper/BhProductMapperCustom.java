package com.baihoo.ssm.mapper;

import java.util.List;

import com.baihoo.ssm.pojoCustom.BhProductCustom;
import com.baihoo.ssm.pojoQto.BhProductQto;

/**
 * 自定義商品 Mapper
 * @author Administrator
 *
 */
public interface BhProductMapperCustom {

	/**
	 *  查詢商品列表
	 * @param bhProductDto
	 * @return
	 */
	List<BhProductCustom> findProductList(BhProductQto bhProductDto);

	/**
	 * 查詢商品列表詳細信息
	 * @param bhProductDto
	 * @return
	 */
	List<BhProductCustom> findProductDetailList(BhProductQto bhProductDto);
	/**
	 *根据Id 查詢单个商品詳細信息
	 * @param id
	 * @return
	 */
	BhProductCustom findProductById(Integer  id);
}
