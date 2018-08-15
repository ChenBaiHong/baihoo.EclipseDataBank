package com.baihoo.shiro.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义异常处理器
 * @author Administrator
 *
 */
public class CustomExceptionResolver  implements HandlerExceptionResolver{

	/**
	 * 前端控制DispatcherServlet在操作HandlerMapping，調用HandlerAdapter執行Handler過程中，如果遇到異常就會執行此方法
	 * handler最終要執行的handler，它的真實身份是handlerMethod
	 * Exception ex就是要接受的異常信息
	 */
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		//輸出異常信息
		ex.printStackTrace();
		//統一異常處理代碼
		//針對系統自定義的CustomException異常，就可以直接從異常類中獲取異常信息，將異常處理在錯誤頁面中
		//異常信息
		String message = null;
		CustomException customException = null;
		//如果異常ex是系統自定義異常CustomException直接取出異常信息；
		if(ex instanceof CustomException) {
			customException  = (CustomException)ex;
		}else {
			//针对非CustomException异常，对这类重新构造成一个CustomException，异常信息为“未知错误”
			customException = new CustomException("未知错误");
		}
		//錯誤信息
		message = customException.getMessage();
		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView();
	}

}
