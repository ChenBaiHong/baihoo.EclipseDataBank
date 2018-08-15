package com.baihoo.action;

import com.baihoo.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OgnlDemo4Action extends ActionSupport implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private List<User> users;
	private User user = new User("tom", "123", 20, "男");

	public User getModel() {

		return user;
	}

	// public List<User> getUsers() {
	// return users;
	// }
	//
	// public void setUsers(List<User> users) {
	// this.users = users;
	// }
	//
	// public String getHello() {
	//
	// return "hello world";
	// }

	@Override
	public String execute() throws Exception {

		//ValueStack vs = ActionContext.getContext().getValueStack();

		// users = new ArrayList<User>();

		// users.add(new User("tom", "123", 20, "男"));
		// users.add(new User("james", "456", 21, "男"));
		// users.add(new User("fox", "789", 26, "男"));

		user = new User("fox", "789", 26, "男");

		return SUCCESS;
	}
}
