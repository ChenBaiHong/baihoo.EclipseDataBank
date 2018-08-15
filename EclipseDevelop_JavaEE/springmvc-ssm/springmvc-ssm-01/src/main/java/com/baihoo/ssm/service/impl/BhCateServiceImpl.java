package com.baihoo.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baihoo.ssm.mapper.BhCateMapper;
import com.baihoo.ssm.mapper.BhCateMapperCustom;
import com.baihoo.ssm.pojo.BhCate;
import com.baihoo.ssm.service.BhCateService;

@Service("bhCateService")
public class BhCateServiceImpl implements BhCateService {
	//注入
	@Autowired
	private BhCateMapper bhCateMapper;
	@Autowired
	private BhCateMapperCustom bhCateMapperCustom;
	@Override
	public List<BhCate> findByAll() throws Exception{
	
		return bhCateMapper.selectByExample(null);
	}

	@Override
	public int updateByPrimaryKey(BhCate record) throws Exception{
	
		return bhCateMapper.updateByPrimaryKey(record);
	}

}
