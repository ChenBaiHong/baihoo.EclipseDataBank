package com.baihoo.spring4.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * “@Configuration” 指定POJO类为Spring提供Bean定义信息
 * “@Bean” 提供一个Bean定义信息
 * @author Administrator
 *
 */
@Configuration
public class BeanConfig {

	@Bean(name="car")
	public Car showCar(){
		Car car = new Car();
		car.setName("兰博基尼");
		car.setPrice(6666d);
		return car;
	}
	
	@Bean(name="product")
	public Product initProduct(){
		Product product = new Product();
		product.setName("spaceX");
		product.setPrice(88888d);
		return product;
	}
}
