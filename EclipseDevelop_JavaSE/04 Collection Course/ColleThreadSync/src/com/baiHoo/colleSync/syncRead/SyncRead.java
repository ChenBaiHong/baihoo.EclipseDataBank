package com.baiHoo.colleSync.syncRead;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ֻ�����ã������޸�
 * ���ɱ����ã�"ֻ��"���ʣ�Collections�ṩ�����ַ���
	1.	empty***() �յĲ��ɱ伯��,�����ָ���쳣
	2. singleton***() һ��Ԫ�ز��ɱ�ļ���
	3. unmodifiable***() ���ɱ�����
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
	 * ���⼯�Ͽ�ָ���쳣
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
	 * һ��Ԫ�ز��ɱ�ļ���
	 */
	public static void singletonColle() {
		//һ��Ԫ�ز�������
		List<String> singList = Collections.singletonList(new String("add"));
		// java.lang.UnsupportedOperationException
		//singList.add("ad");
		System.out.println(singList);
		
	} 
	/**
	 * ���ɱ�����
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
