package com.baiHoo.url.netUrl;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * 
 * @author Administrator
 * URL ͳһ��Դ��λ��
 */
public class URLDemo {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		//����·������
		URL url = new URL("http://www.baidu.com:80/index.html?uname=bjsxt");
		System.out.println("Э��:"+url.getProtocol());
		System.out.println("����:"+url.getHost());
		System.out.println("�˿�:"+url.getPort());
		System.out.println("��Դ:"+url.getFile());
		System.out.println("���·��:"+url.getPath());
		System.out.println("ê��:"+url.getRef()); //ê��
		System.out.println("����:"+url.getQuery());//?���� :����ê��  ����null ,�����ڣ�������ȷ
		
		
		
		
		
		url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url,"b.txt"); //���·��
		System.out.println(url.toString());
		
	}

}
