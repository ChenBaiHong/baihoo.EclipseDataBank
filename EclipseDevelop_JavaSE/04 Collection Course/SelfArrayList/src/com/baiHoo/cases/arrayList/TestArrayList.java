package com.baiHoo.cases.arrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 
 * @author baiHoo.Chen
 *	测试自己手写的ArrayList集合
 */
@SuppressWarnings("all")
public class TestArrayList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("de");
		list.add(1);
		list.add(new Date());
		list.add("bbb");
		list.get(1);
		list.remove(1);
		list.add(0, "cccc");
		list.size();
	}
}
