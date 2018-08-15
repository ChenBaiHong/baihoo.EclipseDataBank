package com.baihoo.spring4.demo4.dao.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.baihoo.spring4.demo4.dao.AccountDao;

@Repository("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao  {
	
	 @Autowired 
	 @Qualifier("dataSource")
	 private DataSource dataSource;
	 //注解注入配置方法初始“@PostConstruct”
	 @PostConstruct
	  private void initialize() {
	        setDataSource(dataSource);
	   }
	/**
	 * 转出的方法
	 * @param from	:转出的人
	 * @param money	:要转账金额
	 */
	public void out(String from, Double money) {
		String sql = "update account set money = money - ? where name  = ?";
		this.getJdbcTemplate().update(sql, money,from);
	}
	/**
	 * 转入的方法
	 * @param to	:转入的人
	 * @param money	:要转账金额
	 */
	public void in(String to, Double money) {
		String sql = "update account set money = money + ? where name  = ?";
		this.getJdbcTemplate().update(sql, money , to);
	}
	
}
