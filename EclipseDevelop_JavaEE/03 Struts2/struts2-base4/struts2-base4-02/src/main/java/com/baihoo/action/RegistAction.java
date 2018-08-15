package com.baihoo.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Struts2控制表单重复提交
 * @author Administrator
 *
 */
public class RegistAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("将" + username + " 与" + password + "存储到数据库中,完成注册");
		return null;
	}
}
