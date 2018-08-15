package com.baihoo.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baihoo.springboot.entity.BhBook;
import com.baihoo.springboot.service.BhBookService;

/**
 * 书籍控制层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/bhBook")
public class BhBookController {
	@Autowired
	private BhBookService bhBookService;
	/**
	 * 查询书籍列表
	 * @param model
	 * @return
	 */
	@GetMapping("/listBook")
	public String listBook(Model model) {
		model.addAttribute("listBook", bhBookService.findByAll());
		return "listBook";
	}
	/**
	 * 添加書籍
	 * @return
	 */
	@GetMapping("/addedBook")
	public String addedBook() {
		
		return "addedBook";
	}
	/**
	 * 更新編輯書籍
	 * @param id
	 * @return
	 */
	@GetMapping("/editBook/{id}")
	public ModelAndView editBook(@PathVariable Integer id) {
		BhBook book = bhBookService.findById(id);
		ModelAndView mac = new ModelAndView();
		mac.addObject("book", book);
		mac.setViewName("editBook");
		return mac;
	}
	/**
	 * 添加書籍提交
	 * @param bhBook
	 * @param bindingResult
	 * @return
	 */
	@PostMapping(value = "/addedBookSubmit")
	public String addedBookSubmit(@Valid BhBook bhBook , BindingResult bindingResult) {
		System.out.println(bhBook);
		bhBookService.saveBhBook(bhBook);
		return "redirect:listBook";
	}
	/**
	 *  編輯書籍提交，不成功就回顯至編輯頁面
	 * @param id
	 * @return
	 */
	@PostMapping("/editBookSubmit")
	public String editBookSubmit(@ModelAttribute("id") Integer id, @Valid @ModelAttribute("book") BhBook bhBook) {
		Integer i = bhBookService.updateBhBook(id, bhBook);
		// 如果成功就跳轉之列表頁
		if (i == 1) {
			return "redirect:listBook";
		} else {// 否則回顯至書籍編輯表單頁
			return "editBook";
		}
	}
	/**
	 * 條件查詢，通過Specification規定動態查詢
	 * @param bhBook
	 * @return
	 */
	@PostMapping("/searchQuery")
	public ModelAndView searchQuery(@Valid @ModelAttribute("book") BhBook book) {
		List<BhBook> listBook = bhBookService.findByConditionIsSpecification(book);
		ModelAndView mav = new ModelAndView();
		mav.addObject("listBook", listBook);
		mav.setViewName("listBook");
		return mav;
	}
	/**
	 * 條件查詢, 通過動態SQL查詢
	 * @param bhBook
	 * @return
	 */
	@PostMapping("/searchQuery2")
	public ModelAndView searchQuery2(@Valid @ModelAttribute("book") BhBook book) {
		
		List<BhBook> listBook = bhBookService.findByConditionIsSql(book);
		ModelAndView mav = new ModelAndView();
		mav.addObject("listBook", listBook);
		mav.setViewName("listBook");
		return mav;
	}
}
