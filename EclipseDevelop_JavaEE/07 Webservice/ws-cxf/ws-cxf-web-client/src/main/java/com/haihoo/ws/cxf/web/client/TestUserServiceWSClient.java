package com.haihoo.ws.cxf.web.client;

import java.util.List;

import com.haihoo.ws.cxf.web.soap.userServiceWS.User;
import com.haihoo.ws.cxf.web.soap.userServiceWS.UserService;
import com.haihoo.ws.cxf.web.soap.userServiceWS.UserServiceService;

/**
 * 
 * @author Administrator
 *
 */
public class TestUserServiceWSClient {
	public static void main(String[] args) {
		//创建服务访问点集合
		UserServiceService uss = new UserServiceService();
		//根据服务访问点获取绑定的类
		UserService us = uss.getUserServicePort();
		//调用具体业务逻辑
		User user = us.getUserByName("baHoo");
		System.out.println(user.getAddress());
		System.out.println(user.getEmail());
		System.out.println(user.getId());
		System.out.println(user.getName());
		User setUser = new User();
		setUser.setAddress("China");
		setUser.setName("baiHoo.good");
		setUser.setEmail("baihoo@gmail.com");
		setUser.setId("1");
		us.setUser(user);
		us.setUser(setUser);
		List<User> list = us.findByAll();
		list.forEach(e -> System.out.println(e));
	}
}
