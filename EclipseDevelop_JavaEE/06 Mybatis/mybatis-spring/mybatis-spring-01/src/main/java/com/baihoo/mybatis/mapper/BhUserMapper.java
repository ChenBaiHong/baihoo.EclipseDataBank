package com.baihoo.mybatis.mapper;

import java.util.List;

import com.baihoo.mybatis.pojo.BhUser;
import com.baihoo.mybatis.pojoDto.BhUserDto;

/**
 * 
 * @author Administrator
 *
 */
public interface BhUserMapper {
	/**
	 * 
	 * @param bhUser
	 */
	void insertBhUser(BhUser bhUser);
	/**
	 * 
	 * @param bhUser
	 */
	void updateBhUser(BhUser bhUser);
	/**
	 * 
	 * @param bhUser
	 */
	void deleteBhUser(BhUser bhUser);
	/**
	 * 一对多查询，查询用户及订单明细
	 * 		描述：查询某个用户的订单下的订单项的详细信息（包括是那个用户，有哪些订单项，订单项下有哪些产品项并且是那个分类下属于那个品牌的）
	 * @param bhUserDto
	 * @return
	 */
	List<BhUserDto>findBhUserDtoDetail(BhUserDto bhUserDto);
	/**
	 * 通过id查询用户
	 * @param id
	 * @return
	 */
	BhUserDto findById(String id);
}
