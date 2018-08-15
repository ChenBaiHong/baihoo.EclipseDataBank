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

import com.baihoo.mybatis.pojo.BhUser;
import com.baihoo.mybatis.pojoDto.BhUserDto;
/**
 * 
 * @author Administrator
 *
 */
public class BhUserMapperTest{
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void initialize() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	/**
	 * 测试插入用户
	 */
	@Test
	public void testInsertBhUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper = sqlSession.getMapper(BhUserMapper.class);
		BhUser bhUser = new BhUser();
		bhUser.setAddress("china");
		bhUser.setBirth(new Date());
		bhUser.setPassword("123");
		bhUser.setUsername("baiHoo.good");
		bhUserMapper.insertBhUser(bhUser);
		System.out.println(bhUser.getId());
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试更新用户
	 */
	@Test
	public void testUpdateBhUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper = sqlSession.getMapper(BhUserMapper.class);
		BhUser bhUser = new BhUser();
		bhUser.setId("5");
		bhUser.setAddress("china");
		bhUser.setBirth(new Date());
		bhUser.setPassword("123");
		bhUser.setUsername("蚩尤");
		bhUserMapper.updateBhUser(bhUser);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试删除用户
	 */
	@Test
	public void testDeleteBhUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper = sqlSession.getMapper(BhUserMapper.class);
		BhUser bhUser = new BhUser();
		bhUser.setId("2");
		bhUserMapper.deleteBhUser(bhUser);
		sqlSession.commit();
		sqlSession.close();
	}
	/**
	 * 测试一对多查询，查询用户及订单明细
	 */
	@Test
	public void testFindBhUserDtoDetail() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper = sqlSession.getMapper(BhUserMapper.class);
		BhUserDto bhUserDto = new BhUserDto();
		List<BhUserDto> list = bhUserMapper.findBhUserDtoDetail(bhUserDto);
		list.forEach(e -> System.out.println(e));
		sqlSession.close();
	}
}
