package com.baiHoo.colle.weakHashMapDemo;

import java.util.WeakHashMap;

/**
 * weakHashMap ��Ϊ�����ͣ�gc������������
 * @author Administrator
 *
 */
public class WeakHashMapDemo {

	public static void main(String [] args) {
		WeakHashMap<String , String> map = new WeakHashMap<String, String>();
		//�ַ����ڳ������У��������ܱ����գ�
		map.put("baiHOo", "hao yang de");
		map.put("baiHoo.Chen", "hao yang de ");
		//�����ڳ������У���׷��
		map.put(new String("baiHoo"), "hao yang de");
		map.put(new String("baiHoo.C"),"bu cuo");
		//֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println("gc���к�"+map.size());
	}
}
