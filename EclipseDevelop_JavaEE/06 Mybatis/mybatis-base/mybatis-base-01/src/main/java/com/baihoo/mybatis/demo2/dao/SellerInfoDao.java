package com.baihoo.mybatis.demo2.dao;

import java.util.List;

import com.baihoo.mybatis.pojo.SellerInfo;

/**
 * dao层卖家用户管理
 * @author Administrator
 *
 */
public interface SellerInfoDao {
	
	SellerInfo findById(Integer id);
	List<SellerInfo> findByUsername(String username);
}
