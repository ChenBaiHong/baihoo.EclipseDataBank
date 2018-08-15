package com.baihoo.estore.console.controller.estBsEmpCtr;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baihoo.estore.core.utils.DateUtils;
import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.pojoCustom.BsEmpCustom;
import com.baihoo.estore.service.EstBsEmpService;

/**
 * 
 * @ClassName: EstBsEmpController
 * @Description: 员工操作控制层
 * @author: Administrator
 * @date: 2018年7月28日 下午6:15:40
 */
@Controller
@RequestMapping("/estBsEmpAjax")
public class EstBsEmpAjaxController {
	
	@Autowired
	@Qualifier("estBsEmpService")
	private EstBsEmpService estBsEmpService;

	/**
	 * 用户登陆ajax校验
	 * @param emp
	 * @return
	 * @throws Exception 
	 */ 
	@RequestMapping(value = "/ajaxLoginValid" , method=RequestMethod.POST)
	public @ResponseBody String ajaxLoginValid(HttpSession session , EstBsEmp emp) throws Exception {
		if(emp!=null) {
			String loginName=emp.getLoginName();
			String password = emp.getEmpPwd();
			BsEmpCustom empCustom= estBsEmpService.findByEmpAndPwd(loginName, password);
			if(empCustom!=null && empCustom.getBsEmpDto()!=null) {
				session.setAttribute("usercode", loginName+","+password+","+DateUtils.getMillis());
				session.setAttribute("empCustom", empCustom);
				session.setAttribute("activeEmp", empCustom.getBsEmpDto());
				//过期时间半小时
				session.setMaxInactiveInterval(1800);
				 return "{'message':'success'}";
			}else {
				 return "{'message':'登录名或密码错误'}";
			}
		}
		return "{'message':'登陆错误'}";
	}
	
}
