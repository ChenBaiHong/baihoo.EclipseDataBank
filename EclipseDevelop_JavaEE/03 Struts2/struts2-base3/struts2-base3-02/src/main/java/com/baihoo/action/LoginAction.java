package com.baihoo.action;

import org.apache.struts2.ServletActionContext;

import com.baihoo.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	public User getModel() {
		return user;
	}

	@Override
	public String execute() throws Exception {

		if ("tom".equals(user.getUsername())
				&& "123".equals(user.getPassword())) {

			ServletActionContext.getRequest().getSession()
					.setAttribute("user", user);
			return SUCCESS;
		} else {
			this.addActionError("用户名或密码错误");
			return INPUT;
		}
	}

}
