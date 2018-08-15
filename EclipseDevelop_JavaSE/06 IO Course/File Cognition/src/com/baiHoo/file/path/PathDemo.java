package com.baiHoo.file.path;

import java.io.File;

/**
 * ���·�������·������ File����
 * 1�����·��
    File(String parent, String child)  ==>File("D:/Desktop Pictures","logo2.png")
    File(File parent, String child)     ==> File(new File("D:/Desktop Pictures"),"logo2.png")
    2������·��
    File(String name);
 * @author Administrator
 *
 */
public class PathDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String parentPath = "D:/Desktop Pictures";
		String name = "logo2.png";
		// ���·��
		File src = new File(parentPath, name);
		src = new File(new File(parentPath), name);
		// ���
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println("--------------------------------------");
		// ����·��
		src = new File("D:/Desktop Pictures/logo2.png");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println("--------------------------------------");
		// û���̷�: �� user.dir����
		src = new File("../logo2.png");
		//src = new File(".");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
		System.out.println("--------------------------------------");
	}

}