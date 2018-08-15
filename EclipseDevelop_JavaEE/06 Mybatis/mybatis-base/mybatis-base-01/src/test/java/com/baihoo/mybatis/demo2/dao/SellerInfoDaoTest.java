package com.baihoo.mybatis.demo2.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baihoo.mybatis.demo2.dao.impl.SellerInfoDaoImpl;
import com.baihoo.mybatis.pojo.SellerInfo;
/**
 * 测试SellerInfoDao
 * 
 * @Date 2018-7-18 23:13
 * @author Administrator
 *
 */
public class SellerInfoDaoTest {
	private SqlSessionFactory sqlSessionFactory;
	private SellerInfoDao sellerInfoDao;
	@Before
	public void initialize() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sellerInfoDao = new SellerInfoDaoImpl(sqlSessionFactory);
	}
	@Test
	public void testFindById() {
		SellerInfo sellerInfo = sellerInfoDao.findById(2);
		System.out.println(sellerInfo);
	}

	@Test
	public void testFindByUsername() {
		List<SellerInfo> list = sellerInfoDao.findByUsername("白");
		list.forEach(e ->System.out.println(e));
	}

}
