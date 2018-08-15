package com.baiHoo.colle.enumMapdemo;

import java.util.EnumMap;

/**
 * 
 * @author Administrator
 * EnumMap 要求健必须是枚举类型
 *
 */
public class EnumMapDemo {
		public static void main(String [] args){
			 EnumMap<Season,String> map = new EnumMap<Season,String>(Season.class);
			 map.put(Season.SPRING, "春天");
			 map.put(Season.SUMMER, "夏天");
			 map.put(Season.AUTUMN, "秋天");
			 map.put(Season.WINTER, "冬天");
			 System.out.println(map.size());
		}
	
}
/**
 * 季节
 * @author Administrator
 *
 */
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
