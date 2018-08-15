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
	/**
	 * 测试一对多查询，查询用户及订单明细
	 * 	证明mybatis的SqlSession默认是一级缓存
	 */
	@Test
	public void testFindBhUserDtoDetailCache() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper = sqlSession.getMapper(BhUserMapper.class);
		BhUserDto bhUserDto = new BhUserDto();
		List<BhUserDto> list = bhUserMapper.findBhUserDtoDetail(bhUserDto);
		list.forEach(e -> System.out.println(e));
		
		//如若中有对对象的增删改操作，SqlSession就会清空一级缓存
		
		List<BhUserDto> list2 = bhUserMapper.findBhUserDtoDetail(bhUserDto);
		list2.forEach(e -> System.out.println(e));
		sqlSession.close();
	}
	/**
	 * 通过id查询用户，测试二级缓存
	 * 	
	 * 		验证 MyBatis 的二级缓存不适用于映射文件中存在多表查询的情况。
	 */
	@SuppressWarnings("unused")
	@Test
	public void testFindByIdCache() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper = sqlSession.getMapper(BhUserMapper.class);
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper2 = sqlSession2.getMapper(BhUserMapper.class);
		SqlSession sqlSession3 = sqlSessionFactory.openSession();
		BhUserMapper bhUserMapper3 = sqlSession3.getMapper(BhUserMapper.class);
		//第一次查询id为5的用户
		BhUserDto bhUserDto = bhUserMapper.findById("5");
		System.out.println(bhUserDto);
		//如若中有对对象的增删改操作，SqlSession就会清空二级缓存
		/*
		BhUser bhUser = new BhUser();
		bhUser.setId("5");
		bhUser.setUsername("盘古");
		bhUserMapper2.updateBhUser(bhUser);
		*/
		
		//第二次查询id为5的用户
		bhUserDto = bhUserMapper3.findById("5");
		System.out.println(bhUserDto);
		
	}
}
