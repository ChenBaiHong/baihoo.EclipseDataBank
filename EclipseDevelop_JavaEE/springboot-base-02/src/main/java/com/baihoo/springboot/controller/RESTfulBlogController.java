package com.baihoo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * RESTful 形式参数的传递与访问
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/blog")
public class RESTfulBlogController {

	@RequestMapping("/show/{id}")
	public ModelAndView show(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("id" , id);
		mav.addObject("baiHoo" , "baiHoo");
		mav.setViewName("RESTfulBlog");
		return mav;
	}
}
