package com.baiHoo.colle.IdentityHashMapDemo;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap ���Ƚϵ�ַȥ��
 * @author Administrator
 *
 */
public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		IdentityHashMap<String , String> map = new IdentityHashMap<String , String>();
		//�������е�a�ǵ�ַһ��
		map.put("a", "aa");
		map.put("a","bb");
		System.out.println(map.size());
		//new �����е��ַ�����������ַ
		map.put(new String("a"), "cc");
		map.put(new String("a"), "dd");
		System.out.println(map.size());
	}
}
