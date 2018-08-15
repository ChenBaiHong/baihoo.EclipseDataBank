package com.baihoo.shiro.service;

import com.baihoo.shiro.pojo.BhUser;

/**
 * 用户服务层
 * @author Administrator
 *
 */
public interface BhUserService {
	/**
	 * 通过id查询用户
	 * @param id
	 * @return
	 */
	public BhUser  findById(Integer id);
}
