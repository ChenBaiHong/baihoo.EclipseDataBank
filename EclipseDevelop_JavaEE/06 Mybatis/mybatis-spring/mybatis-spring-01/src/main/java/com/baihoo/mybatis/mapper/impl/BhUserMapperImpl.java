package com.baihoo.mybatis.mapper.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.baihoo.mybatis.mapper.BhUserMapper;
import com.baihoo.mybatis.pojo.BhUser;
import com.baihoo.mybatis.pojoDto.BhUserDto;
/**
 * SqlSessionDaoSupport === mybatis整合spring 提供的sqlSession 操作支持类
 * @author Administrator
 *
 */
public class BhUserMapperImpl extends SqlSessionDaoSupport implements BhUserMapper {

	@Override
	public void insertBhUser(BhUser bhUser) {
		this.getSqlSession().insert("", bhUser);
	}

	@Override
	public void updateBhUser(BhUser bhUser) {
		this.getSqlSession().update("com.baihoo.mybatis.mapper.BhUserMapper.updateBhUser", bhUser);

	}

	@Override
	public void deleteBhUser(BhUser bhUser) {
		this.getSqlSession().delete("com.baihoo.mybatis.mapper.BhUserMapper.deleteBhUser", bhUser);

	}

	@Override
	public List<BhUserDto> findBhUserDtoDetail(BhUserDto bhUserDto) {
	
		return this.getSqlSession().selectList("com.baihoo.mybatis.mapper.BhUserMapper.findBhUserDtoDetail", bhUserDto);
	}

	@Override
	public BhUserDto findById(String id) {
	
		return this.getSqlSession().selectOne("com.baihoo.mybatis.mapper.BhUserMapper.findById", id);
	}

}
