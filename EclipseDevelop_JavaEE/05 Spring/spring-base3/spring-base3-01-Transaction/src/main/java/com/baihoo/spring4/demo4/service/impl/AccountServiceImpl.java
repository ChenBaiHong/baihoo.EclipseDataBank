package com.baihoo.spring4.demo4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baihoo.spring4.demo4.dao.AccountDao;
import com.baihoo.spring4.demo4.service.AccountService;

@Service("accountService")
@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false) //默认事务的隔离级别，传播类型......
public class AccountServiceImpl  implements AccountService{
	@Autowired
	@Qualifier("accountDao")
	private AccountDao accountDao;
	/**
	 * 转账的方法
	 * @param from:从哪转出
	 * @param to:转入的人
	 * @param money:转账金额
	 */
	@Override
	public void transfer(String from, String to, Double money) {
		 //XML配置自动代理基于切面 ，事务模板管理， A 转出一百，除零异常出现终止后面代码的执行。即此出现异常那么自动回滚
		accountDao.out(from, 100D);
		int i = 1/0; //模拟异常
		accountDao.in(to, 100D);
		
	}
}
