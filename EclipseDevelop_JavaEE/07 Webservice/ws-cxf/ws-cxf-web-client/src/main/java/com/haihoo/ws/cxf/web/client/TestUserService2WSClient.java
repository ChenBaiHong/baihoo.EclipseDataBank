package com.haihoo.ws.cxf.web.client;

import com.haihoo.ws.cxf.web.soap.userService2WS.User;
import com.haihoo.ws.cxf.web.soap.userService2WS.UserService2;
import com.haihoo.ws.cxf.web.soap.userService2WS.UserService2Service;

/**
 * 
 * @author Administrator
 *
 */
public class TestUserService2WSClient {
	public static void main(String[] args) {
		//创建服务访问点集合
		UserService2Service uss = new UserService2Service();
		//根据服务访问点获取绑定的类
		UserService2 us = uss.getUserService2Port();
		//调用具体业务逻辑
		User user = us.getUserByName("baHoo");
		System.out.println(user.getAddress());
		System.out.println(user.getEmail());
		System.out.println(user.getId());
		System.out.println(user.getName());
		User setUser = new User();
		setUser.setAddress("China");
		setUser.setName("baiHoo.good");
		setUser.setEmail("baihoo@baihoo.com");
		setUser.setId("1");
		us.setUser(setUser);
	}
}
