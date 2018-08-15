package com.baihoo.estore.core.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	 // 使用静态代码块初始化类 - 加载核心配置文件以及创建一个sessionFactory
	static{
		configuration = new Configuration().configure();
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	
	public static Session openSession (){
		return sessionFactory.openSession();
	}
	/**
	 * ThreadLocal<Conection>
	 * 单线程处理
	 * @return
	 */
	public static Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	public static void main(String[] args){
		openSession();
	}
}
