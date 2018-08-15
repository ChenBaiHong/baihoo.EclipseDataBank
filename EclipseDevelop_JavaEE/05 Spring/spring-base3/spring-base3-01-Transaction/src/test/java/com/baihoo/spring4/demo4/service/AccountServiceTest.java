package com.baihoo.spring4.demo4.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基于注解的事务管理
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo4.xml")
public class AccountServiceTest {

	@Autowired
	@Qualifier("accountService") 
	private AccountService accountService; //注入Service对象,不需要注入代理对象(生成这个类的时候,已经是代理对象.)
	@Test
	public void demo1() {
		accountService.transfer("李白", "白起", 100.00);
	}

}
