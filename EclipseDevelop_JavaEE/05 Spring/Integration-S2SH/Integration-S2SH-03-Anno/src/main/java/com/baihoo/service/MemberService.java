package com.baihoo.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.baihoo.dtobj.Member;

public interface MemberService {
	/**
	 * 添加成员
	 * @param member
	 */
	void add(Member member);
	
	/**
	 * 删除成员
	 * @param member
	 */
	void delete(Member member);
	/**
	 * 更新成员
	 * @param member
	 */
	void update(Member member);
	/**
	 * 通过id查询成员
	 * @param id
	 * @return
	 */
	Member findById(Integer id);
	/**
	 * 通过id懒加载查询成员
	 * @param id
	 * @return
	 */
	Member findByIdLazy(Integer id);
	/**
	 * 通过成员名称查询
	 * @param name
	 * @return
	 */
	List<Member> findByName(String name);
	/**
	 * 查询所有成员
	 * @return
	 */
	List<Member> findAll();
	/**
	 * 通过criteria查询成员
	 * @return
	 */
	List<Member> findByCriteria(DetachedCriteria detachedCriteria);
}
