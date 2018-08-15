package com.baihoo.ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlDemo1 {

	public static void main(String[] args) throws OgnlException {
		// ognl可以通过对象调用方法.

		// System.out.println("aaa".length());

		// 使用ognl来完成上面操作.

		// 1.创建一个ognl上下文。
		OgnlContext context = new OgnlContext();

		Object obj1 = Ognl.getValue("'baihoo'.length()", context.getRoot());

		System.out.println(obj1);

	}
}
