package com.baiHoo.file.separator;

import java.io.File;

/**
 * ��������
 * 1��·���ָ���  ;
 * 2�����Ʒָ��� /(windows)  /(linux ��)
 * 
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
public class SeparatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(File.pathSeparator); // ·���ָ��� ;
		System.out.println(File.separator); // ���Ʒָ���
		// ·����ʾ��ʽ
	
		String path = "E:\\baiHoo\\Test\\2.jpg";
		path = "E:" + File.separator + "baiHoo" + File.separator + "Test" + File.separator + "2.jpg";
		// �Ƽ���ʽ
		path = "E:/xp/test/2.jpg";
	}

}

