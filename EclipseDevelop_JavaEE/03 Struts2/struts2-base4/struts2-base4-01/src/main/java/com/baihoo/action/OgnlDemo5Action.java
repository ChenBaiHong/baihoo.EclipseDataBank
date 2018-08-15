package com.baihoo.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OgnlDemo5Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		ValueStack vs = ActionContext.getContext().getValueStack();

		vs.set("username", "张三"); // 向valueStack压入数据

		return SUCCESS;
	}
}
