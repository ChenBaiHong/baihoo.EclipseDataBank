package com.baihoo.ssm.service;

import java.util.List;

import com.baihoo.ssm.pojoCustom.BhProductCustom;
import com.baihoo.ssm.pojoQto.BhProductQto;

/**
 * 
 * @author Administrator
 *
 */
public interface BhProductService {
	/**
	 * 查詢商品列表
	 * @param bhProductDto
	 * @return
	 */
	List<BhProductCustom> findProductList(BhProductQto bhProductDto)throws Exception;
	
	/**
	 *  查詢商品列表詳細信息
	 * @param bhProductDto
	 * @return
	 */
	List<BhProductCustom> findProductDetailList(BhProductQto bhProductDto)throws Exception;
	
	/**
	 *  根据商品id查询商品
	 *  定义service接口，遵循单一职责 ， 将业务参数细化，不要使用复杂的包装类型，比如map
	 * @param bhProductDto
	 * @return
	 */
	BhProductCustom findBhProduct(Integer id, BhProductCustom bhProductCustom)throws Exception;
	
	/**
	 *  根据商品id更新商品
	 *  定义service接口，遵循单一职责 ， 将业务参数细化，不要使用复杂的包装类型，比如map
	 * @param bhProductDto
	 * @return
	 */
	int updateBhProduct(Integer id, BhProductCustom bhProductCustom)throws Exception;
}
