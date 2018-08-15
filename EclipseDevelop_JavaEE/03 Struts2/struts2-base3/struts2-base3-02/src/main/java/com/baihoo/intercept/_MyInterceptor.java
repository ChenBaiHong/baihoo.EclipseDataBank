package com.baihoo.intercept;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class _MyInterceptor implements Interceptor {

	public void destroy() {

	}

	public void init() {
		System.out.println("my interceptor init");
	}

	public String intercept(ActionInvocation ai) throws Exception {

		System.out.println("my interceptor 拦截。。。。。");

		//return ai.invoke(); // 放行
	
		return Action.LOGIN;  //"login"
	}

}
