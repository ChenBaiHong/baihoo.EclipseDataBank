package com.baiHoo.bufferedIo.systemIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ��װ����
 * @author Administrator
 *
 */
public class BufferedSystemIn {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStream is =System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println("�����롣������");
		String msg =br.readLine();
		System.out.println(msg);
	}

}