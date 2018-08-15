package com.baiHoo.file.operProgeny;

import java.io.File;
import java.util.Arrays;

/**
 * ��� ����( Progeny )��Ŀ¼|�ļ�������(����·��)
 * 1��listFiles()
 * 2���ݹ�
 * 
 * static listRoots() ��·��
 * @author Administrator
 *
 */
public class OperProgeny {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path ="D:/Desktop Pictures";
		File parent =new File(path);
			printName(parent);
		
		File[] roots =File.listRoots();
		System.out.println(Arrays.toString(roots));
		for(File temp:roots){
			//printName(temp);
			System.out.println(temp.getAbsolutePath());
		}
	}
	/**
	 * �ݹ��������( Progeny )��Ŀ¼|�ļ�������(����·��)
	 */
	public static void printName(File src){
		if(null==src || !src.exists()){
			return ;
		}
		System.out.println(src.getAbsolutePath());
		if(src.isDirectory()){ //�ļ���
			for(File sub:src.listFiles()){
				printName(sub);
			}
			
		}
	}

}
