package com.baiHoo.apacheFunc;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.list.PredicatedList;

/**
 * ����ʽ��� ֮ Predicate ���� ��װ�������б�ʽ if..else���
 *  1�� new EqualPredicate<����>(ֵ)
 * EqualPredicate.equalPredicate(ֵ); 
 * 
 * 2��NotNullPredicate.INSTANCE
 * 
 * 3��UniquePredicate.uniquePredicate() 
 * 
 * 4���Զ��� new Predicate() +evaluate
 * PredicateUtils.allPredicate andPredicate anyPredicate
 * PredicatedXxx.predicatedXxx(����,�ж�)
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class PredicateDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		customPredicate();
		unique();
		notNull();
		equal();
	}

	/**
	 * �Զ����ж�
	 */
	public static void customPredicate() {
		System.out.println("======�Զ����ж�======");
		// �Զ�����б�ʽ
		Predicate<String> selfPre = new Predicate<String>() {
			@Override
			public boolean evaluate(String object) {
				return object.length() >= 5 && object.length() <= 20;

			}
		};
		Predicate notNull = NotNullPredicate.notNullPredicate();

		Predicate all = PredicateUtils.allPredicate(notNull, selfPre);

		List<String> list = PredicatedList.predicatedList(new ArrayList<String>(), all);
		list.add("baiHoo");
		// java.lang.IllegalArgumentException: Cannot add Object 'null' - Predicate
		// list.add(null);
		// list.add("bai");
	}

	/**
	 * �ж�Ψһ
	 */
	public static void unique() {
		System.out.println("====Ψһ���ж�====");
		Predicate<Long> uniquePre = UniquePredicate.uniquePredicate();
		List<Long> list = PredicatedList.predicatedList(new ArrayList<Long>(), uniquePre);
		list.add(100L);
		list.add(200L);
		// java.lang.IllegalArgumentException: Cannot add Object '100'
		// list.add(100L); // �����ظ�ֵ���׳��쳣
	}

	/**
	 * �жϷǿ�
	 */
	public static void notNull() {
		System.out.println("====�ǿ��ж�====");
		// Predicate notNull=NotNullPredicate.INSTANCE;
		Predicate notNull = NotNullPredicate.notNullPredicate();
		// String str ="bjs";
		String str = null;
		System.out.println(notNull.evaluate(str)); // ����ǿ�Ϊtrue ,����Ϊfalse

		// �������ֵ���ж�
		List<Long> list = PredicatedList.predicatedList(new ArrayList<Long>(), notNull);
		list.add(1000L);
		// java.lang.IllegalArgumentException: Cannot add Object 'null'
		// list.add(null); // ��֤ʧ�ܣ������쳣
	}

	/**
	 * �Ƚ�����ж�
	 */
	public static void equal() {
		System.out.println("======����ж�======");
		// Predicate<String> pre =new EqualPredicate<String>("baiHoo");
		Predicate<String> pre = EqualPredicate.equalPredicate("baiHoo");
		boolean flag = pre.evaluate("bj");
		System.out.println(flag);
	}

}
