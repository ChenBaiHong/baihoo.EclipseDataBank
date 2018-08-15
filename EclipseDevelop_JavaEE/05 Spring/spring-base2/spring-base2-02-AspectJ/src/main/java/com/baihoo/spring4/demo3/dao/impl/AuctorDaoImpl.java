package com.baihoo.spring4.demo3.dao.impl;

import com.baihoo.spring4.demo3.dao.AuctorDao;

public class AuctorDaoImpl implements AuctorDao{

	@Override
	public Integer addAuctor() {
		try {
			System.out.println(this.getClass().getName()+".addAuctor()"+"。。。。。。");
		}finally {
			System.out.println("。。。。。。最终该方法执行。。。。。。");
		}
		return 2;
	}

	@Override
	public void updateAuctor() {
		System.out.println(this.getClass().getName()+".updateAuctor()"+"。。。。。。");
		
	}

	@Override
	public void deleteAuctor() {
		int i = 1/0;
		System.out.println(this.getClass().getName()+".deleteAuctor()"+"。。。。。。");
		
	}

	@Override
	public void findAuctor() {
		System.out.println(this.getClass().getName()+".findAuctor()"+"。。。。。。");	
	}

}
