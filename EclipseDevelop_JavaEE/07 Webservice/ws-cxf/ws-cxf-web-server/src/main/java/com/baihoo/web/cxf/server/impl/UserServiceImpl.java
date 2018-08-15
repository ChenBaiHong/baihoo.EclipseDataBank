package com.baihoo.web.cxf.server.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.ws.ServiceMode;

import com.baihoo.web.cxf.model.User;
import com.baihoo.web.cxf.server.UserService;
/**
 * 
 * @author Administrator
 *
 */
@ServiceMode
public class UserServiceImpl  implements UserService{
	List<User> list = new ArrayList<User>();
	@Override
	public User getUserByName(String name) {
		 User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        user.setName(name);
        user.setAddress("china . chengdu");
        user.setEmail(name + "@gmail.com");
		return user;
	}

	@Override
	public void setUser(User user) {
		list.add(user);
		System.out.println("================= Server setUser =================");
	    System.out.println("设置用户信息：" + user);
	}

	@Override
	public List<User> findByAll() {
		
		return list;
	}

}
