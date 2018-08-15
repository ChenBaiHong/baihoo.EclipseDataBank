package com.baihoo.spring4.entity;

/**
 * 
 * @author Administrator
 *
 */
public class User {
	private String nme;
	private String age;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String nme, String age) {
		super();
		this.nme = nme;
		this.age = age;
	}
	public String getNme() {
		return nme;
	}
	public void setNme(String nme) {
		this.nme = nme;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [nme=" + nme + ", age=" + age + "]";
	}
	
}
