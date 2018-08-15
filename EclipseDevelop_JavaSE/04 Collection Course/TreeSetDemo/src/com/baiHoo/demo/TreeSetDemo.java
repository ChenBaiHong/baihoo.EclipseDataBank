package com.baiHoo.demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 * @author Administrator
 *	排序容器treeSet
 *
 * 使用compare业务类排序
 */
public class TreeSetDemo {
	public static void main(String args[]) {
		businessClassSort();
		impleClassSort();
	}
	/**
	 * 使用排序业务类
	 */
	public static void businessClassSort() {
		Person person1 = new Person(400,"baiHoo");
		Person person2 = new Person(300,"baiHoo");
		Person person3  = new Person(700,"baiHoo");
		//依次放入treeSet容器中，使用排序业务类（匿名内部类）
		TreeSet <Person>treeSet = new TreeSet<Person>(
				new Comparator<Person>() {
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getHandsome()-o2.getHandsome();
					}
				});
		treeSet.add(person1);
		treeSet.add(person2);
		treeSet.add(person3);
		System.out.println(treeSet.toString());
	}
	/**
	 * 排序类实现comparable接口，排序
	 */
	public static void impleClassSort() {
		Human human1 = new Human(400,"baiHoo");
		Human human2 = new Human(300,"baiHoo");
		Human human3  = new Human(700,"baiHoo");
		//依次放入treeSet容器中，使用排序业务类（匿名内部类）
		TreeSet <Human>treeSet = new TreeSet<Human>();
		treeSet.add(human1);
		treeSet.add(human3);
		treeSet.add(human2);
		System.out.println(treeSet.toString());
	}
}
