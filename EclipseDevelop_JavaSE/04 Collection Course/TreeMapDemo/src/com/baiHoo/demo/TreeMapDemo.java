package com.baiHoo.demo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 
 * @author Administrator
 *	 ��������treeMap
 *
 *	�ܽ᣺treeMap,ֻ��key���򣬾����޷�Value����
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		businessClassSort();
		 impleClassSort();
	}
	/**
	 * ʹ������ҵ����
	 * treeMap,ֻ��key���򣬾����޷�Value����
	 */
	public static void businessClassSort() {
		Person person1 = new Person(400,"baiHoo");
		Person person2 = new Person(300,"baiHoo");
		Person person3  = new Person(700,"baiHoo");
		Human human1 = new Human(800,"baiHoo");
		Human human2 = new Human(200,"baiHoo");
		Human human3  = new Human(600,"baiHoo");
		TreeMap<Person , Human> treeMap = new TreeMap<Person , Human>(
					//treeMap, key����
					new Comparator<Person>() {
						
						@Override
						public int compare(Person o1, Person o2) {
							return o1.getHandsome()-o2.getHandsome();
						}
					}
				);
		/*
		TreeMap<Person , Human> treeMap = new TreeMap<Person , Human>(
				//treeMap,ֻ��key���򣬾����޷�Value����
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
	 * ������ʵ��comparable�ӿڣ�����
	 */
	public static void impleClassSort() {
		Person person1 = new Person(400,"baiHoo");
		Person person2 = new Person(300,"baiHoo");
		Person person3  = new Person(700,"baiHoo");
		Human human1 = new Human(800,"baiHoo");
		Human human2 = new Human(200,"baiHoo");
		Human human3  = new Human(600,"baiHoo");
		
		//treeMap,ֻ��key���򣬾����޷�Value����
		/**
		TreeMap<Person , Human> treeMap = new TreeMap<Person , Human>();
		treeMap.put(person3, human3);
		treeMap.put(person2, human2);
		treeMap.put(person1, human1);
		*/
		//���η���treeSet�����У�ʹ������ҵ���ࣨ�����ڲ��ࣩ
		TreeMap<Human , Person> treeMap = new TreeMap<Human , Person>();
		treeMap.put(human3,person3);
		treeMap.put(human2, person2);
		treeMap.put(human1, person1);
		
		
		System.out.println(treeMap.toString());
	}
}
