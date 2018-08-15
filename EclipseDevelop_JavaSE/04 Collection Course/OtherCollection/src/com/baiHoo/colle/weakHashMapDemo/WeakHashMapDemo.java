package com.baiHoo.colle.weakHashMapDemo;

import java.util.WeakHashMap;

/**
 * weakHashMap 键为弱类型，gc运行立即回收
 * @author Administrator
 *
 */
public class WeakHashMapDemo {

	public static void main(String [] args) {
		WeakHashMap<String , String> map = new WeakHashMap<String, String>();
		//字符串在常量池中，共享（不能被回收）
		map.put("baiHOo", "hao yang de");
		map.put("baiHoo.Chen", "hao yang de ");
		//对象在常量池中，被追踪
		map.put(new String("baiHoo"), "hao yang de");
		map.put(new String("baiHoo.C"),"bu cuo");
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后："+map.size());
	}
}
