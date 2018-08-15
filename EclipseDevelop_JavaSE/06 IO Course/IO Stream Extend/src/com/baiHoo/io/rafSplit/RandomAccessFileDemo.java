package com.baiHoo.io.rafSplit;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.baiHoo.io.utils.FileUtil;

/**
 * 文件的分割思路
 * 1、分割的块数 size   n块
 * 2、每一块的大小 blockSize
 *   最后:总的文件大小 -(n-1)*blockSize
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
		//  r 表示讀取文件，w 表示寫出文件
		RandomAccessFile rnd =new RandomAccessFile(new File("F:/Eclipse DataBank/EclipseDevelop_JavaSE/IO Stream/src/com/baiHoo/utils/CopyFileTest.java"),"r");
		//從往40個字節后的位置開始讀取文件
		rnd.seek(40);//
		//定义缓冲大小
		byte[] flush =new byte[1024];
		//接收长度
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