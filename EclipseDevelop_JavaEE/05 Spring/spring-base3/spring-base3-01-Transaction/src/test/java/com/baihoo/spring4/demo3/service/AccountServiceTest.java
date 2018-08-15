package com.baihoo.spring4.demo3.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 测试声明式事务管理:(自动代理.基于切面 ******)
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo3.xml")
public class AccountServiceTest {
	@Autowired
	@Qualifier("accountService") 
	private AccountService accountService; //注入Service对象,不需要注入代理对象(生成这个类的时候,已经是代理对象.)
	@Test
	public void demo1() {
		accountService.transfer("李白", "白起", 100.00);
	}

}
