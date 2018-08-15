package com.baiHoo.demo;

/**
 * 
 * @author Administrator
 *
 */
public class Person {
	private Integer handsome; //Ó¢¿¡Öµ
	private String name;
	
	public Person(Integer handsome, String name) {
		super();
		this.handsome = handsome;
		this.name = name;
	}
	public Integer getHandsome() {
		return handsome;
	}
	public void setHandsome(Integer handsome) {
		this.handsome = handsome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [handsome=" + handsome + ", name=" + name + "]";
	}

	
}
