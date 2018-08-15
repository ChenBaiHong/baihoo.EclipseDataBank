package com.baihoo.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baihoo.shiro.service.BhUserService;

/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/loginAjax")
public class LoginAjaxController {
		
		private BhUserService bhUserService;
}
