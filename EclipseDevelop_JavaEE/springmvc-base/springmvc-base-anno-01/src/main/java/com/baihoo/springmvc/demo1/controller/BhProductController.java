package com.baihoo.springmvc.demo1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baihoo.springmvc.demo1.pojo.BhProduct;

/**
 *  入門模擬案例一
 *  	注解方式
 *  
 * @author Administrator
 *
 */
@Controller
public class BhProductController {
	/**
	 * 渲染视图，向view填充模型数据響應傳遞個jsp頁面
	 * 
	 * 使用靜態數據，將商品信息展示到jsp頁面
	 * 查詢商品列表，@RequestMapping中Url建議與方法名一致，方便與維護
	 */
	@RequestMapping("queryProdList")
	public ModelAndView queryProdList() {
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
		
		//轉發的jsp頁面地址，怎么寫，xml中的視圖解析器配置前綴和後綴的聲明標識
		moView.setViewName("prodList");
		return moView;
	}
}
