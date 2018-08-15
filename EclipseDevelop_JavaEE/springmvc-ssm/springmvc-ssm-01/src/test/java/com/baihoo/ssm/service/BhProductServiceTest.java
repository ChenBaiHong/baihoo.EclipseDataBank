package com.baihoo.ssm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.ssm.pojoCustom.BhProductCustom;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring/applicationContext.xml"})
public class BhProductServiceTest {
	@Autowired
	@Qualifier("bhProductService")
	private BhProductService bhProductService;
	@Test
	public void testUpdateBhProduct() throws Exception {
		//调用service接口更新商品信息
		int val = bhProductService.updateBhProduct(1, new BhProductCustom());
		System.out.println(val);
	}

}
