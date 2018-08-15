package com.baihoo.spring4.demo1.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.baihoo.spring4.demo1.dao.AccountDao;
import com.baihoo.spring4.demo1.service.AccountService;

public class AccountServiceImpl  implements AccountService{
	private AccountDao accountDao;
	private TransactionTemplate transactionTemplate;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	/**
	 * 转账的方法
	 * @param from:从哪转出
	 * @param to:转入的人
	 * @param money:转账金额
	 */
	@Override
	public void transfer(String from, String to, Double money) {
		/*
		 //未事务管理。除零异常就会终止后面的执行。那么就会造成 A 转出一百，B 未收到一百
		accountDao.out(from, 100D);
		int i = 1/0; //模拟异常
		accountDao.in(to, 100D);
		*/
		
		//通过手写代码事务模板管理， A 转出一百，除零异常出现终止后面代码的执行。即此出现异常那么自动回滚
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				accountDao.out(from, 100D);
				int i = 1/0; //模拟异常
				accountDao.in(to, 100D);
			}
		});
		
	}
	
	
}
