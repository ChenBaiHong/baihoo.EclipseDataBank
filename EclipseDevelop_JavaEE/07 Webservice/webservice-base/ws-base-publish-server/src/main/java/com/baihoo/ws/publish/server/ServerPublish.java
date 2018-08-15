package com.baihoo.ws.publish.server;

import javax.xml.ws.Endpoint;

/**
 * 服务发布
 * @author Administrator
 *
 */
public class ServerPublish {
	public static void main(String[] args) {
		//jdk发布webservice服务， 第一参数服务地址，第二个参数具体服务类
		Endpoint.publish("http://127.0.0.1:8080/hello", new HelloService());
	}
}
