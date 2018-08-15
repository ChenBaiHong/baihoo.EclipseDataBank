package com.baihoo.spring4.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;

import com.baihoo.spring4.service.UserService;
import com.baihoo.spring4.service.impl.UserServiceImpl;

/**
 * servlet 注解映射
 * @author Administrator
 *
 */
@WebServlet("/UserServlet.servlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
			ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.path");
		*/
		
		/**
		 * 在web.xml
		 *   <context-param>
		 *   	<param-name>contextConfigLocation</param-name>
		 *   	<param-value>classpath:applicationContext.xml</param-value> 
		 *   </context-param>
		 */
		//WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		WebApplicationContext webApplicationContext = (WebApplicationContext)getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		UserService userService = webApplicationContext.getBean("userService",UserServiceImpl.class);
		System.out.println(userService.findByAge("123"));
		System.out.println(userService.findByName("baihoo"));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
