package com.baiHoo.biMap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * HashMap ��Ψһ��ֵ�����ظ� BiMap:˫��Map(Bidirectional Map ) ����ֵ�������ظ�(unique -valued
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
		// ͨ���������û�
		String user = bimap.inverse().get("baiH@google.com");
		System.out.println(user);
		System.out.println(bimap.inverse().inverse() == bimap);

	}

}
