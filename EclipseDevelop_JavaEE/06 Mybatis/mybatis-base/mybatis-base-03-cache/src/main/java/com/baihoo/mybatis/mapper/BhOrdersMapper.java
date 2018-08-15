package com.baihoo.mybatis.mapper;

import java.util.List;

import com.baihoo.mybatis.pojo.BhOrders;
import com.baihoo.mybatis.pojoDto.BhOrdersDto;

public interface BhOrdersMapper {
	/**
	 * 
	 * @param bhOrders
	 */
	void insertBhOrders(BhOrders bhOrders);
	/**
	 * 
	 * @param bhOrders
	 */
	void updateBhOrders(BhOrders bhOrders);
	/**
	 * 
	 * @param bhOrders
	 */
	void deleteBhOrders(BhOrders bhOrders);
	/**
	 * 订单下含有多个订单项，一对多的关系,查询订单明细
	 * @param bhOrdersDto
	 * @return
	 */
	List<BhOrdersDto> findOrdersDetail(BhOrdersDto bhOrdersDto);
	/**
	 * 订单下含有多个订单项，一对多的关系,查询订单明细
	 * 	懒加载查询
	 * @param bhOrdersDto
	 * @return
	 */
	List<BhOrdersDto> findOrdersDetailLazyLoading(BhOrdersDto bhOrdersDto);
}
