package com.baihoo.ws.test.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.baihoo.ws.ws.trans.ArrayOfString;
import com.baihoo.ws.ws.trans.EnglishChinese;
import com.baihoo.ws.ws.trans.EnglishChineseSoap;

/**
 * 中文翻译英文
 * @author Administrator
 *
 */
public class TestTranslationClient {
	public static void main(String[] args) throws IOException {
		//创建服务访问点集合
		EnglishChinese ec = new EnglishChinese();
		
		//获得服务类
		EnglishChineseSoap ecServiceClass = ec.getEnglishChineseSoap();
		
		//调用服务方法
		ArrayOfString aos = ecServiceClass.translatorString("hello");
		//输出
		List<String> strList = aos.getString();
		strList.forEach(e -> System.out.println(e));
		
		//调用服务方法
		byte[] mp3 = ecServiceClass.getMp3("1059.mp3");
		//输出
		OutputStream out = new FileOutputStream(new File("G:\\webserviceCode\\hello.mp3"));
		out.write(mp3);
		out.flush();
		out.close();
	}
}	
