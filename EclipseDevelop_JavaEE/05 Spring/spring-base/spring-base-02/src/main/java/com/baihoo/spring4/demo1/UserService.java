package com.baihoo.spring4.demo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 注解的方式装配Bean
 * @author Administrator
 *
 */
// 在Spring配置文件中<bean id="userService" class="com.baihoo.spring4.demo1.UserService">
// @Component("userService")
@Service(value="userService")
@Scope
public class UserService {
	@Value(value="baihoo")
	private String info;
	
//	@Autowired(required=true)
//	@Qualifier("userDao")
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void sayHello(){
		System.out.println("Hello Spring Annotation..."+info);
	}


	
	@PostConstruct
	public void setup(){
		System.out.println("初始化...");
	}
	
	@PreDestroy
	public void teardown(){
		System.out.println("销毁...");
	}
}
