package com.baihoo.spring4.demo6.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext_demo6.xml")
public class SpringTest6 {
	@Autowired
	@Qualifier("groupDao")
	private GroupDao groupDao;
	@Autowired
	@Qualifier("memberDao")
	private MemberDao memberDao;
	@Test
	public void demo1() {
		groupDao.addGroup();
		groupDao.deleteGroup();
		groupDao.updateGroup();
		groupDao.findGroup();
		
		memberDao.addMember();
		memberDao.deleteMember();
		memberDao.updateMember();
		memberDao.findMember();
	}
}
