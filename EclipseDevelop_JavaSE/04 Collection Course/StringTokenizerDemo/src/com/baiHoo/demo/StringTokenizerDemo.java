package com.baiHoo.demo;

import java.util.StringTokenizer;

/**
 * 
 * @author Administrator
 * StringTokenizer 是 Enumeration子类
 * StringTokenizer : String split(),支持字符分割，不支持正则
 * 
 * StringTokenizer(String str, String delim)
 */
public class StringTokenizerDemo {
	public static void main(String[] args) {
		String str = "baiHoo;baiHoo.Chen;baiHoo.Chen@hot";
		StringTokenizer stringTokenizer = new StringTokenizer(str,";");
		while(stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
