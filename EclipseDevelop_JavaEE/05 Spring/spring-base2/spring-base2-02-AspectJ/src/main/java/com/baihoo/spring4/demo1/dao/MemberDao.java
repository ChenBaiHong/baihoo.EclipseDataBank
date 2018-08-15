package com.baihoo.spring4.demo1.dao;

import com.baihoo.spring4.demo1.dao.MemberDao;

public class MemberDao {

	
	public Integer addMember() {
		
		System.out.println(this.getClass().getName()+".addMember()"+"。。。。。。");
		return 1;
	}

	
	public void updateMember() {
		System.out.println(this.getClass().getName()+".updateMember()"+"。。。。。。");
		
	}

	
	public void deleteMember() {
		System.out.println(this.getClass().getName()+".deleteMember()"+"。。。。。。");
		
	}

	
	public void findMember() {
		System.out.println(this.getClass().getName()+".findMember()"+"。。。。。。");
		
	}

}
