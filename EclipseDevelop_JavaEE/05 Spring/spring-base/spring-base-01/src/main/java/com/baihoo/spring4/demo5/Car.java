package com.baihoo.spring4.demo5;

/**
 * 
 * @author Administrator
 *
 */
public class Car {
	private String name;
	private Double price;
	
	public Car() {
		super();
	}

	public Car(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	
}
