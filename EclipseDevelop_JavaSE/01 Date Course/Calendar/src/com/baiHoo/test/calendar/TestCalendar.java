package com.baiHoo.test.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author baiHoo.Chen
 *	������
 *	ע�⣺
 *	���·ݣ�һ����0��������1���Դ����ƣ�ʮ���¾���11
 *	�����ڣ�������1����һ��2���Դ����ƣ���������7
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();
		//2016��2��10��12��23��34��
		//ca.set(2016, 1 , 10 , 12 , 23 , 34);
		
		//Calendar �ṩ�ĳ���
		//ca.set(2016, Calendar.FEBRUARY , 10 , 12 , 23 , 34);
		
		//��������������ʱ���룬����ֵ��Ĭ�ϵ�ǰ���ڶ�Ӧ��
		ca.set(Calendar.YEAR, 2016);
		ca.set(Calendar.MONTH, 1);
		ca.set(Calendar.DATE, 22);
		Date date  = ca.getTime();
		System.out.println(date);
		
		//��ȡ��ݣ��Դ����ƻ�ȡ�·�����ʱ����
		System.out.println(ca.get(Calendar.YEAR));
		
		//ʱ��ļ��� , �Դ����ƻ�ȡ�·�����ʱ����
		ca.add(Calendar.YEAR, -30);
		System.out.println(ca.get(Calendar.YEAR));
		
	}
}
