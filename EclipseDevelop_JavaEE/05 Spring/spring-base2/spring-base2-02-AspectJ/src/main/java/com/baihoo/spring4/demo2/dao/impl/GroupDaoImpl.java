package com.baihoo.spring4.demo2.dao.impl;

import org.springframework.stereotype.Repository;

import com.baihoo.spring4.demo2.dao.GroupDao;

@Repository("groupDao")
public class GroupDaoImpl implements GroupDao{

	@Override
	public Integer addGroup() {
		System.out.println(this.getClass().getName()+".addGroup()"+"。。。。。。");
		return 2;
	}

	@Override
	public void updateGroup() {
		System.out.println(this.getClass().getName()+".updateGroup()"+"。。。。。。");
		
	}

	@Override
	public void deleteGroup() {
		//int i = 1/0;
		System.out.println(this.getClass().getName()+".deleteGroup()"+"。。。。。。");
		
	}

	@Override
	public void findGroup() {
		System.out.println(this.getClass().getName()+".findGroup()"+"。。。。。。");	
	}

}
