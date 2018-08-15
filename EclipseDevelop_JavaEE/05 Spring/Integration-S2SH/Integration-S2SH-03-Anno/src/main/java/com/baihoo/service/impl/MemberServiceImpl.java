package com.baihoo.service.impl;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baihoo.dao.MemberDao;
import com.baihoo.dtobj.Member;
import com.baihoo.service.MemberService;

@Service("memberService")
@Transactional //(isolation=Isolation.DEFAULT , propagation=Propagation.REQUIRED , readOnly=false)//事务特性默认级别
public class MemberServiceImpl implements MemberService {
	@Autowired
	@Qualifier("memberDao")
	private MemberDao memberDao;
	@Override
	public void add(Member member) {
		memberDao.add(member);
		
	}

	@Override
	public void delete(Member member) {
		memberDao.delete(member);
		
	}

	@Override
	public void update(Member member) {
		memberDao.update(member);
		
	}

	@Override
	public Member findById(Integer id) {
		
		return memberDao.findById(id);
	}

	@Override
	public Member findByIdLazy(Integer id) {
		
		return memberDao.findByIdLazy(id);
	}

	@Override
	public List<Member> findByName(String name) {
		
		return memberDao.findByName(name);
	}

	@Override
	public List<Member> findAll() {
		
		return memberDao.findAll();
	}

	@Override
	public List<Member> findByCriteria(DetachedCriteria detachedCriteria) {
		return memberDao.findByCriteria(detachedCriteria);
	}
	
}
