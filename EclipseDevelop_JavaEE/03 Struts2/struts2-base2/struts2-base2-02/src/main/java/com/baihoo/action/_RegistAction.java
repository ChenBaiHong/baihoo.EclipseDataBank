package com.baihoo.action;

import com.baihoo.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
//使用模型驱动
public class _RegistAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	public User getModel() {
		return user;
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println(user);

		return null;
	}
}
