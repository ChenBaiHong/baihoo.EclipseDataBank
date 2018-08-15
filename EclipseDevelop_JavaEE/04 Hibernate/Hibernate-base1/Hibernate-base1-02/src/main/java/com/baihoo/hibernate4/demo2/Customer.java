package com.baihoo.hibernate4.demo2;

import java.util.HashSet;
import java.util.Set;

/**
 *  客户类
 * @author Administrator
 *
 */
public class Customer {
	private Integer cid;
	private String cname;
	// 一个客户有多个订单.
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
	
}
