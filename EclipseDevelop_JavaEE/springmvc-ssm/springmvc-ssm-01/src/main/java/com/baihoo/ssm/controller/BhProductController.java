package com.baihoo.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baihoo.ssm.pojo.BhBrand;
import com.baihoo.ssm.pojo.BhCate;
import com.baihoo.ssm.pojoCustom.BhProductCustom;
import com.baihoo.ssm.service.BhBrandService;
import com.baihoo.ssm.service.BhCateService;
import com.baihoo.ssm.service.BhProductService;

/**
 *  入門模擬案例一
 *  	注解方式
 *  
 * @author Administrator
 *
 */
@Controller
//窄化请求映射URL
@RequestMapping("/prod")
@Scope(value="prototype")//开启原型，防止多线程
public class BhProductController {
	
	//注入service
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
	 * 渲染视图，向view填充模型数据響應傳遞個jsp頁面
	 * 
	 * 使用靜態數據，將商品信息展示到jsp頁面
	 * 查詢商品列表，@RequestMapping中Url建議與方法名一致，方便與維護
	 * @throws Exception 
	 */
	@RequestMapping("queryProdList")
	public ModelAndView queryProdList() throws Exception {
		
		List<BhProductCustom> prodList = bhProductService.findProductList(null);
		//創建向view填充模型数据類
		ModelAndView moView = new ModelAndView();
		//將數據填充到request中去
		//request.setAttribute("prodList", prodList);
		moView.addObject("prodList", prodList);
		
		//轉發的jsp頁面地址
		moView.setViewName("prodList");
		return moView;
	}
	/**
	 * 编辑产品
	 * @return
	 * 		限制使用要使用Get请求方式
	 * 		当页面传递的简单类型不一致时，采用 "@RequestParam(value="pId" , required=true)" 参数pId的值绑定至id上去。
	 * 		简单pojo类型只包括简单类型的属性。
	 * 		绑定过程：
	 * 			request请求的参数名称和pojo的属性名一致，就可以绑定成功。
	 * @throws Exception 
	 */
	@RequestMapping(value="/editProd" , method=RequestMethod.GET)
	public String editProd(Integer id , Model model) throws Exception {
		BhProductCustom product = new BhProductCustom();
		List<BhBrand>branList = bhBrandService.findByAll();
		List<BhCate> cateList = bhCateService.findByAll();
		product = bhProductService.findBhProduct(id, product);
		model.addAttribute("product", product);
		model.addAttribute("branList", branList);
		model.addAttribute("cateList", cateList);
		
		return "editProd";
	}
	/**
	 * 如果表单提交数据有误，重回至表单界面，让用户重新填写数据，而刚才提交的数据回显
	 * @param id
	 * @param product
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/editProdSubmit" , method=RequestMethod.POST)
	public String editProdSubmit(Integer id , @ModelAttribute(value="product") BhProductCustom product) throws Exception {
		//调用service接口更新商品信息
		//问题，id绝对不能为空
		int val = bhProductService.updateBhProduct(id, product);
		if(val == 0) {
			return "forward:editProd";
		}
		//请求重定向
		/*
		 * 如果方法重定向到另一个urk，方法返回值为“redirect:url路径”
		 * 使用redirect进行重定向，request数据无法共享，url地址栏会发生变化的。
		*/
		return "redirect:queryProdList.do";
	}
}
