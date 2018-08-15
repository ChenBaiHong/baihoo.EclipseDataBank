package com.baihoo.intercept;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyInterceptor extends MethodFilterInterceptor {

	public void destroy() {

	}

	public void init() {
		System.out.println("my interceptor init");
	}

	public String doIntercept(ActionInvocation ai) throws Exception {

		System.out.println("my interceptor 拦截。。。。。");

		//return ai.invoke(); // 放行
	
		return Action.LOGIN;  //"login"
	}

}
