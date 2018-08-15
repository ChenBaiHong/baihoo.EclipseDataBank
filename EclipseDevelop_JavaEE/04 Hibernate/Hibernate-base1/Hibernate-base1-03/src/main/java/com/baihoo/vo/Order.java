package com.baihoo.vo;

/**
 *  订单的实体
 * @author Administrator
 *
 */
public class Order {
	private Integer oid;
	private String addr;
	// 订单的所属客户:
	// 用了表示订单所属客户.
	private Customer customer;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", addr=" + addr + "]";
	}
	
	
}
