package com.baihoo.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baihoo.mybatis.pojo.BhBrand;

public class BhBrandMapperTest {
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
	public void testInsertBhBrand() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhBrandMapper bhBrandMapper = sqlSession.getMapper(BhBrandMapper.class);
		BhBrand bhBrand = new BhBrand("京东到家" ,"哦哦哦");
		BhBrand bhBrand2 = new BhBrand("联邦蔬菜" ,"哦哦哦");
		bhBrandMapper.insertBhBrand(bhBrand);
		bhBrandMapper.insertBhBrand(bhBrand2);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhBrand() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhBrandMapper bhBrandMapper = sqlSession.getMapper(BhBrandMapper.class);
		BhBrand bhBrand = new BhBrand("京东到家" ,"哦哦哦");
		bhBrand.setId("1");
		bhBrandMapper.updateBhBrand(bhBrand);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhBrand() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhBrandMapper bhBrandMapper = sqlSession.getMapper(BhBrandMapper.class);
		BhBrand bhBrand = new BhBrand("1");
		bhBrandMapper.deleteBhBrand(bhBrand);
		sqlSession.commit();
		sqlSession.close();
	}

}
