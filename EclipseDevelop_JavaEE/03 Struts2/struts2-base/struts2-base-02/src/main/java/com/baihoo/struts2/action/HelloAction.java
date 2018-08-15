package com.baihoo.struts2.action;

import com.baihoo.struts2.MyModelDriven;
import com.baihoo.struts2.User;

/**
 * 
 * @author Administrator
 *	 模仿Struts2的model模型
 */
public class HelloAction implements MyModelDriven<User> {

	private User user = new User();

	public User getModel() {
		return user;
	}

	// private String username;
	// private String password;
	//
	// public String getUsername() {
	// return username;
	// }
	//
	// public void setUsername(String username) {
	// this.username = username;
	// }
	//
	// public String getPassword() {
	// return password;
	// }

	// public void setPassword(String password) {
	// this.password = password;
	// }

	public String say() {
		System.out.println("hello action say method");
		return "good";
	}
}
