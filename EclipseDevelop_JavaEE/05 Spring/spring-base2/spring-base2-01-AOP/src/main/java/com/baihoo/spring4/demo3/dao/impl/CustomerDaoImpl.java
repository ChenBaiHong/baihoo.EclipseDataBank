package com.baihoo.spring4.demo3.dao.impl;

import com.baihoo.spring4.demo3.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public void addCustomer() {
		
		System.out.println("添加客户信息。。。。。。");
		
	}

	@Override
	public void updateCustomer() {
		System.out.println("更新客户信息。。。。。。");
		
	}

	@Override
	public void deleteCustomer() {
		System.out.println("删除客户信息。。。。。。");
		
	}

	@Override
	public void findCustomer() {
		System.out.println("查找客户信息。。。。。。");
		
	}

}
