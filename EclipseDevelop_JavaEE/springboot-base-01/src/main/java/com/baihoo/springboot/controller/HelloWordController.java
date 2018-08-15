package com.baihoo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baihoo.springboot.properties.MysqProperties;
import com.baihoo.springboot.yml.MysqlYml;

/**
 * 第一个springboot程序
 * @author Administrator
 *
 */
@RestController //响应json格式数据
@Controller
@RequestMapping("hwc")
public class HelloWordController {
	@Autowired
	MysqProperties mysqProperties; 
	@Autowired
	MysqlYml mysqlYml; 
	@ResponseBody	//声明返回的不是url地址，是响应json格式数据
	@GetMapping("/say")
	public String say() {
		System.out.println(mysqProperties);
		System.out.println(mysqlYml);
		return "springboot hello Word!!!";
	}
}
