package com.baihoo.ws.client;

import com.baihoo.ws.helloWS.HelloService;
import com.baihoo.ws.helloWS.HelloServiceService;

public class TestHelloWSClient {
	public static void main(String [] args) {
		//创建服务访问点集合
		HelloServiceService hss = new HelloServiceService();
		//更具服务访问点获取绑定的类
		HelloService serviceClass = hss.getHelloServicePort();
		//调用具体业务逻辑
		String result = serviceClass.sayHello("baiHOO");
		System.out.println(result);
	}
}	
