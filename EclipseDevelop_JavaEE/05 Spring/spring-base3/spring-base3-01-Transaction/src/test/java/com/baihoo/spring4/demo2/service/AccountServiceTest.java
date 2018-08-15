package com.baihoo.spring4.demo2.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 	测试不需要手动编写代码,配置.
		声明式事务管理:(原始方式)
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo2.xml")
public class AccountServiceTest {
	@Autowired
	@Qualifier("accountServiceProxy")
	private AccountService accountService;
	@Test
	public void demo1() {
		accountService.transfer("李白", "白起", 100.00);
	}

}
