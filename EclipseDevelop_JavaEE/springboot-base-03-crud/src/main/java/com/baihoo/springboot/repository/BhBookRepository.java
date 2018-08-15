package com.baihoo.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.baihoo.springboot.entity.BhBook;

/**
 *  BhBook实体向上实现的dao层操作接口其继承的（SpringBoot框架支持提供）JpaRepository涉及到泛型传参有必要解释下
 *      JpaRepository<T, ID> 表映射的实体，实体映射表的主键id
 *
 *  其JpaRepository 简单说明一下相当于spring框架提供的hibernateTemplate ，留个印象
 *  
 *  JpaSpecificationExecutor 可以實現動態查詢
 */
public interface BhBookRepository extends JpaRepository<BhBook , Integer> , JpaSpecificationExecutor<BhBook>{
	
	/**
	 * 自定義hibernate HQL查詢
	 * 通過書名模糊查詢書記
	 * 
	 *  	'%?1%' 注意是這種寫法，第一個下標 ? 傳值
	 * @param name
	 * @return
	 */
	@Query("select b from BhBook b where b.bookName like '%?1%'")
	public List<BhBook> findByBookName(String bookName);
	/**
	 * 自定義 SQL查詢
	 * 
	 * 通過作者和書名模糊查詢書籍列表
	 * 
	 *		 	'%?1%' 注意是這種寫法，第一個下標 ? 傳值
	 * 			'%?2%' 注意是這種寫法，第二個下標 ? 傳值
	 * @param author
	 * @return
	 */
	@Query(value="select * from bh_book b where b.author like '%?1%' or b.book_name like '%?2%'" , nativeQuery=true)
	public List<BhBook> findByAuthorOrBookName(String author , String bookName);
	
	/**
	 * 自定義sql隨機查詢
	 * 
	 * @param randNum
	 * @return
	 */
	@Query(value="select * from bh_book  order BY RAND() LIMIT ?1" , nativeQuery=true)
	public List<BhBook> findIsRand(Integer randNum);
}
