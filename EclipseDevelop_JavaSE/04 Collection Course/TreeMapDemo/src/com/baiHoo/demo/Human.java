package com.baiHoo.demo;

/**
 * 
 * @author Administrator
 * 	�����Զ�������ʵ��comparable�ӿڣ�ʵ��CompareTo����    
 */
public class Human implements Comparable<Human> {
	private Integer handsome; //Ӣ��ֵ
	private String name;
	
	public Human(Integer handsome, String name) {
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
	public int compareTo(Human o) {
		
		return o.getHandsome()-this.getHandsome();
	}
	@Override
	public String toString() {
		return "Human [handsome=" + handsome + ", name=" + name + "]";
	}
	
}
