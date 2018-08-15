package com.baihoo.shiro.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.baihoo.shiro.pojo.BhBrand;
import com.baihoo.shiro.pojo.BhCate;
import com.baihoo.shiro.pojoCustom.BhProductCustom;
import com.baihoo.shiro.pojoQto.BhProductQto;
import com.baihoo.shiro.service.BhBrandService;
import com.baihoo.shiro.service.BhCateService;
import com.baihoo.shiro.service.BhProductService;
import com.baihoo.shiro.validation.ValidGroup1;

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
		//moView.setViewName("prodList");
		moView.setViewName("prodListEdit");
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
		//List<BhCate> cateList = bhCateService.findByAll();
		product = bhProductService.findBhProduct(id, product);
		model.addAttribute("product", product);
		model.addAttribute("branList", branList);
		//model.addAttribute("cateList", cateList);
		
		return "editProd";
	}
	
	/**
	 * 如果表单提交数据有误，重回至表单界面，让用户重新填写数据，而刚才提交的数据回显<br>
	 * "@ModelAttribute"作用于将请求pojo数据放到Model中回显到页面<br>
	 * "@Validated" 作用于對pojo要進行提交校驗，值通過groups指定校驗屬於那個分組，這表示校驗屬於ValidGroup1這個分組<br>
	 * @param model
	 * @param id
	 * @param product
	 * @param bindingResult 		//每個校驗的pojo後邊都要加bindingResult接受校驗錯誤的信息
	 * @param pictureFile 			//上传图片, MultipartFile的實例名稱要與頁面jsp上傳文件的name一致，要麽用“@RequestParam”標識
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/editProdSubmit", method = RequestMethod.POST)
	public String editProdSubmit(Model model, Integer id,
			@Validated(value= {ValidGroup1.class}) @ModelAttribute(value = "product") BhProductCustom product, BindingResult bindingResult,
			@RequestParam(value = "pictureFile", required = false) MultipartFile pictureFile) throws Exception {
		//输出校验错误信息
		//如果参数绑定时有错
		if(bindingResult.hasErrors()) {
			//获取错误 
			List<ObjectError> errors = bindingResult.getAllErrors();
			//输出错误信息
			errors.forEach(e -> System.out.println(e.getDefaultMessage()));
			//准备在页面输出errors，页面使用jstl遍历
			model.addAttribute("errors", errors);
			return "editProd";
		}
		//数据回显
		model.addAttribute("id" , id);
		String originalFileName =null;
		if (pictureFile != null && ((originalFileName = pictureFile.getOriginalFilename()) != null
				&& !"".equals(originalFileName.trim()))) {
			//图片上传成功后，将图片地址写入数据库
			String path="G:\\EclipseDataBank\\EclipseDevelop_JavaEE\\springmvc-ssm-file";
			//上传文件的原始名称
			originalFileName = pictureFile.getOriginalFilename();
			//新图片名称
			String newFileName = UUID.randomUUID().toString().replace("-", "")+originalFileName.substring(originalFileName.lastIndexOf("."));
			//新文件
			File file = new File(path+File.separator+newFileName);
			//将内存中的文件写入磁盘
			pictureFile.transferTo(file);
			//图片上传成功，将图片地址写入数据库
			product.setPicPath(newFileName);
		}
		//调用service接口更新商品信息
		//问题，id绝对不能为空
		int val = bhProductService.updateBhProduct(id, product);
		if(val == 0) {
			return "editProd";
		}
		//请求重定向
		/*
		 * 如果方法重定向到另一个urk，方法返回值为“redirect:url路径”
		 * 使用redirect进行重定向，request数据无法共享，url地址栏会发生变化的。
		*/
		return "redirect:queryProdList.do";
	}
	
	
	/**
	 *  需求：<br>
	 *  	单独将商品类型的方法提取出来，将方法返回值填充request，再页面回显
	 * @return
	 * @throws Exception
	 */
	@ModelAttribute("pcMap")
	public Map<Integer , String> getProdCate() throws Exception {
		Map<Integer , String> pcMap = new HashMap<Integer , String>();
		List<BhCate> cateList = bhCateService.findByAll();
		cateList.forEach(e -> pcMap.put(e.getId() , e.getName()));
		return pcMap;
	}
	/**
	 * 包装类型接受页面负载类型参数
	 * @param prodQto -- 参数绑定包装类型
	 * @return
	 */
	@RequestMapping(value="/prodListEditSubmit" , method=RequestMethod.POST)
	public String prodListEditSubmit(BhProductQto prodQto) throws Exception {
		
		prodQto.getProdList().forEach(e -> System.out.println(e.getPrice()+","+e.getName()));
		
		return "redirect:queryProdList.do";
	}
	
	/**
	 * 批量删除
	 * @param prod_id -- 参数绑定集合类型
	 * @return
	 */
	@RequestMapping(value="/prodListDeleteSubmit" ,method=RequestMethod.POST)
	public String prodListDeleteSubmit(@RequestParam(value="prod_id") Integer[] prod_id) throws Exception {
		
		System.out.println(prod_id.toString());
		
		return "redirect:queryProdList.do";
	}

}
