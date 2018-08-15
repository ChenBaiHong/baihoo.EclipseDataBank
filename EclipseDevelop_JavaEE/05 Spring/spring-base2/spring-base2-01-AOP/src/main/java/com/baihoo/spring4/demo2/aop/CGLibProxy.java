package com.baihoo.spring4.demo2.aop;


import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * CGlib 实现动态代理,创建对象
 * 		被代理对象可不需要实现接口类，
 * 		CGlib会为代理对象设置父类
 * @author Administrator
 *
 */
public class CGLibProxy<T> implements MethodInterceptor{

	private Class<T> entityClass;
	
	public CGLibProxy(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	public T createCGLibProxyInstance() {
		//使用 CGLib 生成代理对象
		//1、 创建核心类
		Enhancer enhancer = new Enhancer();
		//2、为代理对象设置父类
		enhancer.setSuperclass(entityClass);
		//3、设置回调
		enhancer.setCallback(this);
		//4、 创建代理
		return (T)enhancer.create();
	}

	@Override
	public Object intercept(Object paramObject, Method paramMethod, Object[] paramArrayOfObject,
			MethodProxy paramMethodProxy) throws Throwable {
		
		if ("add".equals(paramMethod.getName())) {
			System.out.println("已记录添加日志。。。");
			Object object ;
			object = paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
			return object;
		}
		if ("update".equals(paramMethod.getName())) {
			System.out.println("已记录更新日志。。。");
			Object object ;
			object = paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
			return object;
		}
		return paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
	}
}
