package com.baiHoo.test.file;

import java.io.File;

/**
 * 
 * @author baiHoo.Chen
 *	文件类
 */

public class TestFile {
	public static void main(String[] args) {
		File file = new File("E:\\EclipseDataBank\\EclipseDevelop_JavaEE\\file\\src\\com\\baiHoo\\test\\file\\TestFile.java");
		File directory = new File("E:\\EclipseDataBank");
		File file2 = new File("E:\\EclipseDataBank\\EclipseDevelop_JavaEE\\file\\src\\com\\baiHoo\\test\\file" , "TestFile.java");
		
		if(file.isFile()) {
			System.out.println("这是一个文件");
		}
		if(file2.isFile()) {
			System.out.println("这是一个文件2");
		}
		if(directory.isDirectory()) {
			System.out.println("这是一个目录");
		}
	}
}
