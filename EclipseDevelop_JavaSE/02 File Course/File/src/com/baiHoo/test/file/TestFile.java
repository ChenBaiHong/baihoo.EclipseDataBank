package com.baiHoo.test.file;

import java.io.File;

/**
 * 
 * @author baiHoo.Chen
 *	�ļ���
 */

public class TestFile {
	public static void main(String[] args) {
		File file = new File("E:\\EclipseDataBank\\EclipseDevelop_JavaEE\\file\\src\\com\\baiHoo\\test\\file\\TestFile.java");
		File directory = new File("E:\\EclipseDataBank");
		File file2 = new File("E:\\EclipseDataBank\\EclipseDevelop_JavaEE\\file\\src\\com\\baiHoo\\test\\file" , "TestFile.java");
		
		if(file.isFile()) {
			System.out.println("����һ���ļ�");
		}
		if(file2.isFile()) {
			System.out.println("����һ���ļ�2");
		}
		if(directory.isDirectory()) {
			System.out.println("����һ��Ŀ¼");
		}
	}
}
