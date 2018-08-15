package com.baiHoo.file.path;

import java.io.File;

/**
 * 相对路径与绝对路径构造 File对象
 * 1、相对路径
    File(String parent, String child)  ==>File("D:/Desktop Pictures","logo2.png")
    File(File parent, String child)     ==> File(new File("D:/Desktop Pictures"),"logo2.png")
    2、绝对路径
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
		// 相对路径
		File src = new File(parentPath, name);
		src = new File(new File(parentPath), name);
		// 输出
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println("--------------------------------------");
		// 绝对路径
		src = new File("D:/Desktop Pictures/logo2.png");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println("--------------------------------------");
		// 没有盘符: 以 user.dir构建
		src = new File("../logo2.png");
		//src = new File(".");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
		System.out.println("--------------------------------------");
	}

}