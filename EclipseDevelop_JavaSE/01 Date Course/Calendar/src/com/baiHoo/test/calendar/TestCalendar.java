package com.baiHoo.test.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author baiHoo.Chen
 *	日历类
 *	注意：
 *	—月份：一月是0，二月是1，以此类推，十二月就是11
 *	—星期：周日是1，周一是2，以此类推，周六就是7
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();
		//2016年2月10日12点23分34秒
		//ca.set(2016, 1 , 10 , 12 , 23 , 34);
		
		//Calendar 提供的常量
		//ca.set(2016, Calendar.FEBRUARY , 10 , 12 , 23 , 34);
		
		//属性设置年月日时分秒，不传值的默认当前日期对应的
		ca.set(Calendar.YEAR, 2016);
		ca.set(Calendar.MONTH, 1);
		ca.set(Calendar.DATE, 22);
		Date date  = ca.getTime();
		System.out.println(date);
		
		//获取年份，以此类推获取月份日期时分秒
		System.out.println(ca.get(Calendar.YEAR));
		
		//时间的计算 , 以此类推获取月份日期时分秒
		ca.add(Calendar.YEAR, -30);
		System.out.println(ca.get(Calendar.YEAR));
		
	}
}
