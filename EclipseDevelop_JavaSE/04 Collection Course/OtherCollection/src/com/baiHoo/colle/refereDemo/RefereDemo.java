package com.baiHoo.colle.refereDemo;

import java.lang.ref.WeakReference;

/**
 * 
 * @author Administrator
 *	���÷��ࣺǿ����������
 * ǿ��������
 */
public class RefereDemo {
	public static void main(String[] args) {
		constantStrongReference();
		objectWeakReference() ;
	}
	/**
	 *  ����ǿӦ��
	 */
	public static void constantStrongReference() {
				//�ַ����ڳ������У��������ܱ����գ�
				String str= "baiHoo is very good!";
				//�����ù������
				WeakReference<String> wr = new WeakReference<String>(str);
				System.out.println("gc����ǰ��"+wr.get());
				//�Ͽ�����
				str=null;
				//֪ͨ����
				System.gc();
				System.runFinalization();
				System.out.println("gc���к�"+wr.get());
	}
	/**
	 *  ������Ӧ��
	 */
	public static void objectWeakReference() {
				//�����ڳ������У���׷��
				String str= new String("baiHoo is very good!");
				//�����ù������
				WeakReference<String> wr = new WeakReference<String>(str);
				System.out.println("gc����ǰ��"+wr.get());
				//�Ͽ�����
				str=null;
				//֪ͨ����
				System.gc();
				System.runFinalization();
				//���󱻻���
				System.out.println("gc���к�"+wr.get());
	}
}
