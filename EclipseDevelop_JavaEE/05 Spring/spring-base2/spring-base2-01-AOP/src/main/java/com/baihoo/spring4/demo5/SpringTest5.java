package com.baihoo.spring4.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.demo5.dao.UserDao;
import com.baihoo.spring4.demo5.dao.OrderDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext_demo5.xml")
public class SpringTest5 {
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;
	@Test
	public void demo1() {
		userDao.addUser();
		userDao.deleteUser();
		userDao.updateUser();
		userDao.findUser();
		
		orderDao.addOrder();
		orderDao.deleteOrder();
		orderDao.updateOrder();
		orderDao.findOrder();
	}
}
