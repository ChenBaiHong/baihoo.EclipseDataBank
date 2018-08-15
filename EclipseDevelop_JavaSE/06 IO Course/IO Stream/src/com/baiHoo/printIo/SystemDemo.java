package com.baiHoo.printIo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * �������� 1��System.in ������ �������� 2��System.out ����� ����̨��� System.err
 * 
 * ==>�ض��� setIn() setOut() setErr() FileDescriptor.in FileDescriptor.out
 * 
 * @author Administrator
 *
 */
public class SystemDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// println();
		// SystemIn();
		// �ض���
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("D:/Desktop Pictures/print.txt")), true));
		System.out.println("a"); // ����̨ -->�ļ�
		System.out.println("test");
		// �ؿ���̨
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)), true));
		System.out.println("back....");
	}

	public static void SystemIn() throws FileNotFoundException {
		InputStream is = System.in; // ��������
		is = new BufferedInputStream(new FileInputStream("D:/Desktop Pictures/print.txt"));
		Scanner sc = new Scanner(is);
		// System.out.println("������:");
		System.out.println(sc.nextLine());
	}

	public static void println() {
		System.out.println("test");
		System.err.println("err");
	}

}
