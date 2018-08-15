package com.baihoo.action;

import java.util.ArrayList;
import java.util.List;

import com.baihoo.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OgnlDemo3Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		// 向valueStack中存储数据(root)

		ValueStack vs = ActionContext.getContext().getValueStack();

		List<User> users = new ArrayList<User>();

		users.add(new User("tom", "123", 20, "男"));
		users.add(new User("james", "456", 21, "男"));
		users.add(new User("fox", "789", 26, "男"));

		// vs.push(users);

		vs.set("users", users);

		return SUCCESS;
	}
}
