package com.baihoo.spring4.demo6.dao.impl;

import com.baihoo.spring4.demo6.dao.GroupDao;

public class GroupDaoImpl implements GroupDao{

	@Override
	public void addGroup() {
		System.out.println(this.getClass().getSimpleName()+" 执行添加操作。。。。。。");
		
	}

	@Override
	public void updateGroup() {
		System.out.println(this.getClass().getSimpleName()+" 执行更新操作。。。。。。");
		
	}

	@Override
	public void deleteGroup() {
		System.out.println(this.getClass().getSimpleName()+" 执行删除操作。。。。。。");
		
	}

	@Override
	public void findGroup() {
		System.out.println(this.getClass().getSimpleName()+" 执行查询操作。。。。。。");
		
	}

}
