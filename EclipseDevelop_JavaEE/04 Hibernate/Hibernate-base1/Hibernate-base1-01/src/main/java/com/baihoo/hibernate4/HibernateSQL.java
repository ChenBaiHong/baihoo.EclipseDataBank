package com.baihoo.hibernate4;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import com.baihoo.entity.Customer;

public class HibernateSQL {
	@Test
	// 查询所有记录:SQL
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
		// 查询所有:SQL
		/*
		SQLQuery query = session.createSQLQuery("select * from customer");
		List<Object[]> list = query.list();
		
		for (Object[] objs : list) {
			System.out.println(Arrays.toString(objs));
		}
		*/
		SQLQuery query = session.createSQLQuery("select * from customer");
		query.addEntity(Customer.class);
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		// 7.事务提交
		tx.commit();
		// 8.释放资源
		session.close();
		sessionFactory.close();
		
	}
	
}
