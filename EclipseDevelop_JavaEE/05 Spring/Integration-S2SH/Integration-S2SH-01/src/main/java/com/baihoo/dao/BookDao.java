package com.baihoo.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.baihoo.vo.Book;

public class BookDao extends HibernateDaoSupport{

	public void save(Book book) {
		System.out.println("DAO层的保存图书...");
		this.getHibernateTemplate().save(book);
	}

}
