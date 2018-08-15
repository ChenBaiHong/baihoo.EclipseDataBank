package com.baihoo.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Ajax1Action extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String execute() throws Exception {

		HttpServletResponse response = ServletActionContext.getResponse();
		response.getWriter().write("hello " + msg);
		response.getWriter().close();
		return null;
	}
}
