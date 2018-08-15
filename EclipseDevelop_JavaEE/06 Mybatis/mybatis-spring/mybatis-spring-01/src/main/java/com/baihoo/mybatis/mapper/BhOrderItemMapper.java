package com.baihoo.mybatis.mapper;

import java.util.List;

import com.baihoo.mybatis.pojo.BhOrderItem;
import com.baihoo.mybatis.pojoDto.BhOrderItemDto;

public interface BhOrderItemMapper {
	/**
	 * 
	 * @param bhOrderItem
	 */
	void insertBhOrderItem(BhOrderItem bhOrderItem);
	/**
	 * 
	 * @param bhOrderItem
	 */
	void updateBhOrderItem(BhOrderItem bhOrderItem);
	/**
	 * 
	 * @param bhOrderItem
	 */
	void deleteBhOrderItem(BhOrderItem bhOrderItem);
	/**
	 * 	 复杂一对一查询：
	 * 			查询某个订单项的详细信息（包括是那个产品项并且是那个分类下属于那个品牌的）
	 * @param bhOrderItemDto
	 * @return
	 */
	List<BhOrderItemDto>findOrderItemDetail(BhOrderItemDto bhOrderItemDto);
	/**
	 * 通过订单ID查询某个订单下的订单项
	 * @param oid
	 * @return
	 */
	List<BhOrderItemDto> findByOid(String oid);
}
