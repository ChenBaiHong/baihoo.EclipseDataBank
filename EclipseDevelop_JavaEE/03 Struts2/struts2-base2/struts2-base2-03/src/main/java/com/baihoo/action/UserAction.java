package com.baihoo.action;

import com.baihoo.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//使用模型驱动
public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	public User getModel() {
		return user;
	}

	public String login() throws Exception {

		System.out.println("login method.....");

		return null;
	}

	public String regist() throws Exception {

		System.out.println("regist method.....");

		return null;
	}

	
	// @Override
	// public void validate() {
	// System.out.println("validate method...");
	// }
	// public void validateRegist() {
	//
	// // if (user.getUsername() == null
	// // || user.getUsername().trim().length() == 0) {
	// // // 说明用户名为空
	// //
	// // this.addFieldError("username.message", "用户名不能为空");
	// //
	// // }
	// //
	// // if (user.getPassword() == null
	// // || user.getPassword().trim().length() == 0) {
	// // this.addFieldError("password.message", "密码不能为空");
	// //
	// // }
	// //
	// // if (!(user.getAge() >= 10 && user.getAge() <= 40)) {
	// // this.addFieldError("age.message", "年龄必须在10-40之间");
	// // }
	//
	// System.out.println("validateRegist......");
	// }
}
