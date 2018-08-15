package com.baiHoo.apacheBag;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;

/**
 Bag �� �����ظ�
 1��HashBag ����
 2��TreeBag ����
 ͳ�Ƶ��ʵĳ��ִ���
 * @author Administrator
 *
 */
public class BagDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// hashBag();
		// treeBag();
		String str = "this is a cat and that is a mice where is the food";
		// �ָ��ַ���
		String[] strArray = str.split(" ");
		Bag<String> bag = new TreeBag<String>();
		for (String temp : strArray) {
			bag.add(temp);
		}

		System.out.println("====ͳ�ƴ���===");
		Set<String> keys = bag.uniqueSet();
		for (String letter : keys) {
			System.out.println(letter + "-->" + bag.getCount(letter));
		}

	}

	/**
	 * ����
	 */
	public static void treeBag() {
		System.out.println("=====����İ�====");
		Bag<String> bag = new TreeBag<String>();
		bag.add("a");
		bag.add("a", 5);
		bag.remove("a", 2);
		bag.add("b");
		bag.add("c");
		Iterator<String> it = bag.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * ����
	 */
	public static void hashBag() {
		System.out.println("=====����İ�====");
		Bag<String> bag = new HashBag<String>();
		bag.add("a");
		bag.add("a", 5);
		bag.remove("a", 2);
		bag.add("b");
		bag.add("c");
		Iterator<String> it = bag.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}