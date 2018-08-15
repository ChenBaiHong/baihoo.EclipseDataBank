package com.baihoo.action;

import com.baihoo.service.BookService;
import com.baihoo.vo.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class BookAction extends ActionSupport implements ModelDriven<Book>{
	
	private BookService bookService;
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	// 模型驱动类
	private Book book = new Book();
	public Book getModel() {
		return book;
	}

	// 处理请求的方法:
	public String add(){
		System.out.println("web层的添加执行了...");
		bookService.add(book);
		return NONE;
	}
}
