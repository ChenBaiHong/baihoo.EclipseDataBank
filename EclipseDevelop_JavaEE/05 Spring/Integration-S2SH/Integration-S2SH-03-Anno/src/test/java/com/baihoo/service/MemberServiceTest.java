package com.baihoo.service;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.dao.MemberDao;
import com.baihoo.dtobj.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MemberServiceTest {
	@Autowired
	//@Qualifier("memberService")
	//MemberService memberService;
	@Qualifier("memberDao")
	MemberDao memberDao;
	@Test
	public void testAdd() {
		Member member = new Member();
		member.setId(1);
		member.setBirthDate(new Date());
		member.setMeName("baihoo");
		member.setMeAge(123);
		member.setMeNo("BH001");
		member.setMeDesc("good");
		Member member2 = new Member();
		member2.setId(2);
		member2.setBirthDate(new Date());
		member2.setMeName("baihoo2");
		member2.setMeAge(123);
		member2.setMeNo("BH002");
		member2.setMeDesc("good");
		Member member3 = new Member();
		member3.setId(3);
		member3.setBirthDate(new Date());
		member3.setMeName("baihoo3");
		member3.setMeAge(123);
		member3.setMeNo("BH003");
		member3.setMeDesc("good");
		Member member4 = new Member();
		member4.setId(4);
		member4.setBirthDate(new Date());
		member4.setMeName("baihoo4");
		member4.setMeAge(123);
		member4.setMeNo("BH004");
		member4.setMeDesc("good");
		memberDao.add(member);
		memberDao.add(member2);
		memberDao.add(member3);
		memberDao.add(member4);
		
	}
	@Test
	public void testFindById() {
		Member member = memberDao.findById(2);
		System.out.println(member);
	}
	@Test
	public void testFindByIdLazy() {
		Member member = memberDao.findByIdLazy(2);
		System.out.println(member);
	}
	@Test
	public void testFindByCriteria() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Member.class);
		criteria.add(Restrictions.like("meName", "%baihoo%"));
		criteria.add(Restrictions.and(Restrictions.between("meAge",12,134)));
		//criteria.add(Restrictions.and(Restrictions.or(Restrictions.le("meAge", 12), Restrictions.gt("meAge", 34))));
		List<Member> members = memberDao.findByCriteria(criteria);
		
		members.forEach(e -> System.out.println(e.getMeName()));
	}

}
