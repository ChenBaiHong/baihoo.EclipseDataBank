package com.baihoo.spring4.service.impl;

import com.baihoo.spring4.dao.UserDao;
import com.baihoo.spring4.entity.User;
import com.baihoo.spring4.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User findByName(String name) {
		
		return userDao.findByName("baihoo");
	}
	public User findByAge(String age) {
		return userDao.findByAge("123");
	}

}
