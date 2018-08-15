package com.baihoo.spring4.demo5.dao;

public class OrderDao {
	public void addOrder() {
		
		System.out.println(this.getClass().getSimpleName()+" 执行添加操作。。。。。。");
		
	}

	
	public void updateOrder() {
		System.out.println(this.getClass().getSimpleName()+" 更新添加操作。。。。。。");
		
	}

	
	public void deleteOrder() {
		System.out.println(this.getClass().getSimpleName()+" 删除添加操作。。。。。。");
		
	}

	
	public void findOrder() {
		System.out.println(this.getClass().getSimpleName()+" 查找添加操作。。。。。。");
		
	}
}
