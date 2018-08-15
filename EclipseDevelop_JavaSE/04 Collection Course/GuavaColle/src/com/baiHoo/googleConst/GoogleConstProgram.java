package com.baiHoo.googleConst;

import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.Constraint;
import com.google.common.collect.Constraints;
import com.google.common.collect.Sets;

/**
 * 約束條件：非空，长度验证 函数式编程 1. Predicate 断言，断定; 宣布，宣讲; 使基于; 2. Function 3. Constraint
 * 约束
 * 
 * @author Administrator
 *
 */
public class GoogleConstProgram {

	public static void main(String[] args) {
		Set<String> set = Sets.newHashSet();
		Constraint<String> constr = new Constraint<String>() {
			@Override
			// 約束條件
			public String checkElement(String element) {
				// 非空驗證
				Preconditions.checkNotNull(element);
				// 長度驗證5-20長度
				Preconditions.checkArgument(element.length() > 5 && element.length() < 20);
				return element;
			}
		};
		Set<String> constrSet = Constraints.constrainedSet(set, constr);
		//java.lang.NullPointerException
		//constrSet.add(null);
		//java.lang.IllegalArgumentException
		//constrSet.add("bai");
		constrSet.add("baiHoo");
		for (String string : constrSet) {
			System.out.println(string);
		}
	}
}
