package com.baiHoo.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author baiHoo.Chen 
 * 	ʱ���ʽ��
 */
public class TestDateFormat {
	public static void main(String[] args) {
		regExStringDateFormat();
		normalCourseFormatDate();
	}

	/**
	 * �����ʽ��ʱ���ַ���ת���ɳ�����ӻ�ʱ���ַ���
	 */
	private static void regExStringDateFormat() {
		// ������ʱ�����ʽ
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd mm:hh:ss , �������ڱ���ĵ� w �ܣ��������µĵ� W ��");
		// ʱ�����ִ��볤���������֣�����ĩβ L��β��ʾ�⴫����ǳ�����������
		Date date = new Date(56546464465L);
		// ��ʱ������ո�ʽ���ַ�����ת�����ַ���
		String sDate = df.format(date);
		System.out.println(sDate);
	}
	/**
	 * ������ӻ�ʱ���ַ�����ʽ����ʱ�����
	 * 		ע�⣺����ʱ���ʽ�ַ��������볣����ӻ�ʱ���ַ�������ʽ����һ��
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
