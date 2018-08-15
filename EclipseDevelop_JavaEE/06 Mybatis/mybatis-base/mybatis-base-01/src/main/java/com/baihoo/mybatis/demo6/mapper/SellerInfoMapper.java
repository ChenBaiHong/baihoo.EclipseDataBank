package com.baihoo.mybatis.demo6.mapper;

import java.util.List;

import com.baihoo.mybatis.pojo.SellerInfo;
import com.baihoo.mybatis.pojo.SellerInfoQueryVo;

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
			
		
		通过class引用mapper接口 
		class：配置mapper接口全限定名
		
		要求：需要mapper.xml和mapper.java同名并且在一个目录中
			
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
	
	/**
	 * 通过sellerInfoQueryVo包装类型下的sellerInfoCustom.用户名查找list集合
	 * @param username
	 * @return
	 */
	List<SellerInfo> findSellerInfoList(SellerInfoQueryVo sellerInfoQueryVo);
	/**
	 * 通过sellerInfoQueryVo包装类型下的sellerInfoCustom.用户名查找，个数
	 * @param sellerInfoQueryVo
	 * @return
	 */
	int findSellerInfoCount(SellerInfoQueryVo sellerInfoQueryVo);
	/**
	 * 通过mapper.xml中resultMap映射查询出结果集
	 * @param sellerInfoQueryVo
	 * @return
	 */
	List<SellerInfo> findSellerInfoListResultMap(SellerInfoQueryVo sellerInfoQueryVo);
}
