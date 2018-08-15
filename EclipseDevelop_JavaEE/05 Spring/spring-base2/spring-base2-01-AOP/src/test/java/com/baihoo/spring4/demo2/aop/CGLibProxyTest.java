package com.baihoo.spring4.demo2.aop;

import org.junit.Test;

import com.baihoo.spring4.demo2.dao.ProductDao;

/**
 * CGLib 动态代理测试
 * @author Administrator
 *
 */
public class CGLibProxyTest {

	@Test
	public void demo1() {
		CGLibProxy<ProductDao> cg = new CGLibProxy<ProductDao>(ProductDao.class);
		ProductDao proudctDao = cg.createCGLibProxyInstance();
		proudctDao.add();
		proudctDao.update();
	}

}
