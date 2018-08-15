package com.baihoo.struts2;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 *Struts2 支持继承类 ActionSupport 
 *
 * @author Administrator
 *
 */
public class BookAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String add() {

		System.out.println("book  add");
		return NONE;
	}

	public String update() {

		System.out.println("book  update");
		return NONE;
	}

	public String delete() {

		System.out.println("book  delete");
		return NONE;
	}

	public String search() {

		System.out.println("book  search");
		return NONE;
	}
}
