package com.baihoo.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate抽取工具类
 * @author Administrator
 *
 */
public class HibernateUtils {
	private static Configuration configuration;
	private static  ServiceRegistry  serviceRegistry;
	private static SessionFactory sessionFactory;
	
	static{
		configuration = new Configuration().configure();
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static Session openSession(){
		return sessionFactory.openSession();
	}
	
	public static Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public static void main(String[] args) {
		openSession();
	}
}
