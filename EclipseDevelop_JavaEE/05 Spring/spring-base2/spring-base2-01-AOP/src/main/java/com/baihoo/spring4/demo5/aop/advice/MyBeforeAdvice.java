package com.baihoo.spring4.demo5.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置通知
 * 		-- 在目标方法执行前实施增强
 * @author Administrator
 *
 */
public class MyBeforeAdvice  implements MethodBeforeAdvice{
	
	/**
	 * 	
	 * method:执行的方法
	 * args:参数
	 * target:目标对象
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getSimpleName()+"."+method.getName()+" 前置增强。。。。。。");
	}

}
