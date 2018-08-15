package com.baihoo.hibernate4.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.baihoo.hibernate4.demo1.BhCustomer;
import com.baihoo.utils.HibernateUtils;

/**
 * Hibernate的查询方式:SQL
 * @author Administrator
 *
 */
public class HibernateSQL {
	/**
	 * 通过映射类的注解方式使用命名SQL方式查询  
	 */
	@Test
	public void demo2() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		//Query query = session.getNamedQuery("findSqlByCId");
		//query.setParameter("id", 1).list();
		Query query = session.getNamedQuery("findSqlByAll");
		List<BhCustomer> list = query.list();
		for (BhCustomer customer : list) {
			System.out.println(customer);
		}
		tx.commit();
		session.close();
	}
	@Test
	public void demo1() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		/*
		List<Object[]> list = session.createSQLQuery("SELECT * FROM BH_CUSTOMER ")
				.list();
		
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		*/
		
		SQLQuery query = session.createSQLQuery("SELECT * FROM BH_CUSTOMER");
		query.addEntity(BhCustomer.class);
		List<BhCustomer> list = query.list();
		for (BhCustomer customer : list) {
			System.out.println(customer);
		}
		tx.commit();
		session.close();
	}
}
