package com.baihoo.service;

import org.springframework.transaction.annotation.Transactional;

import com.baihoo.dao.BookDao;
import com.baihoo.vo.Book;
@Transactional
public class BookService {

	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void add(Book book) {
		System.out.println("Service层保存图书...");
		bookDao.save(book);
	}

}
