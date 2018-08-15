package com.baiHoo.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 
 * @author Administrator
 * properties �˽�
 */
public class PropertiesDemo {
	
	public static void main(String args[]) throws Exception {
		readProp() ;
	}
	
	public static void writerProp() throws Exception {
		//properties�������
				Properties prop = new Properties();
				//�洢����
				prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
				prop.setProperty("url", "jdbc:oracle:thin:@localHost:1521:orcl");
				prop.setProperty("username", "baiHoo");
				prop.setProperty("password", "1234");
				//�洢ָ���ļ��̷�������·��
				//prop.store(new FileOutputStream(new File("e:/db.properties")), "db����");
				//prop.storeToXML(new FileOutputStream(new File("e:/db.xml")), "db����");
				//�洢�ļ����·��
				prop.store(new FileOutputStream(new File("src/db.properties")), "db����");
				prop.storeToXML(new FileOutputStream(new File("src/db.xml")), "db����");
	}
	public static void readProp() throws Exception {
		//properties�������
				Properties prop = new Properties();
				//���ض�������ֵ
				prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("src/db.properties"));
				//prop.load(PropertiesDemo.class.getResourceAsStream("/PropertiesDemo/src/db.properties"));
				//�洢����
				System.out.println(prop.getProperty("driver"));
				System.out.println(prop.getProperty("url"));
				System.out.println(prop.getProperty("username"));
				System.out.println(prop.getProperty("password"));
				
	}
}
