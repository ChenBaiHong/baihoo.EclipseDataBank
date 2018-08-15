package com.baihoo.spring4.demo1.dao.impl;

import com.baihoo.spring4.demo1.dao.UserDao;

/**
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.out.println("添加用户。。。。。。");
		
	}

	@Override
	public void update() {
		System.out.println("更新用户。。。。。。");
		
	}

}
