package com.baihoo.web.cxf.model;
/**
 * 用户对象类
 * @author Administrator
 *
 */
public class User {
	private String Id;
	private String name;
	private String address;
	private String email;
	public User(String id, String name, String address, String email) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
}
