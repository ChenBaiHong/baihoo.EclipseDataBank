package com.baihoo.hibernate4;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.baihoo.entity.Customer;
import com.baihoo.utils.HibernateUtils;

/**
 * 抽取了Hibernate的工具类的使用
 * @author Administrator
 *
 */
public class HibernateTest2 {
	@Test
	// 保存数据
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
	// 保存或更新()
	public void demo2(){
		// 获得SEssion
		Session session = HibernateUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		
		/*Customer customer = new Customer();
		customer.setName("冠希");
		customer.setAge(34);
		
		session.saveOrUpdate(customer);*/
		
		Customer customer = new Customer();
		customer.setName("冠希");
		customer.setAge(34);
		
		session.saveOrUpdate(customer);
		
		System.out.println(tx.wasCommitted());
		
		// 事务提交
		tx.commit();
		
		System.out.println(tx.wasCommitted());
		// session关闭
		session.close();
	}
	
	@Test
	// 保存数据
	public void demo3(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setName("芙蓉");
		customer.setAge(26);
		
		Serializable id = session.save(customer);
		
		// session.get(Customer.class, id);
		
		session.update(customer);
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 测试程序
	public void demo4(){
		Session session = HibernateUtils.openSession();
		
		Customer customer = new Customer();
		customer.setName("关羽");
		customer.setAge(26);
		
		session.save(customer);
		
		int d = 10 / 0;
		
		Customer customer2 = new Customer();
		customer2.setName("张飞");
		customer2.setAge(26);
		
		session.save(customer2);
		
		session.close();
	}
}
