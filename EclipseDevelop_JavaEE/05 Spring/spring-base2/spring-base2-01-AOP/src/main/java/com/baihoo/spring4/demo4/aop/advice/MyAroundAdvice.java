package com.baihoo.spring4.demo4.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知
 * 		-- 在目标方法执行前后实施增强
 * @author Administrator
 *
 */
public class MyAroundAdvice  implements MethodInterceptor{
	

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("。。。前置增强。。。");
		Object obj = invocation.proceed();// 执行目标对象的方法
		System.out.println("。。。后置增强。。。");
		return obj;
	}

}
