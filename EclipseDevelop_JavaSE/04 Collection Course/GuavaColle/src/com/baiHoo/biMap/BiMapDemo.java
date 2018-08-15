package com.baiHoo.biMap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * HashMap 键唯一，值可以重复 BiMap:双向Map(Bidirectional Map ) 键与值都不能重复(unique -valued
 * map)
 * 
 * @author Administrator
 *
 */
public class BiMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BiMap<String, String> bimap = HashBiMap.create();
		bimap.put("baiHoo", "baiHoo.chen@hotmail.com");
		bimap.put("baiH", "baiH@google.com");
		// 通过邮箱找用户
		String user = bimap.inverse().get("baiH@google.com");
		System.out.println(user);
		System.out.println(bimap.inverse().inverse() == bimap);

	}

}
