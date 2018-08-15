package com.baihoo.springmvc.demo1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.baihoo.springmvc.demo1.pojo.BhProduct;

/**
 *  入門模擬案例一
 *  非注解方式之
 *  		實現Controller ，向前端頁面響應數據
 * @author Administrator
 *
 */
public class BhProductController implements Controller {
	/**
	 * 渲染视图，向view填充模型数据響應傳遞個jsp頁面
	 * 
	 * 
	 * 使用靜態數據，將商品信息展示到jsp頁面
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<BhProduct> prodList = new ArrayList<BhProduct>();
		
		prodList.add(new BhProduct("1","華爲P系類手機"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("2","華爲Mate系類手機"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("3","華爲榮耀系類手機"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("4","華爲PBook系類電腦"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("5","華爲MateBook系類電腦"  , 3566.00 , new Date()));
		
		//創建向view填充模型数据類
		ModelAndView moView = new ModelAndView();
		//將數據填充到request中去
		//request.setAttribute("prodList", prodList);
		moView.addObject("prodList", prodList);
		
		//轉發的jsp頁面地址
		moView.setViewName("/jsp/prodList.jsp");
		return moView;
	}

}
