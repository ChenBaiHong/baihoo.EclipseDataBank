package com.baihoo.estore.core.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;


/**
 * 基本实现层通用抽取方法
 * @author 陈柏宏
 *
 * @param <T> 泛型类
 */
@SuppressWarnings("all")
@Component
public abstract class BaseDaoImpl<T> extends HibernateDaoSupport{
	
	private Class<T> entityClass; //实体类
	/**
	 * 初始化entryClass实体类
	 */
	public BaseDaoImpl() {
		Type genericType = getClass().getGenericSuperclass();
		Type[] classParams =((ParameterizedType)genericType).getActualTypeArguments();//获取实际类型参数
		entityClass = (Class<T>) classParams[0];
	}
	//注入hibernate模板
	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	@PostConstruct
	public void initialize() {
		this.setHibernateTemplate(hibernateTemplate);
	}

	public void save(T t) throws Exception{
		this.getHibernateTemplate().save(t);
	}
	
	public void update(T t) throws Exception{
		this.getHibernateTemplate().update(t);
	}
	
	public void delete(T t) throws Exception{
		this.getHibernateTemplate().delete(t);
	}
	
	public T findById(Serializable uuid) throws Exception{
		return this.getHibernateTemplate().get(entityClass, uuid);
	}
	
	public List<T> findAll() throws Exception{ 
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);
		return (List<T>) this.getHibernateTemplate().findByCriteria(dc);
	}
	
	public List<T> findAll(BaseDto bDto, Integer currentPage , Integer pageDataCount) throws Exception{
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);
		doQueryDetachedCriteria(dc , bDto);
		//.HibernateTemplate.findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults) 
		//currentPage = 1	, pageSize = 5	[ firstResult (1-1)*5 = 0], 从坐标为0的位置向前查5个数据(坐标为5对应的数据排除)
		//currentPage = 2	, pageSize = 5	[ firstResult (2-1)*5 = 5], 从坐标为5的位置向前查5个数据(坐标为10对应的数据排除)
		return (List<T>) getHibernateTemplate().findByCriteria(dc, (currentPage-1)*pageDataCount, pageDataCount);
	}

	public Integer findByIsCount(BaseDto bDto) throws Exception{
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);
		dc.setProjection(Projections.rowCount());
		doQueryDetachedCriteria(dc , bDto);
		List<Long> count = (List<Long>) getHibernateTemplate().findByCriteria(dc);
		return count.get(0).intValue();
	}
	/**
	 * 注入会话工厂
	 * 		注意这里不可以重写父类的  setSessingFactory(SessionFactory sessionFactory)
	 * 		因为父类的方法使最终[ final ]不可变，所以要另写自己的sessionFactory调用父类的[ sessionFactory ]方法
	 * @param sessionFactory   		注解注入
	 * 
	 */
	/*public abstract void setMySessingFactory(SessionFactory sessionFactory);*/
	
	public abstract void doQueryDetachedCriteria(DetachedCriteria dc ,BaseDto bDto);
}
