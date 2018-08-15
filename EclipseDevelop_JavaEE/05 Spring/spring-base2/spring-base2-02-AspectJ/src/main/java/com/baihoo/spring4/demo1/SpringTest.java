package com.baihoo.spring4.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.demo1.dao.MemberDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo1.xml")
public class SpringTest {
		@Autowired
		@Qualifier("memberDao")
		private MemberDao memberDao;
		@Test
		public void demo1() {
			memberDao.addMember();
			memberDao.updateMember();
			memberDao.deleteMember();
			memberDao.findMember();
		}
}
