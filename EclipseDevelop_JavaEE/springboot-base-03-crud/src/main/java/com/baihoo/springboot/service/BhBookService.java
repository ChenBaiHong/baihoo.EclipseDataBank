package com.baihoo.springboot.service;

import java.util.List;

import com.baihoo.springboot.entity.BhBook;

/**
 * 书籍的crud的服务层
 * @author Administrator
 *
 */
public interface BhBookService {
	/**
	 * 查询所有书籍
	 * @return
	 */
	List<BhBook> findByAll();
	/**
	 * 通过id查询书籍
	 * @param id
	 * @return
	 */
	BhBook findById(Integer id);
	/**
	 * 更新书籍
	 * @param id
	 * @param bhBook
	 * @return
	 */
	Integer updateBhBook(Integer id , BhBook bhBook);
	/**
	 * 通过id删除书籍
	 * @param id
	 */
	void deleteBhBook(Integer id );
	/**
	 * 添加保存书籍
	 * 
	 * @param bhBook
	 * @return
	 */
	Integer saveBhBook(BhBook bhBook);

	/**
	 * 通過對象使用命名SQl模糊查詢
	 * @param bhBook
	 * @return
	 */
	List<BhBook>findByConditionIsSql(BhBook book) ;
	/**
	 * 條件查詢，通過Specification確定查詢條件
	 * @return
	 */
	List<BhBook>findByConditionIsSpecification(BhBook book);
}
