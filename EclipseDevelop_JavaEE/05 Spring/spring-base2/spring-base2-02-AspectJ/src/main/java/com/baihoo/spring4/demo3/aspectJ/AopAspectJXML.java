package com.baihoo.spring4.demo3.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
/**
 * AspectJ基于XML配置切面开发
 * 
 *  AOP Advisor 和 Aspect的区别?
 *  		Advisor:Spring传统意义上的切面:支持一个切点和一个通知的组合.
 *  		Aspect:可以支持多个切点和多个通知的组合.
 * @author Administrator
 *
 */

public class AopAspectJXML {
	/**
	 * AspectJ 前置增强通知
	 */
	
	public void before() {
		System.out.println("AspectJ 前置增强。。。。。。");
	}
	/**
	 * AspectJ 后置增强通知，带有返回值
	 */

	public void afterReturning(Object returnResult) {
		
		System.out.println("AspectJ 后置增强。。。。。。"+" , "+"返回值："+returnResult);
	}
	/**
	 * AspectJ 环绕增强通知
	 * 
	 * 
	 * @param proceedingJoinPoint
	 * @throws Throwable 
	 */

	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("AspectJ 环绕前置增强。。。。。。");
		proceedingJoinPoint.proceed();
		System.out.println("AspectJ 环绕后置增强。。。。。。");
	}
	
	/**
	 * AspectJ 异常抛出后通知
	 * @param e
	 */

	public void afterThrowing(Throwable e) {
		System.out.println("不好了，出现异常了！！"+e.getMessage());
	}
	
	/**
	 * 最终final通知，不管是否异常，该通知都会执行
	 */

	public void after() {
		System.out.println("AspectJ 最终通知！！！");
	}
}
