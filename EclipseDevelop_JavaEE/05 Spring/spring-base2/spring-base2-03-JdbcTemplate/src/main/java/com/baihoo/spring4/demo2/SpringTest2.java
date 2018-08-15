package com.baihoo.spring4.demo2;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.demo2.dao.UserDao;
import com.baihoo.spring4.demo2.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest2 {
	
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	@Test
	public void insertTest(){
		User user = new User();
		user.setName("baiHoo.chen");
		
		userDao.add(user);
	}
	
	@Test
	public void updateTest(){
		User user = new User();
		user.setId(1);
		user.setName("baiHoo.good");
		
		userDao.update(user);
	}
	
	@Test
	public void deleteTest(){
		User user = new User();
		user.setId(1);
		
		userDao.delete(user);
	}
	
	@Test
	public void fingCountTest(){
		int count = userDao.findCount();
		System.out.println(count);
	}
	
	@Test
	public void findNameByIdTest(){
		String name = userDao.findNameById(3);
		System.out.println(name);
	}
	
	@Test
	public void findByIdTest(){
		User user = userDao.findById(3);
		System.out.println(user);
	}
	
	@Test
	public void findAllTest(){
		List<User> list = userDao.findAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
