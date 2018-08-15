package com.baihoo.mybatis.mapper.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.mybatis.mapper.BhUserMapper;
import com.baihoo.mybatis.pojoDto.BhUserDto;
/**
 * Mybatis整合spring原始接口dao 与 mapper代理开发的测试
 * 
 * 
 * 
 * @author Administrator
 
		第一种方式：
		配置BhUserMapperImpl.java由spring管理反转控制
		此方法缺点：
			使用此方法对于每个mapper都需要配置，比较繁琐。
		
		 <bean id="userMapper" class="com.baihoo.mybatis.mapper.impl.BhUserMapperImpl">
		 		注入sqlSessionFactory工程类
		 		<property name="sqlSessionFactory" ref="sqlSessionFactory"></property>
		 </bean>
		 
		第二种方式：
		配置mapper
			MapperFactoryBean：用于生成mapper代理对象
		此方法缺点：
			使用此方法对于每个mapper都需要配置，比较繁琐。
			
		 <bean id="userMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
		 		注入sqlSessionFactory工程类
		 		<property name="sqlSessionFactory" ref="sqlSessionFactory"></property>
		 		<property name="mapperInterface" value="com.baihoo.mybatis.mapper.BhUserMapper"></property>
		 </bean>
		 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class BhUserMapperImplTest {
	
	@Autowired
	@Qualifier("userMapper")
	private BhUserMapper userMapper;
	@Test
	public void testFindById() {
		BhUserDto user = userMapper.findById("5");
		System.out.println(user);
	}

}
