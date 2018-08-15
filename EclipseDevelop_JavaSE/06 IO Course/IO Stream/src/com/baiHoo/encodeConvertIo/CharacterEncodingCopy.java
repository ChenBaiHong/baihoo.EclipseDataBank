package com.baiHoo.encodeConvertIo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ת����: �ֽ�תΪ�ַ�
 * 1������� OutputStreamWriter ����
 * 2�������� InputStreamReader  ����
 * 
 * ȷ��Դ����Ϊ����
 * @author Administrator
 *
 */
public class CharacterEncodingCopy {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// ָ�������ַ���
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new BufferedInputStream(new FileInputStream(new File("D:/Desktop Pictures/logo2.txt"))), "UTF-8"));
		// д���ļ� ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				new BufferedOutputStream(new FileOutputStream(new File("D:/Desktop Pictures/encode.java")))));

		String info = null;
		while (null != (info = br.readLine())) {
			// System.out.println(info);
			bw.write(info);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
