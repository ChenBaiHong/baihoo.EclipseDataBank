package com.baihoo.hibernate4;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import com.baihoo.entity.Customer;
import com.baihoo.utils.HibernateUtils;

public class HibernateHQL {
	@Test
	// 查询所有:HQL.
	// HQL:Hibernate Query Language.Hibernate查询语言.面向对象的查询.
	public void demo1(){
		// 1.加载核心配置文件
		Configuration configuration = new Configuration().configure();
		// 手动编码加载映射文件:
		// configuration.addResource("com/baihoo/entity/entityHbm/Customer.hbm.xml");
		// configuration.addClass(Customer.class);
		//2 . 注册标准的操作服务
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		// 3.构建Session工厂
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		// 4.通过工厂创建Session
		Session session = sessionFactory.openSession();
		// 5.开启事务
		Transaction tx = session.beginTransaction();	
		
		// 6.操作
		// 1.查询所有的客户
		Query query = session.createQuery("from Customer");
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		// 2.按名称查询
		/*
		Query query1 = session.createQuery("from Customer where name = ?");
		query.setParameter(0, "baiHoo");
		list = query1.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		Query query2 = session.createQuery("from Customer where name = :param");
		query.setParameter("param", "baiHoo");
		
		list = query2.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		*/
		
		// 6.事务提交
		tx.commit();
		// 7.释放资源
		session.close();
		sessionFactory.close();
	}
	
	@Test
	// HQL:
	public void demo2(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		// 1.简单查询
		// List<Customer> list = session.createQuery("from Customer").list();
		
		// 2.条件查询:
		// List<Customer> list = session.createQuery("from Customer where name = ?").setParameter(0, "baiHoo").list();
		 
		
		// 3.分页查询:select * from customer limit a,b; a:从哪开始  b:每页显示记录数.
		Query query = session.createQuery("from Customer");
		query.setFirstResult(3);
		query.setMaxResults(3);
		
		List<Customer> list = query.list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		tx.commit();
		session.close();
	}
}
