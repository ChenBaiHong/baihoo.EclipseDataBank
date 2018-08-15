package com.baiHoo.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Administrator collections在java中的常见用法
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
	 * 1） 排序（Sort） 使用sort方法可以根据元素的自然顺序 对指定列表按升序进行排序。 列表中的所有元素都必须实现 Comparable
	 * 接口。此列表内的所有元 素都必须是使用指定比较器可相互比较的
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
	 * 2） 混排（Shuffling）混排算法所做的正好与 sort 相反： 它打乱在一个 List 中可能有的任何排列的踪迹。也就是说，基于随机源的输入
	 * 重排该 List，这样的排列具有相同的可能性（假设随机源是公正的）。这个算法在实现一个碰运气的游戏中是非常有用的。例如，它可被用来
	 * 混排代表一副牌的Card 对象的一个 List .另外，在生成测试案例时，它也是十分有用的。
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
	 * 3） 反转（Reverse） 使用Reverse方法可以根据元素的自然顺序 对指定列表按降序进行排序。
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
	 * 4） 替换所有的元素（Fill）使用指定元素替换指定列表中的所有元素。
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
	 * 5） 拷贝（Copy）用两个参数，一个目标 List 和一个源 List， 将源的元素拷贝到目标，并覆盖它的内容。目标 List 至少与源一样长。
	 * 如果它更长，则在目标 List 中的剩余元素不受影响。Collections.copy（list，li）： 后面一个参数是目标列表 ，前一个是源列表
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
	 * 6） 返回Collections中最小元素（min）根据指定比较器产生的顺序，返回给定 collection 的最小元素。 collection
	 * 中的所有元素都必须是通过指定比较器可相互比较的
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
	 * 7） 返回Collections中最大元素（max）根据指定比较器产生的顺序，返回给定 collection 的最大元素。 collection
	 * 中的所有元素都必须是通过指定比较器可相互比较的
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
	 * 8） lastIndexOfSubList返回指定源列表中最后一次出现指定目标列表的起始位置， 即按从后到前的顺序返回子List在父List中的索引位置。
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
	 * 9） IndexOfSubList返回指定源列表中第一次出现指定目标列表的起始位置
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
	 * 10） Rotate根据指定的距离循环移动指定列表中的元素Collections.rotate（list，-1）；如果是负数，则正向移动，正数则反方向移动
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
	 * 11） swap 根据容器指定的两个下表进行位置的值交换
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
