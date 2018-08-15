package com.haihoo.ws.cxf.server.soap12;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

/**
 * 1.创建服务接口
 * 	“@WebService”注意注解加在接口上
 * @author Administrator
 *
 */
@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface HiServer {
	String sysHi(String name);
}
