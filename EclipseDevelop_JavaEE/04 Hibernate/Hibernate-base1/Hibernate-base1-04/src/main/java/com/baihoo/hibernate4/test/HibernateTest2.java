package com.baihoo.hibernate4.test;

import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.baihoo.hibernate4.demo1.BhCustomer;
import com.baihoo.utils.HibernateUtils;

/**
 * Hibernate的事务与并发的测试类:
 * @author Administrator
 *
 */
public class HibernateTest2 {
	@Test
	public void demo9(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer customer = new BhCustomer();
		customer.setcName("李四");
		session.save(customer);
		
		tx.commit();
		// session.close();
	}
	
	@Test
	// 本地Session
	public void demo8(){
		Session session1 = HibernateUtils.getCurrentSession();
		Session session2 = HibernateUtils.getCurrentSession();
		
		System.out.println(session1 == session2);
	}	
	
	@Test
	// 本地Session
	public void demo7(){
		Session session1 = HibernateUtils.openSession();
		Session session2 = HibernateUtils.openSession();
		
		System.out.println(session1 == session2);
	}	
	
	@Test
	// 乐观锁解决丢失更新:
	public void demo6(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer customer = (BhCustomer) session.get(BhCustomer.class,3);
		customer.setAge(36);
		
		tx.commit();
		session.close();
	}	
	
	@Test
	// 乐观锁解决丢失更新:
	public void demo5(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer customer = (BhCustomer) session.get(BhCustomer.class,3);
		customer.setcName("铁男");
		
		tx.commit();
		session.close();
	}
	
	
	@Test
	// 悲观锁解决丢失更新:
	public void demo4(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		//BhCustomer customer = (BhCustomer) session.get(BhCustomer.class,3,LockMode.UPGRADE);
		BhCustomer customer = (BhCustomer) session.get(BhCustomer.class,3,LockOptions.UPGRADE);
		customer.setAge(36);
		
		tx.commit();
		session.close();
	}
	
	
	@Test
	// 悲观锁解决丢失更新:
	public void demo3(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		//BhCustomer customer = (BhCustomer) session.get(BhCustomer.class,3,LockMode.UPGRADE);
		BhCustomer customer = (BhCustomer) session.get(BhCustomer.class,1,LockOptions.UPGRADE);
		customer.setcName("baihoo.god2");
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 演示丢失更新
	public void demo2(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer customer = (BhCustomer) session.get(BhCustomer.class, 3);
		customer.setAge(36);
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 演示丢失更新
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer customer = (BhCustomer) session.get(BhCustomer.class, 3);
		customer.setcName("铁男");
		
		tx.commit();
		session.close();
	}
}
