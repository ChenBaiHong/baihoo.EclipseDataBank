package com.baiHoo.test.file;

import java.io.File;
/**
 * 
 * @author baiHoo.Chen
 *	��״��ӡ�ļ����
 *		�ļ���
 *		-�ļ�һ
 *		--�ļ���
 *		---�ļ���
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
		//��ӡ���ļ�������
		System.out.println(file.getName());
		//�жϸ��ļ��Ƿ�Ŀ¼���ݹ������ȡĿ¼���ļ�
		if(file.isDirectory()) {
				File[] files = file.listFiles();
				for (File f : files) {
					printFile(f, level+1);
				}
		}
	}
}
