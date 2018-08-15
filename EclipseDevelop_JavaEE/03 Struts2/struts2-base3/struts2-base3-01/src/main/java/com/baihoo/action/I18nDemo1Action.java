package com.baihoo.action;

import com.opensymphony.xwork2.ActionSupport;

public class I18nDemo1Action extends ActionSupport {

	@Override
	public String execute() throws Exception {

		// 得到properties文件中信息.

		//System.out.println(this.getText("msg"));

		//动态文本
		System.out.println(this.getText("msg", new String[]{"tom"}));
		
		return NONE;
	}
}
