package com.baihoo.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baihoo.mybatis.pojo.BhOrderItem;
import com.baihoo.mybatis.pojoDto.BhOrderItemDto;


public class BhOrderItemMapperTest {

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
	public void testInsertBhOrderItem() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrderItemMapper BhOrderItemMapper = sqlSession.getMapper(BhOrderItemMapper.class);
		BhOrderItem bhOrderItem = new BhOrderItem("1",123.1, 123.1, "1", "1");
		BhOrderItem bhOrderItem2 = new BhOrderItem("1",123.1, 123.1, "2", "1");
		BhOrderItem bhOrderItem3 = new BhOrderItem("1",123.1, 123.1, "3", "2");
		BhOrderItem bhOrderItem4 = new BhOrderItem("1",123.1, 123.1, "4", "2");
		BhOrderItemMapper.insertBhOrderItem(bhOrderItem);
		BhOrderItemMapper.insertBhOrderItem(bhOrderItem2);
		BhOrderItemMapper.insertBhOrderItem(bhOrderItem3);
		BhOrderItemMapper.insertBhOrderItem(bhOrderItem4);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhOrderItem() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrderItemMapper BhOrderItemMapper = sqlSession.getMapper(BhOrderItemMapper.class);
		
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhOrderItem() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrderItemMapper BhOrderItemMapper = sqlSession.getMapper(BhOrderItemMapper.class);
		
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试订单项，复杂一对一查询
	 */
	@Test
	public void testFindOrderItemDetail(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrderItemMapper BhOrderItemMapper = sqlSession.getMapper(BhOrderItemMapper.class);
		BhOrderItemDto bhOrderItemDto = new BhOrderItemDto();
		List<BhOrderItemDto> list = BhOrderItemMapper.findOrderItemDetail(bhOrderItemDto);
		
		list.forEach(e -> System.out.println(e));
		sqlSession.close();
	}
	/**
	 * 通过定id查询订单项
	 */
	@Test
	public void testFindByOid() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhOrderItemMapper BhOrderItemMapper = sqlSession.getMapper(BhOrderItemMapper.class);
		List<BhOrderItemDto> list = BhOrderItemMapper.findByOid("1");
		
		list.forEach(e -> System.out.println(e));
		sqlSession.close();
	}
}
