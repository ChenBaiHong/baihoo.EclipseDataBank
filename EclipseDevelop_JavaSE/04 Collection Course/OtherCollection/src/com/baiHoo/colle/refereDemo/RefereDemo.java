package com.baiHoo.colle.refereDemo;

import java.lang.ref.WeakReference;

/**
 * 
 * @author Administrator
 *	引用分类：强，软，弱，虚
 * 强与弱引用
 */
public class RefereDemo {
	public static void main(String[] args) {
		constantStrongReference();
		objectWeakReference() ;
	}
	/**
	 *  常量强应用
	 */
	public static void constantStrongReference() {
				//字符串在常量池中，共享（不能被回收）
				String str= "baiHoo is very good!";
				//弱引用管理对象
				WeakReference<String> wr = new WeakReference<String>(str);
				System.out.println("gc运行前："+wr.get());
				//断开引用
				str=null;
				//通知回收
				System.gc();
				System.runFinalization();
				System.out.println("gc运行后："+wr.get());
	}
	/**
	 *  对象弱应用
	 */
	public static void objectWeakReference() {
				//对象在常量池中，被追踪
				String str= new String("baiHoo is very good!");
				//弱引用管理对象
				WeakReference<String> wr = new WeakReference<String>(str);
				System.out.println("gc运行前："+wr.get());
				//断开引用
				str=null;
				//通知回收
				System.gc();
				System.runFinalization();
				//对象被回收
				System.out.println("gc运行后："+wr.get());
	}
}
