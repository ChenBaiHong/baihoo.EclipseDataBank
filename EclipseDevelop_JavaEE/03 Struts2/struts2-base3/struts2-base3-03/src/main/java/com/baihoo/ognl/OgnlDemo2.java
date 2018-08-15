package com.baihoo.ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlDemo2 {

	public static void main(String[] args) throws OgnlException {
		// ognl可以通过对象调用方法.

		System.out.println(Math.max(10, 20));
		System.out.println(Math.PI);
		// 使用ognl来完成上面操作.

		// 1.创建一个ognl上下文。
		OgnlContext context = new OgnlContext();

		Object obj1 = Ognl.getValue("@java.lang.Math@max(10,20)", context.getRoot());

		System.out.println(obj1);
		
		Object obj2= Ognl.getValue("@java.lang.Math@PI", context.getRoot());

		System.out.println(obj2);

	}
}
