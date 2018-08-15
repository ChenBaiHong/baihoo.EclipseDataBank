package com.baihoo.hibernate4;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import com.baihoo.entity.Customer;

public class HibernateQBC {
	@Test
	// 查询所有:QBC
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
		// 查询所有 :QBC.
		/*
		Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> list = criteria.list();
		*/
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("name", "baiHoo"));
		List<Customer> list = criteria.list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		// 6.事务提交
		tx.commit();
		// 7.释放资源
		session.close();
		sessionFactory.close();
	}
}
