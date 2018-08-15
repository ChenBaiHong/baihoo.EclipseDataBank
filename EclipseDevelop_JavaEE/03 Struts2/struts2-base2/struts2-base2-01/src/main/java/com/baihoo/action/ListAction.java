package com.baihoo.action;

import java.util.List;

import com.baihoo.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class ListAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String execute() throws Exception {

		System.out.println(users);

		return null;
	}
}
