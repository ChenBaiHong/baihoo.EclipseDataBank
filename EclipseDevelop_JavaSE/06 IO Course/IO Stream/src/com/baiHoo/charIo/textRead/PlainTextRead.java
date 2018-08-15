package com.baiHoo.charIo.textRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ���ı���ȡ
 * @author Administrator
 *
 */
public class PlainTextRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����Դ
		File src = new File("D:/Desktop Pictures/logo2.txt");
		// ѡ����
		Reader reader = null;
		try {
			reader = new FileReader(src);
			// ��ȡ����
			char[] flush = new char[1024];
			int len = 0;
			while (-1 != (len = reader.read(flush))) {
				// �ַ�����ת�� �ַ���
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Դ�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		} finally {
			try {
				if (null != reader) {
					reader.close();
				}
			} catch (Exception e2) {
			}
		}
	}

}