package com.baiHoo.googleMath;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * 集合的操作：交集，差集，并集
 * Sets.intersection
 * Sets.difference
 * Sets.union
 * 
 * @author Administrator
 *
 */
public class GoogleColleMath {
	public static void main(String[] args) {
		Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 10, 4, 5, 6, 7, 8);
		Set<Integer> set2 = Sets.newHashSet(3, 4, 5, 6, 7, 8, 11, 12);
		// 交集
		System.out.println("交集為：");
		Set<Integer> tintersection = Sets.intersection(set1, set2);
		for (Integer integer : tintersection) {
			System.out.println(integer);
		}
		// 差集
		System.out.println("差集為：");
		Set<Integer> difference = Sets.difference(set1, set2);
		for (Integer integer : difference) {
			System.out.println(integer);
		}
		// 并集
		System.out.println("差集為：");
		Set<Integer> union = Sets.union(set1, set2);
		for (Integer integer : union) {
			System.out.println(integer);
		}

	}
}
