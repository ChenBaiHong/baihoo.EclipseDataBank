package com.baihoo.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baihoo.ssm.pojoCustom.BhProductCustom;
import com.baihoo.ssm.service.BhBrandService;
import com.baihoo.ssm.service.BhCateService;
import com.baihoo.ssm.service.BhProductService;

/**
 * 商品 json格式数据的交互
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/prodJson")
public class BhProductJsonController {
	// 注入service
	@Autowired
	@Qualifier("bhProductService")
	private BhProductService bhProductService;
	@Autowired
	@Qualifier("bhBrandService")
	private BhBrandService bhBrandService;
	@Autowired
	@Qualifier("bhCateService")
	private BhCateService bhCateService;

	/**
	 *
	 * 轉向至editProdJson.jsp 頁面
	 * 
	 * @param product
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/editProdJson")
	public  String editProdJson() throws Exception {
	
		return "editProdJson";
	}
	/**
	 * 請求json響應json,請求商品信息，商品信息用json格式，輸出商品信息
	 * @param product
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getProdByRequestJson")
	public @ResponseBody BhProductCustom getProdByRequestJson(@RequestBody BhProductCustom product) throws Exception {
		product = bhProductService.findBhProduct(product.getbId(), product);
		return product;
	}
	/**
	 * 通过key/value的形式响应json数据
	 * @param product
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/getProdByResponseJson")
	public @ResponseBody BhProductCustom getProdByResponseJson(BhProductCustom product) throws Exception {
		product = bhProductService.findBhProduct(product.getbId(), product);
		return product;
	}
	/**
	 * 根據商品id查看商品信息通過RESTful方式
	 * “@RequestMapping”中指定RESFful方式的url中的參數，參數需要用{}包起來
	 * “@PathVariable” 將url中的{}包起來參數和形參進行綁定
	 * @param product
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/veiwProductJson/{id}")
	public @ResponseBody BhProductCustom veiwProductJson(@PathVariable Integer id) throws Exception {
		BhProductCustom product = new BhProductCustom();
		product = bhProductService.findBhProduct(id, product);
		return product;
	}
}
