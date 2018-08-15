package com.baiHoo.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 
 * @author Administrator
 * properties 了解
 */
public class PropertiesDemo {
	
	public static void main(String args[]) throws Exception {
		readProp() ;
	}
	
	public static void writerProp() throws Exception {
		//properties储存对象
				Properties prop = new Properties();
				//存储数据
				prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
				prop.setProperty("url", "jdbc:oracle:thin:@localHost:1521:orcl");
				prop.setProperty("username", "baiHoo");
				prop.setProperty("password", "1234");
				//存储指定文件盘符，绝对路径
				//prop.store(new FileOutputStream(new File("e:/db.properties")), "db配置");
				//prop.storeToXML(new FileOutputStream(new File("e:/db.xml")), "db配置");
				//存储文件相对路径
				prop.store(new FileOutputStream(new File("src/db.properties")), "db配置");
				prop.storeToXML(new FileOutputStream(new File("src/db.xml")), "db配置");
	}
	public static void readProp() throws Exception {
		//properties储存对象
				Properties prop = new Properties();
				//加载对象属性值
				prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("src/db.properties"));
				//prop.load(PropertiesDemo.class.getResourceAsStream("/PropertiesDemo/src/db.properties"));
				//存储数据
				System.out.println(prop.getProperty("driver"));
				System.out.println(prop.getProperty("url"));
				System.out.println(prop.getProperty("username"));
				System.out.println(prop.getProperty("password"));
				
	}
}
