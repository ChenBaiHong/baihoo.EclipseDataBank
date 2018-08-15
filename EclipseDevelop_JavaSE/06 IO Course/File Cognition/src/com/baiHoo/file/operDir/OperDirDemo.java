package com.baiHoo.file.operDir;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 5������Ŀ¼
mkdir() ����Ŀ¼������ȷ�� ��Ŀ¼���ڣ���������ڣ�����ʧ��
mkdirs() ����Ŀ¼�������Ŀ¼��������һͬ����
list() �ļ�|Ŀ¼ ���ַ�����ʽ
listFiles()
static listRoots() ��·��
 * @author Administrator
 *
 */
public class OperDirDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //mkdirs();
		filenameFilter() ;
	}
	/**
	 *  �������ģʽ, �ļ�������
	 */
	public static void filenameFilter() {
		String path = "D:/Desktop Pictures/";
		File src = new File(path); // �ļ���
		if (src.isDirectory()) { // ���ڲ���ΪĿ¼
			System.out.println("======��Ŀ¼|�ļ���===");
			String[] subNames = src.list();

			for (String temp : subNames) {
				System.out.println(temp);
			}
			System.out.println("=====��Ŀ¼|�ļ�File����====");
			File[] subFiles = src.listFiles();
			for (File temp : subFiles) {
				System.out.println(temp.getAbsolutePath());
			}
			System.out.println("=====���ļ�.java����====");
			// �������ģʽ
			subFiles = src.listFiles(new FilenameFilter() {

				@Override
				/**
				 * dir ����src
				 */
				public boolean accept(File dir, String name) {
					return new File(dir, name).isFile() && name.endsWith(".java");
				}

			});
			for (File temp : subFiles) {
				System.out.println(temp.getAbsolutePath());
			}
		}
	}
	/**
	 * 	����Ŀ¼�������Ŀ¼��������һͬ����
	 */
	public static void mkdirs() {
		String path = "D:/Desktop Pictures/parent/subTest";
		File src = new File(path);
		// src.mkdir();
		src.mkdirs();
	}

}
