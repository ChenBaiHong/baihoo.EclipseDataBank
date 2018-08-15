package com.haihoo.ws.cxf.pub.soap11;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.haihoo.ws.cxf.server.soap11.HelloServerImpl;


/**
 * 
 * @author Administrator
 *
 */
public class MyCXFPublicServer {
	@SuppressWarnings("deprecation")
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
		//设置服务类
		sfb.setServiceClass(HelloServerImpl.class);
		//设置服务对象的实例
		sfb.setServiceBean(new HelloServerImpl());
		//发布服务
		sfb.create();
	}
}
