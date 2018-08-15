package com.baihoo.test;

import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.baihoo.utils.HibernateUtils;
import com.baihoo.vo.Customer;

/**
 * Hibernate的事务管理:
 * @author Administrator
 *
 */
public class HibernateDemo3 {
	
	@Test
	/*
	 * 当前线程中绑定的session的使用
	 */
	public void demo8(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setCname("张三");
		customer.setAge(28);
		
		session.save(customer);
		
		tx.commit();
		// session.close();
	}
	
	@Test
	/*
	 * 事务通常在service层开启.session在DAO层.
	 * 	* 事务开启由session开启.
	 */
	public void demo7(){
		Session session1 = HibernateUtils.openSession();
		Session session2 = HibernateUtils.openSession();
		
		System.out.println(session1 == session2);
		
		Session session3 = HibernateUtils.getCurrentSession();
		Session session4 = HibernateUtils.getCurrentSession();
		System.out.println(session3 == session4);
	}
	
	@Test
	/*
	 * 使用乐观锁解决丢失更新
	 * 
	 * 乐观锁，大多是基于数据版本（Version）记录机制实现。何谓数据版本？即为数据增加一个版本标识，在基于数据库表的版本解决方案中，一般是通过为数据库表增加一个"version"字段来实现。
	 * 乐观锁的工作原理：读取出数据时，将此版本号一同读出，之后更新时，对此版本号加一。
	 * 
	 */
	public void demo6(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, 3);
		customer.setAge(26);
		
		tx.commit();
		session.close();
	}
	
	@Test
	/*
	 * 使用乐观锁解决丢失更新
	 * 使用悲观锁解决丢失更新
	 * 在Hibernate使用悲观锁十分容易，但实际应用中悲观锁是很少被使用的。
	 * 悲观锁大多数情况下依靠数据库的锁机制实现，以保证操作最大程度的独占性。
	 * 但随之而来的就是数据库性能的大量开销，特别是对长事务而言，这样的开销往往无法承受。
	 */
	public void demo5(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = (Customer) session.get(Customer.class, 3);
		customer.setCname("小明");
		
		tx.commit();
		session.close();
	}
	
	
	@Test
	/*
	 * 使用悲观锁解决丢失更新
	 * 在Hibernate使用悲观锁十分容易，但实际应用中悲观锁是很少被使用的。
	 * 悲观锁大多数情况下依靠数据库的锁机制实现，以保证操作最大程度的独占性。
	 * 但随之而来的就是数据库性能的大量开销，特别是对长事务而言，这样的开销往往无法承受。
	 */
	public void demo4(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		// 使用悲观锁(排他锁)
		Customer customer = (Customer) session.get(Customer.class, 3, LockOptions.UPGRADE);
		customer.setAge(32);
		
		tx.commit();
		session.close();
	}
	
	
	@Test
	/*
	 * 使用悲观锁解决丢失更新
	 * 在Hibernate使用悲观锁十分容易，但实际应用中悲观锁是很少被使用的，因为它大大限制了并发性： 
	 */
	public void demo3(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		// 使用悲观锁(排他锁)
		Customer customer = (Customer) session.get(Customer.class, 3, LockOptions.UPGRADE);
		customer.setCname("小明");
		
		tx.commit();
		session.close();
	}
	
	@Test
	/*
	 * 丢失更新的产生
	 */
	public void demo2(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = (Customer) session.get(Customer.class, 3);
		customer.setAge(30);
		
		tx.commit();
		session.close();
	}
	
	@Test
	/*
	 * 丢失更新的产生
	 */
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = (Customer) session.get(Customer.class, 3);
		customer.setCname("小明");
		
		tx.commit();
		session.close();
	}
}
