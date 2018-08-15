package com.baihoo.action;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport {

	@Override
	public String execute() throws Exception {

		System.out.println("demo1 action");
		return null;
	}
	
	public String a() throws Exception {

		System.out.println("a action");
		return null;
	}
}
