package com.baiHoo.cases.visualCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 
 * @author baiHoo.Chen
 *	可视化日历程序案例
 */
@SuppressWarnings("all")
public class VisualCalendar {
	public static void main(String[] args) {
		System.out.println("请遵照 1970-1-1 输入时间格式：");
		//System.out.print("\t");
		//按格式输入时间
		Scanner scanner = new Scanner(System.in);
		String timeChar = scanner.nextLine(); 
										//"2018-4-3";
		//格式化输入的时间
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		try {
			//解析字符串时间转化为时间对象实例
			Date date = df.parse(timeChar);
			//创建日历实例对象
			Calendar calendar = new GregorianCalendar();
			//日历实例对象设置时间
			calendar.setTime(date);
			//获得日历实例设置时间的最大的日期
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
			//获得日历实例设置时间的当前日期
			int currentDate = calendar.get(Calendar.DATE);
			int curentWeek = calendar.get(Calendar.DAY_OF_WEEK);
			
			//初始设置为当前月份的第一天
			calendar.set(Calendar.DATE, 1);
			//获取当前月份第一天是星期几
			int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			//System.out.println(firstDayOfWeek);
			for(int j =1 ; j<firstDayOfWeek ; j++) {
				System.out.print("\t");
			}
			for(int i = 1 ; i <= maxDate ; i++) {
				curentWeek = calendar.get(Calendar.DAY_OF_WEEK);
				if(currentDate==i) 
					System.out.print("*"+i+"\t");
				else
					System.out.print(i+"\t");
				//如果是星期六格式化换行
				if(curentWeek == Calendar.SATURDAY) {
					System.out.print("\n");
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
