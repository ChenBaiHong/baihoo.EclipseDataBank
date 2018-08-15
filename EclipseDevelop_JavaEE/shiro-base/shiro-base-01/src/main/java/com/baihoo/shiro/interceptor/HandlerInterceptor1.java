package com.baihoo.shiro.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 攔截器測試
 * @author Administrator
 *
 */
public class HandlerInterceptor1 implements HandlerInterceptor{

	/**
	 * 在執行handler之前來執行的， 可用於用戶認證校驗，用戶權限校驗
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("HandlerInterceptor1。。。。。。。。。。。。。。preHandle");
		return true;
	}

	/**
	 * 在執行handler返回ModelAndView之前來執行
	 * 如果需要向頁面提供一些公用的數據或配置一些視圖信息，使用此方法實現，從ModleAndView入手
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptor1。。。。。。。。。。。。。。postHandle");
		
	}

	/**
	 * 执行handler之后执行此方法
	 * 作系统 统一异常处理或者进行方法执行性能监控，在preHandle中设置一个时间点，在afterCompletion设置一个时间，两个时间点的差就是执行时长
	 *实现 系统 统一日志记录
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptor1。。。。。。。。。。。。。。afterCompletion");
		
	}

}
