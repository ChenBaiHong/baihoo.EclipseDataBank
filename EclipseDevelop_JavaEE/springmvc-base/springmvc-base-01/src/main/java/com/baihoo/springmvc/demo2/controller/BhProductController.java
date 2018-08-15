package com.baihoo.springmvc.demo2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.baihoo.springmvc.demo2.pojo.BhProduct;

/**
 *  入門模擬案例二
 *  非注解方式之
 *  		實現HttpRequestHandler ，向前端頁面響應數據
 * @author Administrator
 *
 */
public class BhProductController implements HttpRequestHandler {
	/**
	 * 原生request方式携帶數據請求轉發到jsp頁面
	 * 
	 * 
	 * 使用靜態數據，將商品信息展示到jsp頁面
	 */
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<BhProduct> prodList = new ArrayList<BhProduct>();
		
		prodList.add(new BhProduct("1","華爲P系類手機"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("2","華爲Mate系類手機"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("3","華爲榮耀系類手機"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("4","華爲PBook系類電腦"  , 3566.00 , new Date()));
		prodList.add(new BhProduct("5","華爲MateBook系類電腦"  , 3566.00 , new Date()));
		

		//將數據填充到request中去
		request.setAttribute("prodList", prodList);
		//原生request方式携帶數據請求轉發到jsp頁面
		request.getRequestDispatcher("/jsp/prodList.jsp").forward(request, response);
	}

}
