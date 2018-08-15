package com.baihoo.hibernate4;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.baihoo.entity.Customer;
import com.baihoo.utils.HibernateUtils;

/**
 * 
 * @author Administrator
 *
 */
public class HibernateTest1 {
	@Test
	// 添加记录操作
	public void TestInsert() {
		// 创建一个持久化对象
		Customer customer = new Customer();
		customer.setId(1);
		customer.setAge(25);
		customer.setName("baiHoo");
		// 获取一个session
		Session session = HibernateUtils.openSession();
		// 创建一个事务
		Transaction tx = session.beginTransaction();
		// 操作：把Customer存入数据库
		session.save(customer);
		// 事物提交
		tx.commit();
		// 释放资源
		session.close();
	}
	/**
	 * Hibernate get和load区别
	 * 		load方式检索不到的话会抛出org.hibernate.ObjectNotFoundException异常
	 * 		get方法检索不到的话会返回null
	 * 
	 * get和load的根本区别，一句话：
	 * 			hibernate对于load方法认为该数据在数据库中一定存在，可以放心的使用代理来延迟加载，如果在使用过程中发现了问题，只能抛异常；
	 * 			对于get方法，hibernate一定要获取到真实的数据，否则返回null
	 */
	@Test
	// 查询操作
	public void TestSelect() {
		// 获取session
		Session session = HibernateUtils.openSession();
		// 获取事务
		Transaction tx = session.beginTransaction();

		// 查询操作-get方法
		Customer Customer1 = (Customer) session.get(Customer.class, 1); // 马上发生一条SQL进行查询

		// 查询操作-load方法
		Customer Customer2 = (Customer) session.load(Customer.class, 1); // 没有发送SQL

		System.out.println("Customer1: " + Customer1);
		System.out.println("Customer2: " + Customer2);// 发送SQL.

		// 事务提交
		tx.commit();

		// 释放资源
		session.close();

	}

	@Test
	// 修改记录
	public void TestUpdate() {
		// 获取session
		Session session = HibernateUtils.openSession();
		// 获取事务
		Transaction tx = session.beginTransaction();

		// 操作：修改数据
		Customer customer = new Customer();
		customer.setAge(100);
		customer.setName("baiHoo");

		session.update(customer);

		// 事务提交
		tx.commit();

		// 释放资源
		session.close();

	}

	@Test
	// 删除记录
	public void TestDelete() {
		// 获取session和事务
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		// 操作：删除第一条记录 - 自动方式（先查询再删除）
		Customer customer = (Customer) session.get(Customer.class, 1);
		session.delete(customer);

		// 事务提交，释放资源
		tx.commit();
		session.close();

	}
}
