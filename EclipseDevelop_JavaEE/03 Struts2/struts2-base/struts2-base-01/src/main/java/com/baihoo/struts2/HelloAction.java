package com.baihoo.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * Struts2 入門程序，hello
 * 
 * @author Administrator
 *
 */
public class HelloAction extends ActionSupport{

	public String say() {
		System.out.println("hello action say method");
		return "good";
	}
}
