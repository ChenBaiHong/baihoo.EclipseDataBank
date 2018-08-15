package com.baihoo.intercept;

import org.apache.struts2.ServletActionContext;

import com.baihoo.action.BookAction;
import com.baihoo.domain.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class BookInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {

		// 1.得到session中的user
		User user = (User) ServletActionContext.getRequest().getSession()
				.getAttribute("user");

		if (user == null) {
			BookAction action = (BookAction) invocation.getAction(); // 得到当前拦截的action对象。

			action.addActionError("权限不足，请先登录");// 存储错误信息

			return Action.LOGIN;
		}

		return invocation.invoke();
	}

}
