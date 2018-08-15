package com.baihoo.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * 客户的实体
 * @author Administrator
 * 
 *使用乐观锁解决事务并发问题 相对悲观锁而言，乐观锁机制采取了更加宽松的加锁机制
 *
 */

public class Customer {
	private Integer cid;
	private String cname;
	private Integer age;
	/**
	 * 使用乐观锁解决事务并发问题 
	 * 乐观锁的工作原理：读取出数据时，将此版本号一同读出，之后更新时，对此版本号加一。
	 * 			●基于version 
	 * 			●基于timestamp 
	 */
	private Integer version;
	
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Customer() {
		super();
	}
	
	public Customer(String cname) {
		super();
		this.cname = cname;
	}


	// 在客户的实体中有订单的集合.
	private Set<Order> orders = new HashSet<Order>();
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", age=" + age
				+ "]";
	}
	
}
