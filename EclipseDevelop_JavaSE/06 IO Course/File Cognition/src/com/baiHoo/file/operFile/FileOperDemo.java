package com.baiHoo.file.operFile;

import java.io.File;
import java.io.IOException;

/**
 * ���÷���:
1���ļ���
getName() �ļ�����·����
getPath()·����
getAbsoluteFile() ����·������Ӧ��File����
getAbsolutePath() ����·����
getParent() ��Ŀ¼ ,���·���ĸ�Ŀ¼������Ϊnull ��. ɾ�������Ľ��
2���ж���Ϣ
exists()
canWrite()
canRead()
isFile()
isDirectory()
isAbsolute()������ƽ̨���죬ie���̷���ͷ��������/��ͷ
3������ �ֽ���  ���ܶ�ȡ�ļ��еĳ���
length()
4��������ɾ��
createNewFile() �����ڴ������ļ�,���ڷ���false
delete() ɾ���ļ�
static createTempFile(ǰ׺3���ֽڳ�����׺Ĭ��.temp) Ĭ����ʱ�ռ�
staticcreateTempFile(ǰ׺3���ֽڳ�����׺Ĭ��.temp,Ŀ¼)
deleteOnExit() �˳������ɾ��,������ɾ����ʱ�ļ�


 * @author Administrator
 *
 */
public class FileOperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fileJudge();
		try {
			fileMakdele();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ����ɾ���ļ�
	public static void fileMakdele() throws IOException, InterruptedException {
		// createNewFile() �����ڴ������ļ�
		//conϵͳ�ؼ���
		// String path="D:/Desktop Pictures/con"; 
		String path = "D:/Desktop Pictures/logo2.png";
		File src = new File(path);
		if (!src.exists()) {
			boolean flag = src.createNewFile();
			System.out.println(flag ? "�ɹ�" : "ʧ��");
		}

		// ɾ���ļ�
		boolean flag = src.delete();
		System.out.println(flag ? "�ɹ�" : "ʧ��");
		// static createTempFile(ǰ׺3���ֽڳ�����׺Ĭ��.temp) Ĭ����ʱ�ռ�
		// static createTempFile(ǰ׺3���ֽڳ�����׺Ĭ��.temp,Ŀ¼)
		File temp = File.createTempFile("Tes", ".temp", new File("D:/Desktop Pictures"));
		Thread.sleep(10000);
		temp.deleteOnExit(); // �˳���ɾ��

	}

	// 2���ж���Ϣ
	// 3������ length()
	public static void fileJudge() {
		//���·��
		// String path ="../logo2.png";
		//����·��
		String path = "D:/Desktop Pictures/logo2.png";
		File src = new File(path);
		// �Ƿ����
		System.out.println("�ļ��Ƿ����:" + src.exists());
		// �Ƿ�ɶ� д canWrite() canRead()
		System.out.println("�ļ��Ƿ��д" + src.canWrite());
		System.out.println("============");
		// isFile()
		// isDirectory()
		if (src.isFile()) {
			System.out.println("�ļ�");
		} else if (src.isDirectory()) {
			System.out.println("�ļ���");
		} else {
			System.out.println("�ļ�������");
		}

		System.out.println("�Ƿ�Ϊ����·��" + src.isAbsolute());
		System.out.println("����Ϊ:" + src.length());

	}

	// 1������
	public static void  fileNamePath() {
		// File src =new File("D:/Desktop Pictures/logo2.png");
		// ������ϵ
		File src = new File("../logo2.png");
		System.out.println(src.getName()); // ��������
		System.out.println(src.getPath()); // ����Ǿ���·������������·�����������·��
		System.out.println(src.getAbsolutePath());// ���ؾ���·��
		System.out.println(src.getParent());// ������һ��Ŀ¼���������ԣ�����null
	}

}
