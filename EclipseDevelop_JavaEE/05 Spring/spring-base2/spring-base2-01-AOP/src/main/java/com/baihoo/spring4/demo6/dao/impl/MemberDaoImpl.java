package com.baihoo.spring4.demo6.dao.impl;

import com.baihoo.spring4.demo6.dao.MemberDao;

public class MemberDaoImpl implements MemberDao {

	@Override
	public void addMember() {
		System.out.println(this.getClass().getSimpleName()+" 执行添加操作。。。。。。");
		
	}

	@Override
	public void updateMember() {
		System.out.println(this.getClass().getSimpleName()+" 执行更新操作。。。。。。");
		
	}

	@Override
	public void deleteMember() {
		System.out.println(this.getClass().getSimpleName()+" 执行删除操作。。。。。。");
		
	}

	@Override
	public void findMember() {
		System.out.println(this.getClass().getSimpleName()+" 执行查询操作。。。。。。");
		
	}

}
