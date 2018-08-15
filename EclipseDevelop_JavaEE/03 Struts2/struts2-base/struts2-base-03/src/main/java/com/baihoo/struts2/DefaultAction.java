package com.baihoo.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 *Struts2 支持继承类 ActionSupport 
 * 
 * 
 * @author Administrator
 *
 */
public class DefaultAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {

		System.out.println("default action");
		// return "success";
		return NONE;
	}
}
