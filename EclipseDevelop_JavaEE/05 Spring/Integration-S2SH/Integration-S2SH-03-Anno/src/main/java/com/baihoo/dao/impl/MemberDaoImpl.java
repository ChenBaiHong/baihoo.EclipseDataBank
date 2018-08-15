package com.baihoo.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.baihoo.dao.MemberDao;
import com.baihoo.dtobj.Member;
/**
 * 
 * @author Administrator
 *
 */
@Repository("memberDao")
//@Transactional
public class MemberDaoImpl extends HibernateDaoSupport implements MemberDao{
	
	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	@PostConstruct
	public void initialize() {
		this.setHibernateTemplate(hibernateTemplate);
	}
	@Override
	public void add(Member member) {
		hibernateTemplate.save(member);
	}

	@Override
	public void delete(Member member) {
		hibernateTemplate.delete(member);
		
	}

	@Override
	public void update(Member member) {
		hibernateTemplate.update(member);
		
	}

	@Override
	public Member findById(Integer id) {
		
		return hibernateTemplate.get(Member.class, id);
	}

	@Override
	public Member findByIdLazy(Integer id) {
		
		return hibernateTemplate.load(Member.class, id);
	}
	/**
	 * 通过命名sql查询
	 */
	@Override
	public List<Member> findByName(String name) {
		
		return (List<Member>) hibernateTemplate.findByNamedQuery("findByNameIsHQL" , name);
	}
	/**
	 * HQL 查询所有
	 */
	@Override
	public List<Member> findAll() {
		
		return (List<Member>) hibernateTemplate.find("from Member");
	}
	/**
	 * QBC 条件查询
	 */
	@Override
	public List<Member> findByCriteria(DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		return (List<Member>) hibernateTemplate.findByCriteria(detachedCriteria);
	}
	
}
	