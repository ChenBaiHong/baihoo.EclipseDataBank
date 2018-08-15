package com.baihoo.struts2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 获取servlet api  通过ServletActionContext获取
 * @author Administrator
 *
 */
public class ServletDemo3Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();

		System.out.println(request.getParameter("username"));
		return SUCCESS;
	}

}
