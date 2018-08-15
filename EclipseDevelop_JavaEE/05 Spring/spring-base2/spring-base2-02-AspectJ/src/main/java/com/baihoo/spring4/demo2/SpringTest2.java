package com.baihoo.spring4.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.demo2.dao.GroupDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo2.xml")
public class SpringTest2 {
		@Autowired
		@Qualifier("groupDao")
		private GroupDao groupDao;
		@Test
		public void demo1() {
			groupDao.addGroup();
			groupDao.updateGroup();
			groupDao.deleteGroup();
			groupDao.findGroup();
		}
}
