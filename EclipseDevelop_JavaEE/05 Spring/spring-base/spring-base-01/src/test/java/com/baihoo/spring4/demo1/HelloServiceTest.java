package com.baihoo.spring4.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 
 * @author Administrator
 *
 */
public class HelloServiceTest {


	/**
	 *传统方式，面向接口创建对象
	 */
	@Test
	public void demo1() {
		// 造成程序紧密耦合.
		HelloService helloService = new HelloServiceImpl();
		helloService.sayHello();
	}

	/**
	 * 创建对象的控制全权交由Spring管理控制
	 */
	@Test
	public void demo2() {
		// 创建一个工厂类.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext.getBean("userService");
		helloService.sayHello();
	}
	@Test
	/**
	 * 提示：不常用
	 * 加载磁盘路径下的配置文件，盘符文件路径不建议存在特殊字符或空格
	 * 
	 */
	public void demo3() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext.getBean("userService");
		helloService.sayHello();
	}
}
