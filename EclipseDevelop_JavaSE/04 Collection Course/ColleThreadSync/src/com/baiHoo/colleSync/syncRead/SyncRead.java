package com.baiHoo.colleSync.syncRead;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 只读设置，不可修改
 * 不可变设置："只读"访问，Collections提供了三种方法
	1.	empty***() 空的不可变集合,避免空指针异常
	2. singleton***() 一个元素不可变的集合
	3. unmodifiable***() 不可变容器
 * 
 * @author Administrator
 *
 */
public class SyncRead {
	public static void main(String[] args) {
		avoidEmptyColle();
		singletonColle() ;
		unmodifiableColle();
	}
	
	/**
	 * 避免集合空指针异常
	 */
	public static void avoidEmptyColle() {
		Set<String> set= new HashSet<String>();
		System.out.println(operSet(set));
	}
	public static <E>Set operSet(Set<E> set){
		if(set==null) {
			return Collections.EMPTY_SET;
		}
		return set;
	}
	/**
	 * 一个元素不可变的集合
	 */
	public static void singletonColle() {
		//一个元素测试容器
		List<String> singList = Collections.singletonList(new String("add"));
		// java.lang.UnsupportedOperationException
		//singList.add("ad");
		System.out.println(singList);
		
	} 
	/**
	 * 不可变容器
	 */
	public static void unmodifiableColle() {
		Map<String , String> map = new HashMap<String , String>();
		map.put("ad", "add");
		map.put("de", "dee");
		map.put("dea", "dda");
		map = Collections.unmodifiableMap(map);
		//java.lang.UnsupportedOperationException
		//map.put("tt", "eer");
	}
}
