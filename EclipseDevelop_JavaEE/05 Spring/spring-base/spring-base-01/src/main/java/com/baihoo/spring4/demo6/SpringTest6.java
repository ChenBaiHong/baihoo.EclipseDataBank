package com.baihoo.spring4.demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest6 {

	@Test
	public void demo1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext_demo6.xml");
		CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
		System.out.println(collectionBean);
	}
}
