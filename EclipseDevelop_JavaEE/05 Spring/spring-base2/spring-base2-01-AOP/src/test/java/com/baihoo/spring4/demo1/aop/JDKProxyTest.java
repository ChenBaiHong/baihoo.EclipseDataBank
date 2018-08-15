package com.baihoo.spring4.demo1.aop;

import org.junit.Test;

import com.baihoo.spring4.demo1.dao.UserDao;
import com.baihoo.spring4.demo1.dao.impl.UserDaoImpl;

/**
 * JDK动态代理测试
 * @author Administrator
 *
 */
public class JDKProxyTest  {
	
	@Test
	public void demo1(){
		JDKProxy<UserDaoImpl> proxy = new JDKProxy<UserDaoImpl>(UserDaoImpl.class);
		UserDao userDao = proxy.createJDKProxyInstance();
		userDao.add();
		userDao.update();
	}
}
