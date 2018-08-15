package com.baihoo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot 之 xml文件配置声明式事务
//@ImportResource("classpath:spring/applicationContext-transaction.xml")
@SpringBootApplication
public class SpringbootBase03CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBase03CrudApplication.class, args);
	}
}
