package com.baihoo.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *  Hibernate抽取工具类
 * @author Administrator
 *
 */
public class HibernateUtils {
    // 1.Hiberante框架加载核心配置文件(有数据库连接信息)
    public static Configuration configuration;
    public static SessionFactory sessionFactory;
    public static ServiceRegistry serviceRegistry;

    // 使用静态代码块初始化类 - 加载核心配置文件以及创建一个sessionFactory
    static{
        configuration = new Configuration().configure();
        serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static Session openSession(){
        return sessionFactory.openSession();
    }
    
    public static void main(String[] args) {
    	openSession();
    }
}
