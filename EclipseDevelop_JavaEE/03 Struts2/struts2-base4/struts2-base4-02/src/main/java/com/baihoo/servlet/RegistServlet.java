package com.baihoo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author Administrator
 * Servelt 控制表单重复提交
 */
@WebServlet("/regist.servlet")
public class RegistServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String token = request.getParameter("token");
		
		String _token = (String) request.getSession().getAttribute("token");
		request.getSession().removeAttribute("token");

		if (token.equals(_token)) {

			System.out.println("将" + username + " 与" + password
					+ "存储到数据库中,完成注册");
		} else {
			response.getWriter().write("不允许表单重复提交");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
