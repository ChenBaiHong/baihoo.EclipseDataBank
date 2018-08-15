package com.baiHoo.googleFunc;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * 函数式编程
 * 1. Predicate 断言，断定; 宣布，宣讲; 使基于; 
 * 2. Function
 * 
 * 工具：Collection2.filter() 过滤器
 * 
 * @author Administrator
 * 
 */
public class GoogleFuncProgram {
	public static void main(String[] args) {
		googleColleFilterFunc();
		googleColleTransformFunc();
		googleFuncCompose() ;
	}

	/**
	 * Google集合过滤函数操作
	 */
	public static void googleColleFilterFunc() {
		// 创建List 静态初始化
		List<String> list = Lists.newArrayList("baiHoo", "HooH", "bab");
		// 找出回文 palindrome back words mirror words
		// 匿名内部类对象：匿名内部类，同事创建类对象
		// 泛型是没有多肽
		Collection<String> palindromeList = Collections2.filter(list, new Predicate<String>() {
			@Override
			// 业务逻辑
			public boolean apply(String input) {
				// StringBuilder(input).reverse() 反转
				return new StringBuilder(input).reverse().toString().equals(input);
			}

		});

		for (String string : palindromeList) {
			System.out.println(string);
		}
	}

	/**
	 * Google集合，类型转换函数操作
	 */
	public static void googleColleTransformFunc() {
		// 创建set 静态初始化
		Set<Long> set = Sets.newHashSet(1000000000L, 9999999999999L, 88888888888L);
		// 时间类型转换成字符串
		Collection<String> temeSet = Collections2.transform(set, new Function<Long, String>() {
			@Override
			public String apply(Long input) {
				return new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(new Date(input));
			}
		});
		for (String string : temeSet) {
			System.out.println(string);
		}
	}

	/**
	 * Google 函数组合使用
	 */
	public static void googleFuncCompose() {
		// 创建List 静态初始化
		List<String> list = Lists.newArrayList("baiHoo", "HooHdkjfla", "babdfasdf");

		Function<String, String> func1 = new Function<String, String>() {
			@Override
			// 业务逻辑，如果字符串长度大于5截取
			public String apply(String input) {
				return input.length() > 5 ? input.substring(0, 5) : input;
			}
		};
		Function<String, String> func2 = new Function<String, String>() {
			@Override
			public String apply(String input) {
				// 字符串转化为大写
				return input.toUpperCase();
			}
		};
		//組合式函數式編程
		Function<String, String> composeFunc = Functions.compose(func1, func2);
		Collection<String> composeList = Collections2.transform(list, composeFunc);
		for (String string : composeList) {
			System.out.println(string);
		}
	}
}
