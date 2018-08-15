package com.baihoo.spring4.demo3;
/**
 * 配置Bean的初始化和销毁的方法:
 * 			配置初始化和销毁的方法:
 * 			init-method=”setup”
 * 			destroy-method=”teardown”
 * 			执行销毁的时候,必须手动关闭工厂,而且只对scope=”singleton”有效.
 * 
 * @author Administrator
 *
 */
public class Product {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setup(){
		System.out.println("初始化方法执行...");
	}
	
	public void teardown(){
		System.out.println("销毁的方法执行...");
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
	
}
