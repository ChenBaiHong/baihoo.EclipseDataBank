package com.baihoo.spring4.demo5;

/**
 * 
 * @author Administrator
 *
 */
public class Car2 {
	private String name;
	private Double price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car2 [name=" + name + ", price=" + price + "]";
	}
	
	
}