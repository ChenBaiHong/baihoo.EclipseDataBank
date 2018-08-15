package com.baihoo.ssm.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.ssm.pojoCustom.BhProductCustom;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring/applicationContext.xml"})
public class BhProductMapperCustomTest extends TestCase {
	@Autowired
	BhProductMapperCustom bhProductMapperCustom;
	@Autowired
	BhProductMapper bhProductMapper;
	@Test
	public void testFindProductById() {
		//BhProduct  bhProduct =  bhProductMapper.selectByPrimaryKey(3);
		//System.out.println(bhProduct);
		BhProductCustom  bhProductCustom   = bhProductMapperCustom.findProductById(3);
		System.out.println(bhProductCustom);
	}

}
