package com.baiHoo.test.file;

import java.io.File;
/**
 * 
 * @author baiHoo.Chen
 *	树状打印文件层次
 *		文件名
 *		-文件一
 *		--文件二
 *		---文件三
 *		......
 */
public class FileTree {
	public static void main(String [] args) {
		File file =new File("E:\\\\EclipseDataBank\\\\EclipseDevelop_JavaEE");
		printFile(file , 0);
	}
	private static void printFile(File file, int level) {
		for(int i = 0; i < level ; i++) {
				System.out.print("-");
		}
		//打印出文件的名字
		System.out.println(file.getName());
		//判断该文件是否目录，递归深入获取目录内文件
		if(file.isDirectory()) {
				File[] files = file.listFiles();
				for (File f : files) {
					printFile(f, level+1);
				}
		}
	}
}
