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
 * ����ʽ���
 * 1. Predicate ���ԣ��϶�; ����������; ʹ����; 
 * 2. Function
 * 
 * ���ߣ�Collection2.filter() ������
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
	 * Google���Ϲ��˺�������
	 */
	public static void googleColleFilterFunc() {
		// ����List ��̬��ʼ��
		List<String> list = Lists.newArrayList("baiHoo", "HooH", "bab");
		// �ҳ����� palindrome back words mirror words
		// �����ڲ�����������ڲ��࣬ͬ�´��������
		// ������û�ж���
		Collection<String> palindromeList = Collections2.filter(list, new Predicate<String>() {
			@Override
			// ҵ���߼�
			public boolean apply(String input) {
				// StringBuilder(input).reverse() ��ת
				return new StringBuilder(input).reverse().toString().equals(input);
			}

		});

		for (String string : palindromeList) {
			System.out.println(string);
		}
	}

	/**
	 * Google���ϣ�����ת����������
	 */
	public static void googleColleTransformFunc() {
		// ����set ��̬��ʼ��
		Set<Long> set = Sets.newHashSet(1000000000L, 9999999999999L, 88888888888L);
		// ʱ������ת�����ַ���
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
	 * Google �������ʹ��
	 */
	public static void googleFuncCompose() {
		// ����List ��̬��ʼ��
		List<String> list = Lists.newArrayList("baiHoo", "HooHdkjfla", "babdfasdf");

		Function<String, String> func1 = new Function<String, String>() {
			@Override
			// ҵ���߼�������ַ������ȴ���5��ȡ
			public String apply(String input) {
				return input.length() > 5 ? input.substring(0, 5) : input;
			}
		};
		Function<String, String> func2 = new Function<String, String>() {
			@Override
			public String apply(String input) {
				// �ַ���ת��Ϊ��д
				return input.toUpperCase();
			}
		};
		//�M��ʽ����ʽ����
		Function<String, String> composeFunc = Functions.compose(func1, func2);
		Collection<String> composeList = Collections2.transform(list, composeFunc);
		for (String string : composeList) {
			System.out.println(string);
		}
	}
}
