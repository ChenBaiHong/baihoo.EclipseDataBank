package com.baiHoo.colleSync.threadSync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 容器线程同步安全
 * 	2. Collections 提供了synchronized***()方法，将指定容器包装成同步
			synchronizedList()
			synchronizedSet()
			synchronizedMap()
			
 * @author Administrator
 *
 */
public class SyncColle {
	public static void main(String [] args) {
		List<String> list = new ArrayList<String>();
		list.add("de");
		list.add("de1");
		list.add("de2");
		list.add("de3");
		//线程安全的容器
		List<String> syncList = Collections.synchronizedList(list);
		System.out.println(syncList);
	}
}
