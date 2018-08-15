package com.baiHo.servlet2;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 
 * @author Administrator
 *	诠释Servlert  的生命周期
 */
public class ServletDome01 implements Servlet {

	/**
	 * Servlet实例被创建后，调用init方法进行初始化
	 * 		Servlet是什么时候被创建呢？
	 * 				不是服务器一启动时，实例被创建。而是第一次访问的时候，实例才被创建
	 * 		init方法调用几次？
	 * 				只被调用一次
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 初始化。。。。。。");
	}

	
	/**
	 *  service 调用几次呢？
	 *  	有一次请求，就调用一次service方法
	 */
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service 运行。。。。。。");

	}


	/**
	 * Servlet 实例是什么时候被销魂呢？
	 * 		服务器关闭，或手动移除
	 * destroy 调用几次呢？
	 * 		一次
	 */	
	public void destroy() {
		System.out.println("destroy 销毁。。。。。。");

	}
	public ServletConfig getServletConfig() {
		
		return null;
	}
	public String getServletInfo() {
		
		return null;
	}

}
