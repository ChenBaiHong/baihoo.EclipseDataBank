package com.baihoo.mybatis.demo5.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baihoo.mybatis.pojo.SellerInfo;
import com.baihoo.mybatis.pojo.SellerInfoCustom;
import com.baihoo.mybatis.pojo.SellerInfoQueryVo;
/**
 * 测试mybatis的动态代理形式
 * @author Administrator
 *
 */
public class SellerInfoMapperTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void initialize() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	/**
	 * 别名返回类型测试
	 */
	@Test
	public void testFindById() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfoMapper sellerInfoMapper = sqlSession.getMapper(SellerInfoMapper.class);
		SellerInfo sellerInfo= sellerInfoMapper.findById(4);
		sqlSession.close();
		System.out.println(sellerInfo);
	}
	/**
	 * 别名返回类型测试
	 */
	@Test
	public void testFindByUsername() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfoMapper sellerInfoMapper = sqlSession.getMapper(SellerInfoMapper.class);
		List<SellerInfo> list= sellerInfoMapper.findByUsername("白");
		sqlSession.close();
		list.forEach(e -> System.out.println(e));
	}

	@Test
	public void testInsertSellerInfo() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfoMapper sellerInfoMapper = sqlSession.getMapper(SellerInfoMapper.class);
		SellerInfo sellerInfo = new SellerInfo();
		sellerInfo.setUsername("白居易");
		sellerInfo.setOpenid("1236");
		sellerInfo.setPassword("123");
		sellerInfoMapper.insertSellerInfo(sellerInfo);
		sqlSession.commit();
	}

	@Test
	public void testDeleteSellerInfo() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfoMapper sellerInfoMapper = sqlSession.getMapper(SellerInfoMapper.class);
		sellerInfoMapper.deleteSellerInfo(7);
		sqlSession.commit();
	}

	@Test
	public void testUpdateSellerInfo() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfoMapper sellerInfoMapper = sqlSession.getMapper(SellerInfoMapper.class);
		SellerInfo sellerInfo = new SellerInfo();
		sellerInfo.setId(2);
		sellerInfo.setUsername("青衣居士");
		sellerInfo.setOpenid("1236");
		sellerInfo.setPassword("123");
		sellerInfoMapper.updateSellerInfo(sellerInfo);
		sqlSession.commit();
	}
	@Test
	public void testFindSellerInfoList() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfoMapper sellerInfoMapper = sqlSession.getMapper(SellerInfoMapper.class);
		SellerInfoQueryVo sellerInfoQueryVo = new SellerInfoQueryVo();
		SellerInfoCustom sellerInfoCustom = new SellerInfoCustom();
		sellerInfoCustom.setUsername("白");
		sellerInfoQueryVo.setSellerInfoCustom(sellerInfoCustom);
		List<SellerInfo> list= sellerInfoMapper.findSellerInfoList(sellerInfoQueryVo);
		sqlSession.close();
		list.forEach(e -> System.out.println(e));
	}
	@Test
	public void testFindSellerInfoCount() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfoMapper sellerInfoMapper = sqlSession.getMapper(SellerInfoMapper.class);
		SellerInfoQueryVo sellerInfoQueryVo = new SellerInfoQueryVo();
		SellerInfoCustom sellerInfoCustom = new SellerInfoCustom();
		sellerInfoCustom.setUsername("白");
		sellerInfoQueryVo.setSellerInfoCustom(sellerInfoCustom);
		int count= sellerInfoMapper.findSellerInfoCount(sellerInfoQueryVo);
		sqlSession.close();
		System.out.println(count);
	}
	
}
