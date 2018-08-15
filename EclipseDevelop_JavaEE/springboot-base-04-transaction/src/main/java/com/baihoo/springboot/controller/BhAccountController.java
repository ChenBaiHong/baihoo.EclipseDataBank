package com.baihoo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baihoo.springboot.service.BhAccountService;

/**
 * 模擬銀行轉賬，控制層操作
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/bhAccount")
public class BhAccountController {

	@Autowired
	@Qualifier("bhAccountService")
	private BhAccountService bhAccountService;

	/**
	 * 進入轉賬模板頁面
	 * @return
	 */
	@GetMapping("/transferAccountPage")
	public String transferAccountPage() {
		
		return "transferAccount";
	}

	/**
	 * 轉賬業務方法
	 * 
	 * @param fromAccountName
	 * @param toAccountName
	 * @param money
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/transferAccount")
	public ModelAndView transferAccount(
			@RequestParam(value = "fromAccount", required = true) @ModelAttribute(value = "fromAccount") String fromAccountName,
			@RequestParam(value = "toAccount", required = true) @ModelAttribute(value = "toAccount") String toAccountName,
			@ModelAttribute(value = "money") Double money) {
		ModelAndView mav = new ModelAndView();
		try {
			bhAccountService.transferAccount(fromAccountName, toAccountName, money);
		} catch (Exception e) {
			mav.addObject("error", "轉賬異常！！！");
			mav.setViewName("transferAccount");
			e.printStackTrace();
			return mav;
		}
		mav.setViewName("success");
		return mav;
	}
}
