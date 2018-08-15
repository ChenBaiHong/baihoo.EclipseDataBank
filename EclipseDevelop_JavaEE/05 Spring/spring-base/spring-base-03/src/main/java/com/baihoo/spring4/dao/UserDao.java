package com.baihoo.spring4.dao;

import com.baihoo.spring4.entity.User;

/**
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	 User findByName(String name);
	 User findByAge(String age);
}
