package com.baihoo.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baihoo.shiro.mapper.BhCateMapper;
import com.baihoo.shiro.mapper.BhCateMapperCustom;
import com.baihoo.shiro.pojo.BhCate;
import com.baihoo.shiro.service.BhCateService;

@Service("bhCateService")
public class BhCateServiceImpl implements BhCateService {
	//注入
	@Autowired
	private BhCateMapper bhCateMapper;
	@Autowired
	private BhCateMapperCustom bhCateMapperCustom;
	@Override
	public List<BhCate> findByAll()throws Exception{
	
		return bhCateMapper.selectByExample(null);
	}

	@Override
	public int updateByPrimaryKey(BhCate record)throws Exception{
	
		return bhCateMapper.updateByPrimaryKey(record);
	}

}
