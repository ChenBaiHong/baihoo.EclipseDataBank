package com.baiHoo.colleSync.threadSync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����߳�ͬ����ȫ
 * 	2. Collections �ṩ��synchronized***()��������ָ��������װ��ͬ��
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
		//�̰߳�ȫ������
		List<String> syncList = Collections.synchronizedList(list);
		System.out.println(syncList);
	}
}
