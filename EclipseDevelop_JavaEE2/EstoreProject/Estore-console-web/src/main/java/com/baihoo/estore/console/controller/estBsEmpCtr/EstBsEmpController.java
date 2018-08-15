package com.baihoo.estore.console.controller.estBsEmpCtr;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.service.EstBsEmpService;

/**
 * 
 * @ClassName: EstBsEmpController
 * @Description: 员工操作控制层
 * @author: Administrator
 * @date: 2018年7月28日 下午6:15:40
 */
@Controller
@RequestMapping("/estBsEmp")
public class EstBsEmpController {
	
	@Resource
	private EstBsEmpService estBsEmpService;
	
	/**
	 * 员工用户登陆
	 * 
	 * @return
	 */
	@GetMapping("/empLogin")
	public String empLogin() {
		return "EstBsEmp/empLogin";
	}
	@GetMapping("empLogout")
	public String empLogout(HttpSession session) {
		//注销session失效
		session.invalidate();
		return "EstBsEmp/empLogin";
	}
	
	@GetMapping("/empList/{id}")
	public ModelAndView empList(@PathVariable Integer id) throws Exception {
		ModelAndView mav = new ModelAndView();
		if(id !=null) {
			
		}
		List<EstBsEmp> list = estBsEmpService.findAll(null, 1, 10);
		mav.addObject("list" , list);
		mav.setViewName("EstBsEmp/empList");
		return mav ;
	}
}
