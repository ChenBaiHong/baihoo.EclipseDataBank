package com.baiHoo.demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 * @author Administrator
 *	��������treeSet
 *
 * ʹ��compareҵ��������
 */
public class TreeSetDemo {
	public static void main(String args[]) {
		businessClassSort();
		impleClassSort();
	}
	/**
	 * ʹ������ҵ����
	 */
	public static void businessClassSort() {
		Person person1 = new Person(400,"baiHoo");
		Person person2 = new Person(300,"baiHoo");
		Person person3  = new Person(700,"baiHoo");
		//���η���treeSet�����У�ʹ������ҵ���ࣨ�����ڲ��ࣩ
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
	 * ������ʵ��comparable�ӿڣ�����
	 */
	public static void impleClassSort() {
		Human human1 = new Human(400,"baiHoo");
		Human human2 = new Human(300,"baiHoo");
		Human human3  = new Human(700,"baiHoo");
		//���η���treeSet�����У�ʹ������ҵ���ࣨ�����ڲ��ࣩ
		TreeSet <Human>treeSet = new TreeSet<Human>();
		treeSet.add(human1);
		treeSet.add(human3);
		treeSet.add(human2);
		System.out.println(treeSet.toString());
	}
}
