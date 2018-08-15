package com.baiHoo.file.separator;

import java.io.File;

/**
 * 两个常量
 * 1、路径分隔符  ;
 * 2、名称分隔符 /(windows)  /(linux 等)
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
		System.out.println(File.pathSeparator); // 路径分隔符 ;
		System.out.println(File.separator); // 名称分隔符
		// 路径表示形式
	
		String path = "E:\\baiHoo\\Test\\2.jpg";
		path = "E:" + File.separator + "baiHoo" + File.separator + "Test" + File.separator + "2.jpg";
		// 推荐方式
		path = "E:/xp/test/2.jpg";
	}

}

