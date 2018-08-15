package com.baihoo.spring4.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.demo3.dao.CustomerDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext_demo3.xml")
public class SpringTest3 {
	@Autowired
	@Qualifier("customerDaoProxy")
	private CustomerDao customerDao;
	@Test
	public void demo1() {
		customerDao.addCustomer();
		customerDao.deleteCustomer();
		customerDao.updateCustomer();
		customerDao.findCustomer();
	}
}
