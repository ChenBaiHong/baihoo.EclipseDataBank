package com.baihoo.spring4.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.service.UserService;

/**
 * 注解头测试加载spring配置上下文xml文件
 * 
 * @author Administrator
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceImplTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void demo1() {
		System.out.println(userService.findByAge("123"));
		System.out.println(userService.findByName("baihoo"));
	}
}
