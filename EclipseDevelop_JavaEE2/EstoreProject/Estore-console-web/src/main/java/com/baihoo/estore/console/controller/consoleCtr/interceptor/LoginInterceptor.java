package com.baihoo.estore.console.controller.consoleCtr.interceptor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户登陆拦截
 * @author Administrator
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		if(uri.indexOf("ajaxLoginValid.do")>0) {
			return true;
		}
		//判断用户身份在session中是否存在
		HttpSession session = request.getSession();
		String usercode = (String) session.getAttribute("usercode");
		//若用户身份在session中则放行
		if(usercode !=null) {
			return true;
		}
		//如果执行到这里拦截，跳转到登陆界面，用户进行身份认证
		request.getRequestDispatcher("/WEB-INF/EstBsEmp/empLogin.jsp").forward(request, response);
		//如果返回false表示拦截不继续执行handler,如果返回true则执行
		return false;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		

	}
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		

	}

}
