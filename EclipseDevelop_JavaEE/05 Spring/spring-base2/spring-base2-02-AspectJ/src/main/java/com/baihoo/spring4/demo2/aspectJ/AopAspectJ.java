package com.baihoo.spring4.demo2.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * AspectJ基于注解切面开发
 * 
 *  AOP Advisor 和 Aspect的区别?
 *  		Advisor:Spring传统意义上的切面:支持一个切点和一个通知的组合.
 *  		Aspect:可以支持多个切点和多个通知的组合.
 * @author Administrator
 *
 */
@Component("aopAspectJ")
@Aspect
public class AopAspectJ {
	/**
	 * AspectJ 前置增强通知
	 */
	@Before(value="AopAspectJ.pointcutWithAdd()")
	public void before() {
		System.out.println("AspectJ 前置增强。。。。。。");
	}
	/**
	 * AspectJ 后置增强通知，带有返回值
	 * 
	 * 带有返回值的 returnResult【名称】 必须和注解AfterRetuning定义的returning上的值一致
	 */
	@AfterReturning(value="AopAspectJ.pointcutWithAdd()" ,returning="returnResult")
	public void afterReturning(Object returnResult) {
		
		System.out.println("AspectJ 后置增强。。。。。。"+" , "+"返回值："+returnResult);
	}
	/**
	 * AspectJ 环绕增强通知
	 * @param proceedingJoinPoint
	 * @throws Throwable 
	 */
	@Around(value="execution(* com.baihoo.spring4.demo2.dao.impl.GroupDaoImpl.find*(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("AspectJ 环绕前置增强。。。。。。");
		proceedingJoinPoint.proceed();
		System.out.println("AspectJ 环绕后置增强。。。。。。");
	}
	
	/**
	 * AspectJ 异常抛出后通知
	 * @param e
	 */
	@AfterThrowing(value="execution(* com.baihoo.spring4.demo2.dao.impl.GroupDaoImpl.delete*(..))",throwing="e")
	public void afterThrowing(Throwable e) {
		System.out.println("不好了，出现异常了！！"+e.getMessage());
	}
	
	/**
	 * 最终final通知，不管是否异常，该通知都会执行
	 */
	@After(value="execution(* com.baihoo.spring4.demo2.dao.impl.GroupDaoImpl.update*(..))")
	public void after() {
		System.out.println("AspectJ 最终通知！！！");
	}
	/**
	 * 自定义切面切点
	 * 		该切点匹配类路径.add*方法
	 */
	@Pointcut(value="execution(* *.add*(..))")
	private void pointcutWithAdd() {
		
	}
}
