package com.baihoo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.baihoo.springboot.pojo.BhAccount;

/**
*  BhAccount实体向上实现的dao层操作接口其继承的（SpringBoot框架支持提供）JpaRepository涉及到泛型传参有必要解释下
*      JpaRepository<T, ID> 表映射的实体，实体映射表的主键id
*
*  其JpaRepository 简单说明一下相当于spring框架提供的hibernateTemplate ，留个印象
*  
*  JpaSpecificationExecutor 可以實現對對象動態查詢
*/
public interface BhAccountRepository extends JpaRepository<BhAccount , Integer> , JpaSpecificationExecutor<BhAccount>{
	
}
