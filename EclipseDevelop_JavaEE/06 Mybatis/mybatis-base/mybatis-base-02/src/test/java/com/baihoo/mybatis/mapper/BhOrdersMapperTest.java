package com.baihoo.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baihoo.mybatis.pojo.BhOrders;
import com.baihoo.mybatis.pojoDto.BhOrdersDto;

public class BhOrdersMapperTest {

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
	public void testInsertBhOrders() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrdersMapper BhOrdersMapper = sqlSession.getMapper(BhOrdersMapper.class);
		BhOrders bhOrders = new BhOrders("5", new Date(),246.2 , "1");
		BhOrders bhOrders2 = new BhOrders("5", new Date(),246.2 , "1");
		BhOrdersMapper.insertBhOrders(bhOrders);
		BhOrdersMapper.insertBhOrders(bhOrders2);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhOrders() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrdersMapper BhOrdersMapper = sqlSession.getMapper(BhOrdersMapper.class);
		
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhOrders() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrdersMapper BhOrdersMapper = sqlSession.getMapper(BhOrdersMapper.class);
		
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试：
	 * 		订单下含有多个订单项，一对多的关系 查询订单明细
	 */
	@Test
	public void testFindOrdersDetail() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrdersMapper BhOrdersMapper = sqlSession.getMapper(BhOrdersMapper.class);
		BhOrdersDto bhOrdersDto = new BhOrdersDto();
		List<BhOrdersDto> list = BhOrdersMapper.findOrdersDetail(bhOrdersDto);
		
		list.forEach(e -> System.out.println(e));
		sqlSession.close();
	}
	/**
	 * 测试：
	 * 		懒加载查询订单用户及订单明细
	 */
	@Test
	public void testFindOrdersDetailLazyLoading() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrdersMapper BhOrdersMapper = sqlSession.getMapper(BhOrdersMapper.class);
		BhOrdersDto bhOrdersDto = new BhOrdersDto();
		List<BhOrdersDto> list = BhOrdersMapper.findOrdersDetailLazyLoading(bhOrdersDto);
		
		System.out.println(list.get(0).getBhUserDto());
		System.out.println(list.get(0).getOiList());
		sqlSession.close();
	}
}
