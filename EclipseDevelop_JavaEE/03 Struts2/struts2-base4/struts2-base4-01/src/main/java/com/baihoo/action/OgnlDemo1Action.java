package com.baihoo.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/**
 * 
 * @author Administrator
 * 
 * 		valueStack主要是将action数据携带到页面上，通过ognl获取数据
	
		1.ValueStack有一个实现类叫OgnlValueStack.
		2.每一个action都有一个ValueStack.（一个请求，一个request,一个action，一个valueStack） valueStack生命周期就是request生命周期。
		3.valueStack中存储了当前action对象以及其它常用web对象(request,session,application.parameters)
		4.struts2框架将valueStack以“struts.valueStack”为名存储到request域中。
		
 */
public class OgnlDemo1Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
	
		//获取ValueStack
		
		//1.通过request获取.
		//ValueStack vs=(ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
		
		//System.out.println(vs);
		
		//2.通过ActionContext获取
		
		ValueStack vs=ActionContext.getContext().getValueStack();
		
		System.out.println(vs);
		
		return null;
	}
}
