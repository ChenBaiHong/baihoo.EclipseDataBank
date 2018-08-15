package com.haihoo.ws.cxf.soap11Client;

import com.haihoo.ws.cxf.soap11.helloWS.HelloServerImpl;
import com.haihoo.ws.cxf.soap11.helloWS.HelloServerImplService;

/**
 * 
 * @author Administrator
 *
 */
public class TestHelloWSClient {
	public static void main(String[] args) {
		//创建服务访问点集合
		HelloServerImplService hss = new HelloServerImplService();
		//根据服务访问点获取绑定的类
		HelloServerImpl hs= hss.getHelloServerImplPort();
		//调用具体业务逻辑
		String result = hs.sayHello("BaiHOO");
		System.out.println(result);
	}
}
