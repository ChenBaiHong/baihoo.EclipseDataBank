package com.baihoo.spring4.demo5.dao;

public class UserDao {

	
	public void addUser() {
		
		System.out.println(this.getClass().getSimpleName()+" 执行添加操作。。。。。。");
		
	}

	
	public void updateUser() {
		System.out.println(this.getClass().getSimpleName()+" 更新添加操作。。。。。。");
		
	}

	
	public void deleteUser() {
		System.out.println(this.getClass().getSimpleName()+" 删除添加操作。。。。。。");
		
	}

	
	public void findUser() {
		System.out.println(this.getClass().getSimpleName()+" 查找添加操作。。。。。。");
		
	}

}
