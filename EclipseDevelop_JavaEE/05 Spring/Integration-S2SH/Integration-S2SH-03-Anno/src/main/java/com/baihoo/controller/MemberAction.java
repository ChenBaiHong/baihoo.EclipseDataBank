package com.baihoo.controller;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.baihoo.dtobj.Member;
import com.baihoo.service.MemberService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Controller(value="memberAction")
@Scope("prototype")
public class MemberAction extends ActionSupport implements ModelDriven<Member>{
	private static final String MYSUCCESS = "MYSUCCESS";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	@Qualifier("memberService")
	private MemberService memberService;
	// 模型驱动类
	Member member= new Member();
	@Override
	public Member getModel() {
		return member;
	}

	public String addMember() {
		System.out.println("web层的添加执行了...");
		memberService.add(member);
		return MYSUCCESS;
	}

	public String findMember() {
		List<Member> members = memberService.findByName("%baiHoo%");
		members.forEach(e -> System.out.println(e));
		return SUCCESS;
	}
	public String findAll() {
		List<Member> members = memberService.findAll();
		members.forEach(e -> System.out.println(e));
		return SUCCESS;
	}
	public String findByIdLazy() {
		Member member = memberService.findByIdLazy(2);
		System.out.println(member);
		return SUCCESS;
	}

	public String findByCriteria() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Member.class);
		criteria.add(Restrictions.like("meName", "%baihoo%"));
		criteria.add(Restrictions.and(Restrictions.between("meAge",12,134)));
		//criteria.add(Restrictions.and(Restrictions.or(Restrictions.le("meAge", 12), Restrictions.gt("meAge", 34))));
		List<Member> members = memberService.findByCriteria(criteria);
		
		members.forEach(e -> System.out.println(e.getMeName()));
		return MYSUCCESS;
	}
}
