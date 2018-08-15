package com.baihoo.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baihoo.mybatis.pojo.BhProduct;

public class BhProductMapperTest {


	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void initialize() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	/**
	 * 测试插入
	 */
	@Test
	public void testInsertBhProduct() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhProductMapper BhProductMapper = sqlSession.getMapper(BhProductMapper.class);
		BhProduct bhProduct1 = new BhProduct("豆豆", 123.12,  "1", "2");
		BhProduct bhProduct2 = new BhProduct("大米", 123.12,  "1", "2");
		BhProduct bhProduct3 = new BhProduct("香肠", 123.12,  "1", "2");
		BhProduct bhProduct4 = new BhProduct("火腿", 123.12,  "1", "2");
		BhProductMapper.insertBhProduct(bhProduct1);
		BhProductMapper.insertBhProduct(bhProduct2);
		BhProductMapper.insertBhProduct(bhProduct3);
		BhProductMapper.insertBhProduct(bhProduct4);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhProduct() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhProductMapper BhProductMapper = sqlSession.getMapper(BhProductMapper.class);
		
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhProduct() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhProductMapper BhProductMapper = sqlSession.getMapper(BhProductMapper.class);
		
		sqlSession.commit();
		sqlSession.close();
	}

}
