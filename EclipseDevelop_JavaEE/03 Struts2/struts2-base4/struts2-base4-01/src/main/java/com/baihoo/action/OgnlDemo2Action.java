package com.baihoo.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OgnlDemo2Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		// 向valueStack中存储数据(root)

		ValueStack vs = ActionContext.getContext().getValueStack();

		vs.set("username", "tom");

		vs.push("hello itcast");

		return SUCCESS;
	}
}
