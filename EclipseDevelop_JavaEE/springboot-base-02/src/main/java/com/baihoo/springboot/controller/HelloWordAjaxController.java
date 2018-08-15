package com.baihoo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Administrator
 *
 */
@RestController
//@Controller
@RequestMapping("/ajax")
public class HelloWordAjaxController {
	/**
	 * 响应ajax数据
	 * @return
	 */
	//@ResponseBody
	@RequestMapping("/say")
	public String say() {
		String str="{'message':'hello 你好springboot，采用freemarker模板显示！'}";
		
		return str;
	}
}
