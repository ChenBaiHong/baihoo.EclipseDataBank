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
 *	���ӻ�����������
 */
@SuppressWarnings("all")
public class VisualCalendar {
	public static void main(String[] args) {
		System.out.println("������ 1970-1-1 ����ʱ���ʽ��");
		//System.out.print("\t");
		//����ʽ����ʱ��
		Scanner scanner = new Scanner(System.in);
		String timeChar = scanner.nextLine(); 
										//"2018-4-3";
		//��ʽ�������ʱ��
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		try {
			//�����ַ���ʱ��ת��Ϊʱ�����ʵ��
			Date date = df.parse(timeChar);
			//��������ʵ������
			Calendar calendar = new GregorianCalendar();
			//����ʵ����������ʱ��
			calendar.setTime(date);
			//�������ʵ������ʱ�����������
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
			//�������ʵ������ʱ��ĵ�ǰ����
			int currentDate = calendar.get(Calendar.DATE);
			int curentWeek = calendar.get(Calendar.DAY_OF_WEEK);
			
			//��ʼ����Ϊ��ǰ�·ݵĵ�һ��
			calendar.set(Calendar.DATE, 1);
			//��ȡ��ǰ�·ݵ�һ�������ڼ�
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
				//�������������ʽ������
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
