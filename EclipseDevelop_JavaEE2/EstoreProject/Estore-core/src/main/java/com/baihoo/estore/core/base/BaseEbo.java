package com.baihoo.estore.core.base;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author 陈柏宏
 *		抽取业务层包含的通用基本的方法
 * @param <T>
 * 
 */
public interface BaseEbo<T> {
	
	public void save(T t) throws Exception;

	public void update(Serializable id , T t) throws Exception;
	
	public void delete(Serializable id, T t) throws Exception;
	
	public List<T> findAll() throws Exception;

	public T findById(Serializable uuid) throws Exception;
	
	public List<T> findAll(BaseDto bDto, Integer currentPage,Integer pageDataCount) throws Exception;

	public Integer findByIsCount(BaseDto bDto) throws Exception;
}
