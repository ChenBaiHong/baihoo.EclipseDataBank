package com.baiHo.servlet2;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author Administrator 如果想重写init方法，重写无参数的init方法。
 */
@SuppressWarnings("serial")
public class ServletDome02 extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

	}

	public void init(ServletConfig config) throws ServletException {

		System.out.println("init 初始化。。。。。。");
	}

	public void init() throws ServletException {

		super.init();
	}

}
