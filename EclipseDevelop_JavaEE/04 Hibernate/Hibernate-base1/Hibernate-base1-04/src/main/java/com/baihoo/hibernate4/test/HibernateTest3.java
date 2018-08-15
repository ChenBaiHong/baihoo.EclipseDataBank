package com.baihoo.hibernate4.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.baihoo.hibernate4.demo1.BhCustomer;
import com.baihoo.hibernate4.demo1.BhOrder;
import com.baihoo.utils.HibernateUtils;
/**
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class HibernateTest3 {
	
	@Test
	/**
	 * 查询缓存的测试,查询缓存可以缓存属性
	 * 		hibernate.cfg.xml 中配置
	 * 			<property name="hibernate.cache.use_query_cache">true</property><!-- 配置查询缓存 -->
	 */
	public void demo9(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("select c.cName from BhCustomer c");
		// 使用查询缓存:
		query.setCacheable(true);
		query.list();
		
		tx.commit();
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		query = session.createQuery("select c.cName from BhCustomer c");
		query.setCacheable(true);
		query.list();
		
		tx.commit();
	}
	
	
	@Test
	/**
	 * 二级缓存的更新时间戳区域:
	 * 				时间戳缓存区域存放了对于查询结果相关的表进行插入, 
	 * 				更新或删除操作的时间戳.  Hibernate 通过时间戳缓
	 * 				存区域来判断被缓存的查询结果是否过期
	 */
	public void demo8(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer BhCustomer = (BhCustomer) session.get(BhCustomer.class, 2);
		session.createQuery("update BhCustomer set cName = 'baihoo.Google' where cId = 2").executeUpdate();//更新
		
		tx.commit();
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		BhCustomer BhCustomer2 = (BhCustomer) session.get(BhCustomer.class, 2); //发送SQL查询
		
		tx.commit();
	}
	
	@Test
	/**
	 * 将内存中的数据写到硬盘 
	 * 	ehcache.xml  
	 * 			defaultCache.overflowToDisk="true"
	 * 		
	 */
	public void demo7(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		List<BhOrder> list = session.createQuery("from BhOrder").list();
		
		tx.commit();
	}
	
	@Test
	// 一级缓存的更新会同步到二级缓存:
	public void demo6(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer BhCustomer = (BhCustomer) session.get(BhCustomer.class, 1);
		BhCustomer.setcName("五更"); 
		
		tx.commit();//更新同步，到二级缓存
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		BhCustomer BhCustomer2 = (BhCustomer) session.get(BhCustomer.class, 1);//不发送SQL
		
		tx.commit();
	}
	
	
	@Test
	// iterate()方法可以查询所有信息.
	// iterate方法会发送N+1条SQL查询.但是会使用二级缓存的数据
	public void demo5(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		// N+1条SQL去查询.
		Iterator<BhCustomer> iterator = session.createQuery("from BhCustomer").iterate(); // 发送SQL.
		while(iterator.hasNext()){
			BhCustomer BhCustomer = iterator.next();
			System.out.println(BhCustomer);
		}
		
		tx.commit();
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		iterator = session.createQuery("from BhCustomer").iterate(); // 不发送SQL.
		while(iterator.hasNext()){
			BhCustomer BhCustomer = iterator.next();
			System.out.println(BhCustomer);
		}
		
		tx.commit();
	}
	
	
	@Test
	// 查询所有.Query接口的list()方法.
	// list()方法会向二级缓存中放数据,但是不会使用二级缓存中的数据.
	public void demo4(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		// 查询所有客户:
		// list方法会向二级缓存中放入数据的.
		List<BhCustomer> list = session.createQuery("from BhCustomer").list();//发送SQL.
		for (BhCustomer BhCustomer : list) {
			System.out.println(BhCustomer.getcName());
		}
		tx.commit();
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		// BhCustomer BhCustomer = (BhCustomer) session.get(BhCustomer.class, 1);// 没有发生SQL ,从二级缓存获取的数据.
		// list()方法没有使用二级缓存的数据.
		list = session.createQuery("from BhCustomer").list();//不发送SQL.
		for (BhCustomer BhCustomer : list) {
			System.out.println(BhCustomer.getcName());
		}
		
		tx.commit();
	}
	
	@Test
	/**
	 * 二级缓存的集合缓冲区特点:
	 * 		hibernate.cfg.xml 中配置
	 * 			<collection-cache usage="read-write" collection="com.baihoo.hibernate4.demo1.BhCustomer.orders"/>
	 * 
	 */
	public void demo3(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer BhCustomer = (BhCustomer) session.get(BhCustomer.class, 1);//发送SQL.
		// 查询客户的订单.
		System.out.println("订单的数量:"+BhCustomer.getOrders().size());
		
		tx.commit();
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		BhCustomer BhCustomer2 = (BhCustomer) session.get(BhCustomer.class, 1);//发送SQL.
		// 查询客户的订单.
		System.out.println("订单的数量:"+BhCustomer2.getOrders().size());
		
		tx.commit();
	}

	@Test
	// 配置二级缓存的情况
	public void demo2(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer BhCustomer1 = (BhCustomer) session.get(BhCustomer.class, 1);// 发送SQL.
		
		BhCustomer BhCustomer2 = (BhCustomer) session.get(BhCustomer.class, 1);//发送SQL.
		
		System.out.println(BhCustomer1 == BhCustomer2);
		
		tx.commit();
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		BhCustomer BhCustomer3 = (BhCustomer) session.get(BhCustomer.class, 1);// 不发送SQL.
		BhCustomer BhCustomer4 = (BhCustomer) session.get(BhCustomer.class, 1);// 不发送SQL.
		
		System.out.println(BhCustomer3 == BhCustomer4);
		
		tx.commit();
	}
	
	
	
	@Test
	// 没有配置二级缓存的情况
	public void demo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		BhCustomer BhCustomer1 = (BhCustomer) session.get(BhCustomer.class, 1);// 发送SQL.
		
		BhCustomer BhCustomer2 = (BhCustomer) session.get(BhCustomer.class, 1);// 不发送SQL.
		
		
		
		tx.commit();
		
		session = HibernateUtils.getCurrentSession();
		tx = session.beginTransaction();
		
		BhCustomer BhCustomer3 = (BhCustomer) session.get(BhCustomer.class, 1);// 发送SQL.
		
		
		tx.commit();
	}
}
