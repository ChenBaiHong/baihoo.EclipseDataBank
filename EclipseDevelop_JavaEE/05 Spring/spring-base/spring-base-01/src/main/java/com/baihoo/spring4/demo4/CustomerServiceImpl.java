package com.baihoo.spring4.demo4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Bean的生命周期:
 * 		Bean的生命周期的11个步骤:
 *				1.instantiate bean对象实例化
 *				2.populate properties 封装属性
 *				3.如果Bean实现BeanNameAware 执行 setBeanName
 *				4.如果Bean实现BeanFactoryAware 或者 ApplicationContextAware 设置工厂 setBeanFactory 或者上下文对象 setApplicationContext
 *
 *				5.如果存在类实现 BeanPostProcessor（后处理Bean） ，执行postProcessBeforeInitialization
 *
 *				6.如果Bean实现InitializingBean 执行 afterPropertiesSet 
 *				7.调用<bean init-method="init"> 指定初始化方法 init
 *
 *				8.如果存在类实现 BeanPostProcessor（处理Bean） ，执行postProcessAfterInitialization
 *
 *				9.执行业务处理
 *				10.如果Bean实现 DisposableBean 执行 destroy
 *				11.调用<bean destroy-method="customerDestroy"> 指定销毁方法 customerDestroy
 *				
 *				在CustomerService类的add方法之前进行权限校验?
 *
 * @author Administrator
 *
 */
public class CustomerServiceImpl
		implements CustomerService, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	private String name;
	
	
	//第一，构造函数初始化
	public CustomerServiceImpl() {
		super();
		System.out.println("第一步:实例化类.");
	}
	//第二，属性注入
	public void setName(String name) {
		System.out.println("第二步:属性的注入.");
		this.name = name;
	}
	//第三步
	//BeanNameAware 接口实现方法
	public void setBeanName(String name) {
		System.out.println("第三步:注入配置的类的名称" + name);
	}
	//第四步
	//ApplicationContextAware 接口实现方法
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("第四步:注入applicationContext" + applicationContext);
	}
	
	//。。。。。。。。。。。。。。。。
	
	//第六步
	//InitializingBean 接口实现方法
	public void afterPropertiesSet() throws Exception {
		System.out.println("第六步:属性设置后执行...");
	}
	//第七步
	public void setup() {
		System.out.println("第七步:调用手动设置的初始化方法...");
	}
	
	//。。。。。。。。。。。。。。。。
	
	/**
	 * 第九步
	 */
	//CustomerService 接口实现方法
	public void add() {
		System.out.println("添加客户...");
	}
	//CustomerService 接口实现方法
	public void find() {
		System.out.println("查询客户...");
	}
	
	//第十步
	//DisposableBean 接口实现方法
	public void destroy() throws Exception {
		System.out.println("第十步:调用销毁的方法...");
	}
	//第十一步
	public void teardown() {
		System.out.println("第十一步:调用手动销毁方法...");
	}
}
