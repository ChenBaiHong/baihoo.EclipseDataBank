package com.baihoo.estore.console.controller.consoleCtr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName: ConsoleController
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月28日 下午11:43:57
 */
@Controller
@RequestMapping("/console")
public class ConsoleController {
		/**
		 * 后台登陆首页
		 * @param request
		 * @param response
		 * @return
		 * @throws Exception
		 */
		@GetMapping("/index")
		public ModelAndView index(HttpServletRequest request , HttpServletResponse response) throws Exception {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("EstConsole/index");
			return mav;
		}
		/**
		 * 后台登陆默認主頁
		 * @param request
		 * @param response
		 * @return
		 * @throws Exception
		 */
		@GetMapping("/defaultMain")
		public String defaultMain(HttpServletRequest request , HttpServletResponse response) throws Exception {
			return "EstConsole/defaultMain";
		}
}
