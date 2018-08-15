package com.baihoo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 基于freemarker编写web应用
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/freemarker")
public class HelloWordFreemarkerController {
	
	/**
	 * modelAndView 转向视图freemarker模板的url页面
	 * @return
	 */
	@RequestMapping("/say")
	public ModelAndView say() {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("message" , "hello 你好springboot，采用freemarker模板显示！" );
		modelView.setViewName("HelloWordFreemarker");
		return modelView;
	}
}
