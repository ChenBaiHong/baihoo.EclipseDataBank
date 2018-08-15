package com.baiHoo.demo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 
 * @author Administrator
 *	 排序容器treeMap
 *
 *	总结：treeMap,只能key排序，绝对无法Value排序
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		businessClassSort();
		 impleClassSort();
	}
	/**
	 * 使用排序业务类
	 * treeMap,只能key排序，绝对无法Value排序
	 */
	public static void businessClassSort() {
		Person person1 = new Person(400,"baiHoo");
		Person person2 = new Person(300,"baiHoo");
		Person person3  = new Person(700,"baiHoo");
		Human human1 = new Human(800,"baiHoo");
		Human human2 = new Human(200,"baiHoo");
		Human human3  = new Human(600,"baiHoo");
		TreeMap<Person , Human> treeMap = new TreeMap<Person , Human>(
					//treeMap, key排序
					new Comparator<Person>() {
						
						@Override
						public int compare(Person o1, Person o2) {
							return o1.getHandsome()-o2.getHandsome();
						}
					}
				);
		/*
		TreeMap<Person , Human> treeMap = new TreeMap<Person , Human>(
				//treeMap,只能key排序，绝对无法Value排序
				new Comparator<Human>() {
					@Override
					public int compare(Human o1, Human o2) {
						return o1.getHandsome()-o2.getHandsome();
					}
				}
			);
		*/
		treeMap.put(person3, human3);
		treeMap.put(person2, human2);
		treeMap.put(person1, human1);
		System.out.println(treeMap);
		
	}
	/**
	 * 排序类实现comparable接口，排序
	 */
	public static void impleClassSort() {
		Person person1 = new Person(400,"baiHoo");
		Person person2 = new Person(300,"baiHoo");
		Person person3  = new Person(700,"baiHoo");
		Human human1 = new Human(800,"baiHoo");
		Human human2 = new Human(200,"baiHoo");
		Human human3  = new Human(600,"baiHoo");
		
		//treeMap,只能key排序，绝对无法Value排序
		/**
		TreeMap<Person , Human> treeMap = new TreeMap<Person , Human>();
		treeMap.put(person3, human3);
		treeMap.put(person2, human2);
		treeMap.put(person1, human1);
		*/
		//依次放入treeSet容器中，使用排序业务类（匿名内部类）
		TreeMap<Human , Person> treeMap = new TreeMap<Human , Person>();
		treeMap.put(human3,person3);
		treeMap.put(human2, person2);
		treeMap.put(human1, person1);
		
		
		System.out.println(treeMap.toString());
	}
}
