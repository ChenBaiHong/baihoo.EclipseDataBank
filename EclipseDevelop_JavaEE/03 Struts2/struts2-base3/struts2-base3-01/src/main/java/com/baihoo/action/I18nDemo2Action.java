package com.baihoo.action;

import com.opensymphony.xwork2.ActionSupport;

public class I18nDemo2Action extends ActionSupport {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String execute() throws Exception {
		return null;
	}
}
