package com.baihoo.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baihoo.mybatis.pojo.BhCate;

public class BhCateMapperTest {

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
	public void testInsertBhCate() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhCateMapper BhCateMapper = sqlSession.getMapper(BhCateMapper.class);
		BhCate bhCate = new BhCate(null,null,"root2","0");
		BhCateMapper.insertBhCate(bhCate);
		System.out.println(bhCate.getId());
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhCate() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhCateMapper BhCateMapper = sqlSession.getMapper(BhCateMapper.class);
		BhCate bhCate = new BhCate(null,null,"root1","0");
		bhCate.setId("1");
		BhCateMapper.updateBhCate(bhCate);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhCate() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhCateMapper BhCateMapper = sqlSession.getMapper(BhCateMapper.class);
		
		sqlSession.commit();
		sqlSession.close();
	}

}
