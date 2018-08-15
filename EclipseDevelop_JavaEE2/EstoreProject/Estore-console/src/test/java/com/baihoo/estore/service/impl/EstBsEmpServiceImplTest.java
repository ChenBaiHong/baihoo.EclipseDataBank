package com.baihoo.estore.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.pojoDto.BsEmpDto;
import com.baihoo.estore.service.EstBsEmpService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class EstBsEmpServiceImplTest {
	@Autowired
	@Qualifier("estBsEmpService")
	private EstBsEmpService estBsEmpService;
	
	@Test
	public void testSave()  {
		EstBsEmp estBs = new EstBsEmp();
		estBs.setEmpName("baihoo");
		estBs.setEmpPwd("12345");
		estBs.setEmpCode("BH1236");
		estBs.setEmpType("1");
		estBs.setLoginName("baihoo");
		try {
			estBsEmpService.save(estBs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testUpdate() {
		
	}

	public void testDelete() {
		
	}
	@Test
	public void testFindById() {
		try {
			BsEmpDto empDto = new BsEmpDto();
			empDto.setLoginName("baihoo");
			empDto.setEstBsEmpId(1);
			List<EstBsEmp> list = estBsEmpService.findAll(null, 1, 3);
			list.forEach(e -> System.out.println(e.getLoginName()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
