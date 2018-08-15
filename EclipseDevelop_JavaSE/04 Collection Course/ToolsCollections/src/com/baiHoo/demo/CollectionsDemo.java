package com.baiHoo.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Administrator collections��java�еĳ����÷�
 */
public class CollectionsDemo {

	public static void main(String args[]) {
		sortMethod();
		shuffleMethod();
		reverseMethod();
		fillMethod();
		copyMethod();
		minMethod();
		maxMethod();
		lastIndexOfSubListMethod();
		indexOfSubListMethod();
		 rotateMethod();
		 swapMethod();
	}

	/**
	 * 1�� ����Sort�� ʹ��sort�������Ը���Ԫ�ص���Ȼ˳�� ��ָ���б������������ �б��е�����Ԫ�ض�����ʵ�� Comparable
	 * �ӿڡ����б��ڵ�����Ԫ �ض�������ʹ��ָ���Ƚ������໥�Ƚϵ�
	 */
	public static void sortMethod() {
		Double array[] = { 112.12D, 111.45D, 23.12D, 456.23D, 231.77D };
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Double(array[i]));
		}
		Collections.sort(list);
		for (int i = 0; i < array.length; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 2�� ���ţ�Shuffling�������㷨������������ sort �෴�� ��������һ�� List �п����е��κ����е��ټ���Ҳ����˵���������Դ������
	 * ���Ÿ� List�����������о�����ͬ�Ŀ����ԣ��������Դ�ǹ����ģ�������㷨��ʵ��һ������������Ϸ���Ƿǳ����õġ����磬���ɱ�����
	 * ���Ŵ���һ���Ƶ�Card �����һ�� List .���⣬�����ɲ��԰���ʱ����Ҳ��ʮ�����õġ�
	 */
	public static void shuffleMethod() {
		Double array[] = { 112.12D, 111.45D, 23.12D, 456.23D, 231.77D };
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Double(array[i]));
		}
		Collections.shuffle(list);
		for (int i = 0; i < array.length; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 3�� ��ת��Reverse�� ʹ��Reverse�������Ը���Ԫ�ص���Ȼ˳�� ��ָ���б������������
	 */
	public static void reverseMethod() {
		Double array[] = { 112.12D, 111.45D, 23.12D, 456.23D, 231.77D };
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Double(array[i]));
		}
		Collections.reverse(list);
		for (int i = 0; i < array.length; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 4�� �滻���е�Ԫ�أ�Fill��ʹ��ָ��Ԫ���滻ָ���б��е�����Ԫ�ء�
	 */
	public static void fillMethod() {
		String str[] = { "dd", "aa", "bb", "cc", "ee" };
		List<String> li = new ArrayList<String>();
		li.addAll(Arrays.asList(str));
		Collections.fill(li, "aaa");
		for (int i = 0; i < li.size(); i++) {
			System.out.println("list[" + i + "]=" + li.get(i));
		}
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 5�� ������Copy��������������һ��Ŀ�� List ��һ��Դ List�� ��Դ��Ԫ�ؿ�����Ŀ�꣬�������������ݡ�Ŀ�� List ������Դһ������
	 * ���������������Ŀ�� List �е�ʣ��Ԫ�ز���Ӱ�졣Collections.copy��list��li���� ����һ��������Ŀ���б� ��ǰһ����Դ�б�
	 */
	public static void copyMethod() {
		List<String> list = new ArrayList<String>();
		List<String> li = new ArrayList<String>();
		String str[] = { "dd", "aa", "bb", "cc", "ee" };
		String arr[] = { "ff", "jj" };
		list.addAll(Arrays.asList(str));
		li.addAll(Arrays.asList(arr));
		Collections.copy(list, li);
		System.out.println(list);
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 6�� ����Collections����СԪ�أ�min������ָ���Ƚ���������˳�򣬷��ظ��� collection ����СԪ�ء� collection
	 * �е�����Ԫ�ض�������ͨ��ָ���Ƚ������໥�Ƚϵ�
	 */
	public static void minMethod() {
		Double array[] = { 112.12D, 111.45D, 23.12D, 456.23D, 231.77D };
		List<Double> list = new ArrayList<Double>();
		list.addAll(Arrays.asList(array));
		Double min = Collections.min(list);
		System.out.println(min);
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 7�� ����Collections�����Ԫ�أ�max������ָ���Ƚ���������˳�򣬷��ظ��� collection �����Ԫ�ء� collection
	 * �е�����Ԫ�ض�������ͨ��ָ���Ƚ������໥�Ƚϵ�
	 */
	public static void maxMethod() {
		Double array[] = { 112.12D, 111.45D, 23.12D, 456.23D, 231.77D };
		List<Double> list = new ArrayList<Double>();
		list.addAll(Arrays.asList(array));
		Double max = Collections.max(list);
		System.out.println(max);
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 8�� lastIndexOfSubList����ָ��Դ�б������һ�γ���ָ��Ŀ���б����ʼλ�ã� �����Ӻ�ǰ��˳�򷵻���List�ڸ�List�е�����λ�á�
	 */
	public static void lastIndexOfSubListMethod() {
		List<String> list = new ArrayList<String>();
		List<String> li = new ArrayList<String>();
		String str[] = { "dd", "aa", "bb", "cc", "ee" };
		String arr[] = { "dd" };
		list.addAll(Arrays.asList(str));
		li.addAll(Arrays.asList(arr));
		int locations = Collections.lastIndexOfSubList(list, li);
		System.out.println(locations);
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 9�� IndexOfSubList����ָ��Դ�б��е�һ�γ���ָ��Ŀ���б����ʼλ��
	 */
	public static void indexOfSubListMethod() {
		List<String> list = new ArrayList<String>();
		List<String> li = new ArrayList<String>();
		String str[] = { "dd", "aa", "bb", "cc", "ee" };
		String arr[] = { "ee" };
		list.addAll(Arrays.asList(str));
		li.addAll(Arrays.asList(arr));
		int locations = Collections.indexOfSubList(list, li);
		System.out.println(locations);
		System.out.println("-----------------------------------------------------------");
	}

	/**
	 * 10�� Rotate����ָ���ľ���ѭ���ƶ�ָ���б��е�Ԫ��Collections.rotate��list��-1��������Ǹ������������ƶ��������򷴷����ƶ�
	 */
	public static void rotateMethod() {
		Integer array[] = { 112, 111, 23, 456, 231 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Integer(array[i]));
		}
		Collections.rotate(list, 2);
		System.out.println(list);
		System.out.println("-----------------------------------------------------------");
	}
	/**
	 * 11�� swap ��������ָ���������±����λ�õ�ֵ����
	 */
	public static void swapMethod() {
		Integer array[] = { 112, 111, 23, 456, 231 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Integer(array[i]));
		}
		Collections.swap(list, 2, 3);
		System.out.println(list);
		System.out.println("-----------------------------------------------------------");
	}
}
