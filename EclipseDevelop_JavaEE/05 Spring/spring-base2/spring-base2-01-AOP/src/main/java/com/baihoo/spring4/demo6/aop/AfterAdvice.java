package com.baihoo.spring4.demo6.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 后置通知
 * 		-- 在目标方法执行后实施增强
 * @author Administrator
 *
 */
public class AfterAdvice  implements AfterReturningAdvice{
	

	/**
	 * 	
	 * method:执行的方法
	 * args:参数
	 * target:目标对象
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getSimpleName()+"."+method.getName()+" 。。。后置增强。。。");
	}
}
