package com.baihoo.mybatis.demo1;

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

/**
 * 入门程序
 * @author Administrator
 *
 */
public class MybatisTest1 {
	// 会话工厂
	private SqlSessionFactory sqlSessionFactory;
	//初始化创建工厂
	@Before
	public void initialize() throws IOException {
		// 配置文件（SqlMapConfig.xml）
		String resource = "sqlMapConfig.xml";
		// 加载配置文件到输入流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建会话工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void finByIdTest(){
		// 通过sqlSessionFactory创建sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		SellerInfo sellerInfo  = null;
		try {
			sellerInfo = sqlSession.selectOne("sellerInfo.findById", 1);
			System.out.println(sellerInfo);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	@Test
	public void finByUsernameTest(){
		// 通过sqlSessionFactory创建sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		List<SellerInfo> list  = null;
		try {
			list = sqlSession.selectList("sellerInfo.findByUsername", "白");
			list.forEach(e -> System.out.println(e));;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	@Test
	public void insertBySellerInfoTest(){
		// 通过sqlSessionFactory创建sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		SellerInfo seller = new SellerInfo();
		seller.setOpenid("1237");
		seller.setPassword("123");
		seller.setUsername("lina");
		try {
			sqlSession.insert("sellerInfo.insertBySellerInfo", seller);
			System.out.println(seller.getId());
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	@Test
	public void deleteSellerInfoTest(){
		// 通过sqlSessionFactory创建sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		try {
			sqlSession.delete("sellerInfo.deleteSellerInfo", 1);
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	@Test
	public void updateSellerInfoTest(){
		// 通过sqlSessionFactory创建sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 通过sqlSession操作数据库
		// 第一个参数：statement的位置，等于namespace+statement的id
		// 第二个参数：传入的参数
		SellerInfo seller = new SellerInfo();
		seller.setId(2);
		seller.setOpenid("1237");
		seller.setPassword("123");
		seller.setUsername("tomcat");
		try {
			sqlSession.insert("sellerInfo.updateSellerInfo", seller);
			System.out.println(seller.getId());
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
}
