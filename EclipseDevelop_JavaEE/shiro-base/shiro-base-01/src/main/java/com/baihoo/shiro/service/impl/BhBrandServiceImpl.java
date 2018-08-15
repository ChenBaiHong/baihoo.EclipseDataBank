package com.baihoo.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baihoo.shiro.mapper.BhBrandMapper;
import com.baihoo.shiro.mapper.BhBrandMapperCustom;
import com.baihoo.shiro.pojo.BhBrand;
import com.baihoo.shiro.service.BhBrandService;

@Service("bhBrandService")
public class BhBrandServiceImpl implements BhBrandService {

	//注入
	@Autowired
	private BhBrandMapper bhBrandMapper;
	@Autowired
	private BhBrandMapperCustom bhBrandMapperCustom;
	
	public List<BhBrand> findByAll()  throws Exception{
		return bhBrandMapper.selectByExample(null);
	}

	
	public int updateByPrimaryKey(BhBrand record)throws Exception{
	
		return bhBrandMapper.updateByPrimaryKey(record);
	}


}
