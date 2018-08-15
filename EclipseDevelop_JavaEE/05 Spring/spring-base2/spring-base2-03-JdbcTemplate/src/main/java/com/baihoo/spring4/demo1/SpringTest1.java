package com.baihoo.spring4.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest1 {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	/**
	 * 创建表
	 */
	@Test
	public void createTable(){
		jdbcTemplate.execute("create table user (id int primary key auto_increment,name varchar(20))");
	}
	/**
	 * 插入数据
	 */
	@Test
	public void insertData(){
		// 创建连接池:
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// 设置参数:
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://192.168.1.15:3306/spring_study");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		// 使用JDBC的模板:
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("create table user (id int primary key auto_increment,name varchar(20))");
	}
}
