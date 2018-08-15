package com.haihoo.cxf.client.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haihoo.cxf.client.soap.userServiceWS.User;
import com.haihoo.cxf.client.soap.userServiceWS.UserService;
import com.haihoo.cxf.client.soap.userServiceWS.UserServiceService;
/**
 * 			使用Ajax调用的话，流程也很简单，从前台发送Ajax请求，然后调用ws服务，再将结果返回给前台。 
 * 		但是Ajax不支持跨域调用，也就是说我们发布的ws服务，如http://192.168.1.105:6666/ws是不
 * 		行的， Ajax要想正常调用必须通过wsimport命令转化的java bean，换句话说，我们需要在中间
 * 		加上一个servlet（或者struts，springmvc），在servlet中调用ws服务，把数据返回到前台。
 * @author Administrator
 *
 */
//@WebServlet("UserService.servlet")
public class UserServiceWSClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserServiceWSClientServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String method = request.getParameter("method");
        if(method!=null && method!="") {
        	if(method.equalsIgnoreCase("setUser")) {
        		setUser(request , response);
        	}else {
        		findAll(request , response);
        	}
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
	
	/**
	 * 設置添加用戶
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void setUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	        String id = request.getParameter("id");
	        String name = request.getParameter("name");
	        String address = request.getParameter("address");
	        String email = request.getParameter("email");
	    	//创建服务访问点集合
	  		UserServiceService uss = new UserServiceService();
	  		//根据服务访问点获取绑定的类
	  		UserService us = uss.getUserServicePort();
	  		//调用具体业务逻辑
	  		User user= new User();
	  		user.setId(id);
	  		user.setName(name);
	  		user.setAddress(address);
	  		user.setEmail(email);
	  		us.setUser(user);
  			// 返回结果
  	        response.getWriter().write("yes");
	}
	/**
	 * 查詢所有用戶
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//创建服务访问点集合
  		UserServiceService uss = new UserServiceService();
  		//根据服务访问点获取绑定的类
  		UserService us = uss.getUserServicePort();
  		//调用具体业务逻辑
  		List<User> list = us.findByAll();
		ObjectMapper om = new ObjectMapper();
		String listToStr = om.writeValueAsString(list);
		response.getWriter().write(listToStr);
		list.forEach(e -> System.out.println(e));
	}
}
