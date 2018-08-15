package com.baihoo.spring4.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.spring4.demo3.dao.AuctorDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo3.xml")
public class SpringTest3 {
		@Autowired
		@Qualifier("auctorDao")
		private AuctorDao auctorDao;
		@Test
		public void demo1() {
			auctorDao.addAuctor();
			auctorDao.updateAuctor();
			auctorDao.deleteAuctor();
			auctorDao.findAuctor();
		}
}
