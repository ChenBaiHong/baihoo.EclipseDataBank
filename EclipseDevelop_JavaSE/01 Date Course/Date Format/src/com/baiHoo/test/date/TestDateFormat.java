package com.baiHoo.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author baiHoo.Chen 
 * 	时间格式化
 */
public class TestDateFormat {
	public static void main(String[] args) {
		regExStringDateFormat();
		normalCourseFormatDate();
	}

	/**
	 * 正则格式的时间字符串转化成常规可视化时间字符串
	 */
	private static void regExStringDateFormat() {
		// 年月日时分秒格式
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd mm:hh:ss , 该月属于本年的第 w 周，隶属本月的第 W 周");
		// 时间数字传入长整正型数字，数字末尾 L结尾，示意传入的是长整正型数字
		Date date = new Date(56546464465L);
		// 将时间对象按照格式化字符串，转化成字符串
		String sDate = df.format(date);
		System.out.println(sDate);
	}
	/**
	 * 常规可视化时间字符串格式化成时间对象
	 * 		注意：正则时间格式字符串必须与常规可视化时间字符串，格式保持一致
	 */
	private static void normalCourseFormatDate() {
		String sDate = "2016-11-22 22:22:22"; 
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd mm:hh:ss");
		try {
			Date date = df.parse(sDate);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
