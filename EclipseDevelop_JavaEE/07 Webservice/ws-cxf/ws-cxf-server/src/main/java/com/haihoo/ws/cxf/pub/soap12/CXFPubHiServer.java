package com.haihoo.ws.cxf.pub.soap12;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.haihoo.ws.cxf.server.soap12.HiServer;
import com.haihoo.ws.cxf.server.soap12.impl.HiServerImpl;
/**
 * 1.创建服务接口
 * 		“@WebService”注意注解加在接口上
 */
public class CXFPubHiServer {
	public static void main(String[] args) {
		//创建服务工厂对象
		 //ServerFactoryBean(不需要使用@webservice)   生成的文档不规范，不建议使用
		//ServerFactoryBean sfb = new ServerFactoryBean();
		JaxWsServerFactoryBean sfb = new JaxWsServerFactoryBean();
		
		//设置输入输出请求与响应的消息体日志拦截器
		sfb.getInInterceptors().add(new LoggingInInterceptor());
		sfb.getOutInterceptors().add(new LoggingOutInterceptor());
		//ReflectionServiceFactoryBean sfb = new ReflectionServiceFactoryBean();
		//设置服务地址
		sfb.setAddress("http://127.0.0.1:8897/hello");
		//sfb.setWsdlURL("http://127.0.0.1:8897/hello");
		//设置接口服务类
		sfb.setServiceClass(HiServer.class);
		//设置接口实现服务类
		sfb.setServiceBean(new HiServerImpl());
		//发布服务
		sfb.create();
	}
}
