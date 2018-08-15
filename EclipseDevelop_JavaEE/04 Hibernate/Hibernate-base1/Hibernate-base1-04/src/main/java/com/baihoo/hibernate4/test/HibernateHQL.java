package com.baihoo.hibernate4.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.baihoo.hibernate4.demo1.BhCustomer;
import com.baihoo.hibernate4.demo1.BhOrder;
import com.baihoo.utils.HibernateUtils;


/**
 * Hibernate的检索方式的测试类:HQL
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class HibernateHQL {
	@Test
	// 命名查询:
	public void demo12(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		//List<BhCustomer> list = session.getNamedQuery("findHqlByAll").list();
		List<BhCustomer> list = session.getNamedQuery("findHqlByCId").setParameter("id", 1).list();
		for (BhCustomer customer : list) {
			System.out.println(customer);
		}
		tx.commit();
		session.close();
	}
	
	@Test
	// 投影查询:
	public void demo11(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		// 只查询所有客户的名称:
		/*Query query = session.createQuery("select c.cName from BhCustomer c");
		List<String> list = query.list();
		for (String name : list) {
			System.out.println(name);
		}*/
		
		// 查询多个属性
		/*Query query = session.createQuery("select c.cId , c.cName from NhCustomer c");
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}*/
		
		// 构造器查询.
		Query query = session.createQuery("select new BhCustomer(cId,cName) from BhCustomer");
		List<BhCustomer> list = query.list();
		for (BhCustomer customer : list) {
			System.out.println(customer);
		}
		tx.commit();
		session.close();
	}
	
	@Test
	// 连接查询:
	public void demo10(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		/*
		// 普通内连接:将数据封装到List<Object[]>
		Query query = session.createQuery("from BhCustomer c inner join c.orders");
		query.list();
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}*/
		
		// 迫切内连接 使用distinct去掉重复值.
		Query query = session.createQuery("select distinct c from BhCustomer c inner join fetch c.orders");
		List<BhCustomer> list = query.list();
		
		for (BhCustomer customer : list) {
			System.out.println(customer);
		}
		tx.commit();
		session.close();
	}
	
	@Test
	// 聚集函数查询:
	public void demo9() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Integer id = (Integer) session.createQuery("select max(cId) from BhCustomer").uniqueResult();
		
		Long count = (Long) session.createQuery("select count(*) from BhCustomer").uniqueResult();
		
		List list = session.createQuery("select count(*) from BhOrder o group by o.customer.cId").list();
		
		System.out.println(id);
		System.out.println(count);
		System.out.println(list);
		
		tx.commit();
		session.close();
	}
	
	@Test
	// 条件查询:
	public void demo8() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		// 按位置绑定参数
		// List<BhCustomer> list =
		// session.createQuery("from BhCustomer where cName = ?").setParameter(0,
		// "美美").list();
		// List<BhCustomer> list
		// =session.createQuery("from BhCustomer where cName = ? and cId = ?")
		// .setParameter(0, "美美").setParameter(1, 2).list();

		// 按名称绑定参数:
		/*Query query = session
				.createQuery("from BhCustomer where cName = :cname and cId = :cid");
		query.setParameter("cname", "baihoo.god");
		query.setParameter("cid", 3);*/
		
		Query query = session.createQuery("from BhCustomer where cName like ?");
		query.setParameter(0, "%baih%");
		List<BhCustomer> list = query.list();
		
		System.out.println(list);

		tx.commit();
		session.close();
	}

	@Test
	// 唯一结果查询
	public void demo7() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		/*
		 * Customer customer = (Customer) session
		 * .createQuery("from Customer where id = ?").setParameter(0, 1)
		 * .uniqueResult(); System.out.println(customer);
		 */

		Long count = (Long) session.createQuery("select count(*) from BhOrder")
				.uniqueResult();
		System.out.println(count);

		tx.commit();
		session.close();
	}

	@Test
	// 分页查询
	public void demo6() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("from BhOrder");
		query.setFirstResult(20);// 从哪开始的.
		query.setMaxResults(10);// 每页显示多少条
		List<BhOrder> list = query.list();
		for (BhOrder order : list) {
			System.out.println(order);
		}
		tx.commit();
		session.close();
	}

	@Test
	// 排序查询
	public void demo5() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		List<BhCustomer> list = session.createQuery(
				"from BhCustomer c order by c.cId desc").list();
		for (BhCustomer customer : list) {
			System.out.println(customer);
		}
		tx.commit();
		session.close();
	}

	@Test
	// HQL:多态查询:
	public void demo4() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		List list = session.createQuery("from java.lang.Object").list();
		System.out.println(list);

		tx.commit();
		session.close();
	}

	@Test
	// HQL:使用别名的检索方式:
	public void demo3() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		// 使用as 起别名
		// List<Customer> list =
		// session.createQuery("from BhCustomer as c").list();
		// as可以省略
		// List<Customer> list = session.createQuery("from BhCustomer c").list();
		// 条件中使用别名
		// List<Customer> list =
		// session.createQuery("from BhCustomer c where c.cname = ?").setParameter(0,
		// "美美").list();
		// HQL中不能select 后 写*号
		List<BhCustomer> list = session.createQuery("select c from BhCustomer c")
				.list();

		for (BhCustomer customer : list) {
			System.out.println(customer);
		}

		tx.commit();
		session.close();
	}

	@Test
	// HQL检索:简单查询
	public void demo2() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		// 简单查询
		// List<Customer> list = session.createQuery("from Customer").list();
		List<BhCustomer> list = session.createQuery("from BhCustomer where cName = ?").setParameter(0, "baihoo.god").list();
		for (BhCustomer customer : list) {
			System.out.println(customer);
		}

		tx.commit();
		session.close();
	}

	@Test
	// 初始化数据:
	public void demo1() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		BhCustomer customer = new BhCustomer();
		customer.setcName("baihoo.god");

		for (int i = 1; i <= 20; i++) {
			BhOrder order = new BhOrder();
			order.setAddr("南天门" + i);

			order.setCustomer(customer);
			customer.getOrders().add(order);

			session.save(order);
		}
		session.save(customer);
		tx.commit();
		session.close();
	}
}
