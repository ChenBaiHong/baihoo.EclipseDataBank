package com.baihoo.estore.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.baihoo.estore.core.base.BaseDto;
import com.baihoo.estore.core.exception.CustomException;
import com.baihoo.estore.dao.EstBsEmpDao;
import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.pojoCustom.BsEmpCustom;
import com.baihoo.estore.service.EstBsEmpService;

/**
 * 
 * @ClassName: EstBsEmpServiceImpl
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月28日 下午3:18:15
 */
@Service("estBsEmpService")
public class EstBsEmpServiceImpl implements EstBsEmpService{
	
	//注入dao实体类
	@Autowired
	@Qualifier("estBsEmpDao")
	private EstBsEmpDao estBsEmpDao;
	/**
	 * 保存员工
	 */
	public void save(EstBsEmp t) throws Exception {
		estBsEmpDao.save(t);
		
	}
	public void update(Serializable id, EstBsEmp t) throws Exception {
		if(id!=null) {
			estBsEmpDao.update(t);
		}else {
			throw new  CustomException("用户id不能为空");
		}
		
	}
	public void delete(Serializable id, EstBsEmp t) throws Exception {
		if(id!=null) {
			estBsEmpDao.delete(t);
		}else {
			throw new  CustomException("用户id不能为空");
		}
	}

	
	public List<EstBsEmp> findAll() throws Exception {
		
		return estBsEmpDao.findAll();
	}

	
	public EstBsEmp findById(Serializable uuid) throws Exception {
		
		return estBsEmpDao.findById(uuid);
	}

	
	public List<EstBsEmp> findAll(BaseDto bDto, Integer currentPage, Integer pageDataCount) throws Exception {
		
		return estBsEmpDao.findAll(bDto, currentPage, pageDataCount);
	}

	
	public Integer findByIsCount(BaseDto bDto) throws Exception {
		
		return estBsEmpDao.findByIsCount(bDto);
	}
	/**
	 * 
	 */
	public BsEmpCustom findByEmpAndPwd(String loginname, String loginpwd)  throws Exception {
		if(loginname ==null || loginpwd==null || "".equals(loginname) || "".equals(loginpwd)) {
			return null;
		}
		return estBsEmpDao.findByEmpCodeOrNameOrLoginAndPwd(loginname, loginpwd);
	}

}
