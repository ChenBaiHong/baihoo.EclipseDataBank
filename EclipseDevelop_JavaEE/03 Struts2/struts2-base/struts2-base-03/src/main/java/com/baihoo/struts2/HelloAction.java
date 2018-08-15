package com.baihoo.struts2;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action{

	public String execute(){
		
		System.out.println("hello action");
		
		return SUCCESS;
	}
}
