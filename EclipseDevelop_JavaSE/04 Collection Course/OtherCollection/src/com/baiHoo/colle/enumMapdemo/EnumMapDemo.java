package com.baiHoo.colle.enumMapdemo;

import java.util.EnumMap;

/**
 * 
 * @author Administrator
 * EnumMap Ҫ�󽡱�����ö������
 *
 */
public class EnumMapDemo {
		public static void main(String [] args){
			 EnumMap<Season,String> map = new EnumMap<Season,String>(Season.class);
			 map.put(Season.SPRING, "����");
			 map.put(Season.SUMMER, "����");
			 map.put(Season.AUTUMN, "����");
			 map.put(Season.WINTER, "����");
			 System.out.println(map.size());
		}
	
}
/**
 * ����
 * @author Administrator
 *
 */
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
