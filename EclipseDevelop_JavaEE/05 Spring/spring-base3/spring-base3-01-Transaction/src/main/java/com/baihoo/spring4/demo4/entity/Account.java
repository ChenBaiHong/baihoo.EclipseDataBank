package com.baihoo.spring4.demo4.entity;

public class Account {
	private Integer Id;
	private String name;
	private Double money;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Integer id, String name, Double money) {
		super();
		Id = id;
		this.name = name;
		this.money = money;
	}
	
	
}
