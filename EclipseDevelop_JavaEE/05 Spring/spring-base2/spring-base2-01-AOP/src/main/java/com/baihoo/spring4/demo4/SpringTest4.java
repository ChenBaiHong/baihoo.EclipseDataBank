package com.baihoo.spring4.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.demo4.dao.PersonDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext_demo4.xml")
public class SpringTest4 {
	@Autowired
	@Qualifier("personDaoProxy")
	private PersonDao personDao;
	@Test
	public void demo1() {
		personDao.addPerson();
		personDao.deletePerson();
		personDao.updatePerson();
		personDao.findPerson();
	}
}
