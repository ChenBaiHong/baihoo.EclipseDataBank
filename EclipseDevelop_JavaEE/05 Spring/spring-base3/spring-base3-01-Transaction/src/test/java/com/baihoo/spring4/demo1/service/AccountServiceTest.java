package com.baihoo.spring4.demo1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试手动编写代码完成事务管理。
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo1.xml")
public class AccountServiceTest  {
		@Autowired
		@Qualifier("accountService")
		private AccountService accountService;
		@Test
		public void dome1() {
			accountService.transfer("李白", "白起",100.00);
		}
}
