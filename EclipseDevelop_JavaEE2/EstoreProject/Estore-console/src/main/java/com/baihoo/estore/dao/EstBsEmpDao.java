package com.baihoo.estore.dao;

import com.baihoo.estore.core.base.BaseDao;
import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.pojoCustom.BsEmpCustom;
/**
 * 
 * @ClassName: EstBsEmpDao
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月28日 下午2:49:58
 */
public interface EstBsEmpDao extends BaseDao<EstBsEmp> {
	
	/**
	 * 通过登陆名称或真实姓名或员工编号和密码登陆
	 * @param loginname
	 * @param loginpwd
	 * @return
	 */
	BsEmpCustom findByEmpCodeOrNameOrLoginAndPwd(String loginname , String loginpwd) throws Exception;

}
