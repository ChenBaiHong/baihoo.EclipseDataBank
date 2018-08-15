package com.baihoo.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.baihoo.springboot.entity.BhBook;
import com.baihoo.springboot.repository.BhBookRepository;
import com.baihoo.springboot.service.BhBookService;

/**
 * 				
 * @author Administrator
 *
 "@Transactional"
		isolation:DEFAULT	:事务的隔离级别.
		propagation			:事务的传播行为.
		read-only			:false.不是只读
		timeout				:-1
		no-rollback-for		:发生哪些异常不回滚
		rollback-for		:发生哪些异常回滚事务
*/
@Service("bhBookService")
public class BhBookServiceImpl implements BhBookService {
	//注入
	@Resource
	private BhBookRepository bhBookRepository;

	public List<BhBook> findByAll() {
		
		return bhBookRepository.findAll();
	}
	
	public BhBook findById(Integer id) {
		Optional<BhBook> optional =  bhBookRepository.findById(id);
		return optional.get();
	}

	public Integer updateBhBook(Integer id, BhBook bhBook) {
		if(id!=null) {
			bhBook = bhBookRepository.save(bhBook);
			if(bhBook!=null) {
				return 1;
			}
		}else {
			//抛出异常
		}
		return 0;
	}
	
	public void deleteBhBook(Integer id) {
		bhBookRepository.deleteById(id);
	}
	
	public Integer saveBhBook(BhBook bhBook) {
		bhBook = bhBookRepository.save(bhBook);
		if(bhBook!=null) {
			return 1;
		}
		return 0;
	}

	
	public List<BhBook> findByConditionIsSql(BhBook book) {
		if(book !=null) {
			String author=null;
			String bookName=null;
			if ((author = book.getBookName()) != null && !"".equals(author.trim())
					&& (bookName = book.getBookName()) != null && !"".equals(bookName.trim())) {
					/*查詢條件表達式，集合*/
					return bhBookRepository.findByAuthorOrBookName(author, bookName);
			}
		}
		return new ArrayList<BhBook>();
	}

	
	public List<BhBook> findByConditionIsSpecification(BhBook book) {
		List<BhBook> bookList = bhBookRepository.findAll(new Specification<BhBook>() {
			/**
			 * 拼接確定的查詢條件
			 */
			public Predicate toPredicate(Root<BhBook> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				/*構建聯合查詢的predicate類*/
				Predicate predicate = criteriaBuilder.conjunction();
				if(book !=null) {
					String author=null;
					String bookName=null;
					/*查詢條件表達式，集合*/
					List<Expression<Boolean>> expressions = predicate.getExpressions();
					if ((author = book.getAuthor()) != null && !"".equals(author.trim())) {
						expressions.add(criteriaBuilder.like(root.get("author"), "%" + author + "%"));
					}
					if ((bookName = book.getBookName()) != null && !"".equals(bookName.trim())) {
						expressions.add(criteriaBuilder.like(root.get("bookName"), "%" + bookName + "%"));
					}
				}
				return predicate;
			}
		});
		return bookList;
	}
}
