package com.baihoo.spring4.demo4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean的完整声明周期
 * @author Administrator
 *
 */
public class SpringTest4 {

	@Test
	// Bean完整的生命周期
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext_demo4.xml");
		
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		customerService.add();
		customerService.find();
		
		applicationContext.close();
	}
}
