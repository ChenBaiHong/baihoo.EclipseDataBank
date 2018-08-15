package com.baihoo.hibernate4.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.baihoo.hibernate4.demo1.BhCustomer;
import com.baihoo.hibernate4.demo1.BhOrder;
import com.baihoo.utils.HibernateUtils;

/**
 * Hibernate检索方式测试类:QBC.
 * QBC:Query By Criteria
 * 
 * @author Administrator
 *
 */
public class HibernateQBC {
	
	@Test
	// 离线条件查询:
	public void demo5(){
		DetachedCriteria criteria = DetachedCriteria.forClass(BhCustomer.class);
		criteria.add(Restrictions.eq("cName", "baiHoo.god"));
		criteria.add(Restrictions.eq("cId", 1));
		
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		List<BhCustomer> list = criteria.getExecutableCriteria(session).list();
		System.out.println(list);
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 分页查询
	public void demo4(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(BhOrder.class);
		criteria.setFirstResult(10);
		criteria.setMaxResults(10);
		List<BhOrder> list = criteria.list();
		for (BhOrder order : list) {
			System.out.println(order);
		}
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 条件查询:
	public void demo3(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(BhCustomer.class);
		//criteria.add(Restrictions.eq("cName", "美美"));
		//criteria.add(Restrictions.eq("cId", 2));
		criteria.add(Restrictions.like("cName", "%baiHoo%"));
		
		//List<Customer> list = criteria.list();
		// System.out.println(list);
		BhCustomer customer = (BhCustomer) criteria.uniqueResult();
		System.out.println(customer);
		tx.commit();
		session.close();
	}
	
	@Test
	// QBC:排序查询
	public void demo2(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		// 查询所有:
		Criteria criteria = session.createCriteria(BhOrder.class);
		criteria.addOrder(org.hibernate.criterion.Order.desc("oId"));//对象字段，而非数据库列
		List<BhOrder> list = criteria.list();
		for (BhOrder order : list) {
			System.out.println(order);
		}
		
		tx.commit();
		session.close();
	}
	
	@Test
	// QBC:简单查询
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		// 查询所有:
		List<BhCustomer> list = session.createCriteria(BhCustomer.class).list();
		list.forEach(e -> System.out.println(e));
		
		tx.commit();
		session.close();
	}
}
