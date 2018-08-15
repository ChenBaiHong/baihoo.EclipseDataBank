package com.baihoo.shiro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.baihoo.shiro.mapper.BhUserMapper;
import com.baihoo.shiro.pojo.BhUser;
import com.baihoo.shiro.service.BhUserService;
/**
 * 
 * @author Administrator
 *
 */
public class BhUserServiceImpl implements BhUserService{
	@Autowired
	@Qualifier("bhUserMapping")
	private BhUserMapper bhUserMapping;

	@Override
	public BhUser findById(Integer id) {
		return bhUserMapping.selectByPrimaryKey(id);
	}

}
