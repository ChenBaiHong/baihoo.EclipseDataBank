package com.baiHo.servlet;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet 的实现类 HelloServlet
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class HelloServlet extends GenericServlet implements Serializable {
	public HelloServlet() {
		super();
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		response.getWriter().write("hello Servlet !");
	}

}
