package com.baihoo.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.vo.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BookServiceTest {
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	@Test
	public void testAdd() {
		Book book1 = new Book(1,"java Enginer",22.3);
		Book book2 = new Book(2,"Oracle Enginer",32.3);
		Book book3 = new Book(3,"MySql Enginer",42.3);
		Book book4 = new Book(4,"Linux Enginer",52.3);
		
		bookService.add(book1);
		bookService.add(book2);
		bookService.add(book3);
		bookService.add(book4);
	}

	@Test
	public void testUpdate() {
		Book book = new Book(1,"Java Develop Enginer",22.3);
		
		bookService.update(book);
	}

	@Test
	public void testDelete() {
		Book book = new Book();
		book.setId(1);
		bookService.delete(book);
	}

	@Test
	public void testFindById() {
		Book book = bookService.findById(2);
		System.out.println(book);
	}

	@Test
	public void testFindAll() {
		List<Book> books = bookService.findAll();
		for (Book book : books) {
			System.out.println(book);
		}
	}

	@Test
	public void testFindByCriteria() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);
		criteria.add(Restrictions.eq("name", "Oracle Enginer"));
		List<Book> books = bookService.findByCriteria(criteria);
		for (Book book : books) {
			System.out.println(book);
		}
	}

	@Test
	public void testFindByName() {
		List<Book> books = bookService.findByName("Oracle Enginer");
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
