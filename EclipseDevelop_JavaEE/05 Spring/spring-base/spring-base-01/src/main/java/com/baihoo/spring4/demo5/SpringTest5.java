package com.baihoo.spring4.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Administrator
 *
 */
public class SpringTest5 {
	
	@Test
	/**
	 * 构造方法的注入,测试
	 */
	public void demo1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext_demo5.xml");
		Car car_1 = (Car) applicationContext.getBean("car_1");
		Car car_2 = (Car) applicationContext.getBean("car_2");
		System.out.println(car_1);
		System.out.println(car_2);
	}
	
	@Test
	/**
	 * 属性的注入，测试
	 */
	public void demo2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext_demo5.xml");
		Car2 car2_1 = (Car2) applicationContext.getBean("car2_1");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(car2_1);
		System.out.println(person);
	}
	
	@Test
	/**
	 * 名称空间p:注入属性，测试
	 */
	public void demo3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext_demo5.xml");
		Car2 car2_2 = (Car2) applicationContext.getBean("car2_2");
		Person person_2 = (Person) applicationContext.getBean("person_2");
		System.out.println(car2_2);
		System.out.println(person_2);
	}
	@Test
	/**
	 * SpEL:属性的注入，测试
	 */
	public void demo4(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext_demo5.xml");
		Car2 car2_3 = (Car2) applicationContext.getBean("car2_3");
		Person person_3 = (Person) applicationContext.getBean("person_3");
		System.out.println(car2_3);
		System.out.println(person_3);
	}
	
}
