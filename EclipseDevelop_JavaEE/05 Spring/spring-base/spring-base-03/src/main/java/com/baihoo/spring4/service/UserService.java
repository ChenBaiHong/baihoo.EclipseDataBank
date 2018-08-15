package com.baihoo.spring4.service;

import com.baihoo.spring4.entity.User;

public interface UserService {
	 User findByName(String name);
	 User findByAge(String age);
}
