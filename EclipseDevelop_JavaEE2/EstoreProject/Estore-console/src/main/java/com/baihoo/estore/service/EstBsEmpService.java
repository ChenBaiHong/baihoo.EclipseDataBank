package com.baihoo.estore.service;

import com.baihoo.estore.core.base.BaseEbo;
import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.pojoCustom.BsEmpCustom;

/**
 * 
 * @ClassName: EstBsEmpService
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月28日 下午3:16:06
 */
public interface EstBsEmpService extends BaseEbo<EstBsEmp> {
	/**
	 * 通过登陆名称或真实姓名或员工编号和密码登陆
	 * @param loginname
	 * @param loginpwd
	 * @return
	 */
	BsEmpCustom  findByEmpAndPwd(String loginname , String loginpwd) throws Exception;
}
