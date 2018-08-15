package com.baihoo.mybatis.demo2.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.baihoo.mybatis.demo2.dao.SellerInfoDao;
import com.baihoo.mybatis.pojo.SellerInfo;

/**
 * 
 * @author Administrator
 *
 */
public class SellerInfoDaoImpl implements SellerInfoDao {
	
	private SqlSessionFactory sqlSessionFactory;

	/**
	 * 		将 SqlSessionFactory 注入，正常开发时，以单例方式管理sqlSessionFactory
	 * 	由于sqlSession是线程不安全，所以SqlSessionFactory.openSession() 方法获
	 * 	取的sqlSession最佳应用范围在方法体内
	 * @param  sqlSessionFactory
	 */
	public SellerInfoDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	@Override
	public SellerInfo findById(Integer id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SellerInfo sellerInfo = sqlSession.selectOne("sellerInfo.findById", id);
		sqlSession.close();
		return sellerInfo;
	}
	@Override
	public List<SellerInfo> findByUsername(String username) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<SellerInfo> list = sqlSession.selectList("sellerInfo.findByUsername",username);
		sqlSession.close();
		return list;
	}

}
