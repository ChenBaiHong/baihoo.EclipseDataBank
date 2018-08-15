package com.baihoo.spring4.demo1.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;

/**
 * JDK 创建动态代理类
 * 		被代理必须是接口实现类
 * 
 * @author Administrator
 *
 * @param <T>
 */
public class JDKProxy<T> implements InvocationHandler {
	/**
	 * @param implClass
	 *            接口实现类
	 */
	private Class<T> implClass; // 接口类
	private T bean;

	public JDKProxy(Class<T> implClass) {
		this.implClass = implClass;
		try {
			this.bean = implClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public T createJDKProxyInstance() {
		T t = (T) Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), this);
		return t;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("add".equals(method.getName())) {
			System.out.println("已记录添加日志。。。");
			Object object = method.invoke(bean, args);
			return object;
		}
		if ("update".equals(method.getName())) {
			System.out.println("已记录更新日志。。。");
			Object object = method.invoke(bean, args);
			return object;
		}
		return method.invoke(proxy, args);
	}
}
