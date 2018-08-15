package com.baihoo.mybatis.demo3.mapper;

import java.util.List;

import com.baihoo.mybatis.pojo.SellerInfo;

/**
 * 			mapper.xml中namespace指定为mapper接口的全限定名
 * 		与该com.baihoo.mybatis.demo3.mapper.SellerInfoMapper,保持一致
 * 
		mapper开发规范	
		要想让mybatis自动创建dao接口实现类的代理对象，必须遵循一些规则：
			1.1、mapper.xml中namespace指定为mapper接口的全限定名
				此步骤目的：通过mapper.xml和mapper.java进行关联。
				
			1.2、mapper.xml中statement的id就是mapper.java中方法名
			
			1.3、mapper.xml中statement的parameterType和mapper.java中方法输入参数类型一致
			
			1.4、mapper.xml中statement的resultType和mapper.java中方法返回值类型一致.
			
 * @author Administrator
 *
 */
public interface SellerInfoMapper {
	/**
	 *  通过id查找卖家用户
	 * @param id
	 * @return
	 */
	SellerInfo findById(Integer id);
	/**
	 * 通过用户名查找list集合
	 * @param username
	 * @return
	 */
	List<SellerInfo> findByUsername(String username);
	/**
	 * 插入卖家用户信息
	 * @param sellerInfo
	 */
	void insertSellerInfo(SellerInfo sellerInfo);
	/**
	 * 删除卖家用户信息
	 * @param id
	 */
	void deleteSellerInfo(Integer id);
	/**
	 * 更新卖家用户信息
	 * @param sellerInfo
	 */
	void updateSellerInfo(SellerInfo sellerInfo);
}
