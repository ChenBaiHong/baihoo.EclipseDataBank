package com.baihoo.springboot.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baihoo.springboot.yml.PersonYml;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootBase01ApplicationTests {
	@Resource
	private PersonYml personYml;
	@Test
	public void contextLoads() {
		System.out.println(personYml);
	}

}
