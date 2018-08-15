package com.baihoo.hibernate4;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.baihoo.entity.Customer;
import com.baihoo.utils.HibernateUtils;

/**
 * 主键生成策略
 * @author Administrator
 *
 */
public class HibernateTest3 {
	
	@Test
	// 演示increment的问题:
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setName("芙蓉");
		customer.setAge(26);
		
		session.save(customer);
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 演示increment的问题:
	public void demo2(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = new Customer();
		// customer.setId(100);
		customer.setName("凤姐");
		customer.setAge(26);
		
		session.save(customer);
		
		tx.commit();
		session.close();
	}
	@Test
	// 演示错误:(注意:)
	public void demo7(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = (Customer) session.get(Customer.class, 10);
		
		Customer customer2 = new Customer();
		customer.setId(10);//缓存中有两个对象，如果更新会抛异常
		customer.setName("张飞");
		session.update(customer2);
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 演示持久化类为final情况
	public void demo8(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = (Customer) session.load(Customer.class, 10);
		
		tx.commit();
		session.close();
	}
}
