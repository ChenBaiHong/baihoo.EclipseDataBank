package com.baiHoo.io.rafSplit;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.baiHoo.io.utils.FileUtil;

/**
 * �ļ��ķָ�˼·
 * 1���ָ�Ŀ��� size   n��
 * 2��ÿһ��Ĵ�С blockSize
 *   ���:�ܵ��ļ���С -(n-1)*blockSize
 * 
 * @author Administrator
 *
 */
public class RandomAccessFileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//  r ��ʾ�xȡ�ļ���w ��ʾ�����ļ�
		RandomAccessFile rnd =new RandomAccessFile(new File("F:/Eclipse DataBank/EclipseDevelop_JavaSE/IO Stream/src/com/baiHoo/utils/CopyFileTest.java"),"r");
		//����40���ֹ����λ���_ʼ�xȡ�ļ�
		rnd.seek(40);//
		//���建���С
		byte[] flush =new byte[1024];
		//���ճ���
		int len =0; 		
		
		while(-1!=(len=rnd.read(flush))){
			//System.out.println(new String(flush,0,len));
			if(len>=20){
				System.out.println(new String(flush,0,20));
				break;
			}else{
				System.out.println(new String(flush,0,len));
			}
		}
		FileUtil.close(rnd);
	}

}