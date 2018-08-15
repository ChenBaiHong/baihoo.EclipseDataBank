package com.baihoo.spring4.dao.impl;

import com.baihoo.spring4.dao.UserDao;
import com.baihoo.spring4.entity.User;

/**
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao{

	
	public User findByName(String name) {
		
		return new User("baiHoo", "123");
	}

	
	public User findByAge(String age) {
		return new User("baiHoo", "123");
	}

}
