package com.baiHoo.colle.IdentityHashMapDemo;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap 健比较地址去重
 * @author Administrator
 *
 */
public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		IdentityHashMap<String , String> map = new IdentityHashMap<String , String>();
		//常量池中的a是地址一致
		map.put("a", "aa");
		map.put("a","bb");
		System.out.println(map.size());
		//new 对象中的字符串是两个地址
		map.put(new String("a"), "cc");
		map.put(new String("a"), "dd");
		System.out.println(map.size());
	}
}
