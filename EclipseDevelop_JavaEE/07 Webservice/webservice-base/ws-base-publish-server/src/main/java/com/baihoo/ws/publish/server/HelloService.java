package com.baihoo.ws.publish.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 1. 需要方法權限是public
 * 2. 不能是final類型
 * 3. 方法不能是靜態的
 * 4. 服务类至少有一个方法
 * @author Administrator
 *
 */
@WebService(
		serviceName="MyHelloServerService",
		portName="MyHelloServer",
		name="MyHelloServer",
		targetNamespace="com.baihoo.ws.helloWS"
		)
public class HelloService {
	
	public String sayHello(String name) {
		
		return name+"!webservice 服务端";
	}
	/**
	 * 屏蔽该方法不被调用
	 * @param name
	 * @return
	 */
	@WebMethod(exclude=true)//屏蔽方法
	public String sayHi(String name) {
		
		return name+"!webservice 服务端";
	}
}
