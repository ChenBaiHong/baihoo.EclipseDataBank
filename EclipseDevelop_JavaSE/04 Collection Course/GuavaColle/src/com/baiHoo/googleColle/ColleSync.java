package com.baiHoo.googleColle;

import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * 
 * @author Administrator
 *	�ȸ��ṩ�ļ���ֻ������
 * 
 */
public class ColleSync {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = ImmutableList.of("de","de2","de2");
		System.out.println(list);
		//java.lang.UnsupportedOperationException
		//list.add("de");
		
	}
}
