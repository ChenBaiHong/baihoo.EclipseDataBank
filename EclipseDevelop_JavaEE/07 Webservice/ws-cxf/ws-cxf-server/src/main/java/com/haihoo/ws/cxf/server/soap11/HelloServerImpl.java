package com.haihoo.ws.cxf.server.soap11;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

/**
 * 当使用SOAP1.2时wsimport命令失效，需要使用cxf的wsdl2java
 * 		建议：发布服务的时候使用SOAP1.2，客户端调用的时候使用SOAP1.1
 * @author Administrator
 *
 */
@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP11HTTP_BINDING)
//@XmlAccessorType(XmlAccessType.FIELD)
public class HelloServerImpl {
	

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
