package com.baihoo.estore.console.controller.consoleCtr.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.baihoo.estore.core.utils.ResourcesUtil;
import com.baihoo.estore.pojoDto.BsEmpDto;
import com.baihoo.estore.pojoDto.BsPermDto;

/**
 * 
 * @ClassName: PermissionInterceptor
 * @Description: 授权拦截器
 * @author: Administrator
 * @date: 2018年7月29日 上午8:48:15
 */
public class PermissionInterceptor implements HandlerInterceptor {
	
	/**
	 * 在执行handler之前来执行的
	 * 用于用户认证校验、用户权限校验
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//得到请求的url
		String url = request.getRequestURI();
		
		//判断是否是公开 地址
		//实际开发中需要公开 地址配置在配置文件中
		//从配置中取逆名访问url
		List<String> open_urls = ResourcesUtil.gekeyList("anonymousURL");
		//遍历公开 地址，如果是公开 地址则放行
		for(String open_url:open_urls){
			if(url.indexOf(open_url)>=0){
				//如果是公开 地址则放行
				return true;
			}
		}
		//从配置文件中获取公共访问地址
		List<String> common_urls = ResourcesUtil.gekeyList("commonURL");
		//遍历公用 地址，如果是公用 地址则放行
		for(String common_url:common_urls){
			if(url.indexOf(common_url)>=0){
				//如果是公开 地址则放行
				return true;
			}
		}
		//获取session
		HttpSession session = request.getSession();
		BsEmpDto emp = (BsEmpDto) session.getAttribute("activeEmp");
		//从session中取权限范围的url
		List<BsPermDto> permissions = emp.getPermissions();
		for(BsPermDto  bsPermDto:permissions){
			//权限的url
			String permission_url = bsPermDto.getUrl();
			
			if(permission_url !=null && url.indexOf(permission_url)>=0){
				//如果是权限的url 地址则放行
				return true;
			}
		}
		return false;
	}

	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}



}
