package com.baihoo.shiro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户登陆
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	
		/**
		 * 
		 * @return
		 */
		@RequestMapping("/targetLogin")
		public String targetLogin() {
			
			return "login";
		}
		/**
		 * 用户登陆
		 * @param session
		 * @param user
		 * @return
		 * @throws Exception
		 */
	@RequestMapping("/userLogin")
	public String userLogin(HttpSession session, String username, String password) throws Exception {
		String usercode = null;
		
		//调用service校验用户账号和密码的正确性
		//..
		
		//如果service校验通过，将用户身份记录到session
		if (username != null && password != null && !"".equals(username.trim()) && !"".equals(password.trim())) {
			usercode = username + "&" + password;
			//重定向到商品查询页面
			session.setAttribute("usercode", usercode);
		}else {
			return "login";
		}
		return "redirect:/prod/queryProdList.do";
	}
	/**
	 * 用户退出
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userLogout")
	public String userLogout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/prod/queryProdList.do";
	}
}
