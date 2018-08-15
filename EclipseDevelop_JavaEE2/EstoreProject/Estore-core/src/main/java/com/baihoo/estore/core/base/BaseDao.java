package com.baihoo.estore.core.base;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author 陈柏宏
 *		抽取页面关于对象数据层包含的通用基本的方法
 */

public interface BaseDao<T> {
	
	public void save(T t) throws Exception;

	public void update(T t) throws Exception;

	public void delete(T t) throws Exception;
	
	public List<T> findAll() throws Exception;

	public T findById(Serializable uuid) throws Exception;
	
	public List<T> findAll(BaseDto bDto, Integer currentPage,Integer pageDataCount) throws Exception;

	public Integer findByIsCount(BaseDto bDto) throws Exception;
}
