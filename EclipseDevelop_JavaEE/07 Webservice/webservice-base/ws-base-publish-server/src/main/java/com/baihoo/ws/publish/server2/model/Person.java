package com.baihoo.ws.publish.server2.model;
/**
 * 服务端提供的模型类
 * @author Administrator
 *
 */
public class Person {
	private Integer Id;
	private Integer age;
	private String name;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(Integer id, Integer age, String name) {
		super();
		Id = id;
		this.age = age;
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", age=" + age + ", name=" + name + "]";
	}
	
}
