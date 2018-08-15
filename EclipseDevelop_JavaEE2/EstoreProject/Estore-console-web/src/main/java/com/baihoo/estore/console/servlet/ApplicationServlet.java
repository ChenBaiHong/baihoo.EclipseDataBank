package com.baihoo.estore.console.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationContext;

/**
 * 
 * @ClassName: ApplicationServlet
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月29日 下午1:34:29
 */
@SuppressWarnings("serial")
public class ApplicationServlet extends HttpServlet {
	public ApplicationServlet() {
		super();
	}
	/**
	 * 工程初始化
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}
	/**
	 * 工程摧毀
	 */
	public void destroy() {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
}
