package com.baihoo.ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlDemo3 {

	public static void main(String[] args) throws OgnlException {

		// 创建一个ognl上下文
		OgnlContext context = new OgnlContext(); // 本质上就是一个Map集合.

		Person p = new Person();
		p.setName("张三");

		Dog dog = new Dog();
		dog.setName("lucy");

		p.setDog(dog); //张三有条狗叫lucy
		
		context.setRoot(p);

		Dog dog1 = new Dog();
		dog1.setName("豆豆");
		
		Person pp=new Person();
		pp.setName("james");
		dog1.setP(pp);

		context.put("dog", dog1);

		context.put("name", "tom");

		// 使用 ognl来获取根(root)中数据 获取根中数据，不需要加#
		Object name1 = Ognl.getValue("name", context, context.getRoot());

		System.out.println(name1);

		// 使用ognl来获取非根中的数据 获取非根中数据，需要使用#

		Object name2 = Ognl.getValue("#name", context, context.getRoot());

		System.out.println(name2);
		
		//获取出张三的的狗的名称
		
		Object name3 = Ognl.getValue("dog.name", context, context.getRoot());

		System.out.println(name3);
		
		//豆豆的主人名称
		Object name4=Ognl.getValue("#dog.p.name", context, context.getRoot());
		
		System.out.println(name4);
		

	}
}
