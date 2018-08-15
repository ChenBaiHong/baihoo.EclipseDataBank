package com.baihoo.spring4.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/**
 * Bean的生命周期:
 * 		Bean的生命周期的11个步骤:
 *				......
 *
 *				5.如果存在类实现 BeanPostProcessor（后处理Bean） ，执行postProcessBeforeInitialization
 *
 *				6.如果Bean实现InitializingBean 执行 afterPropertiesSet 
 *
 *				7.调用<bean init-method="init"> 指定初始化方法 init
 *
 *				8.如果存在类实现 BeanPostProcessor（处理Bean） ，执行postProcessAfterInitialization
 *
 *				......
 * @author Administrator
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	/**
	 * bean:实例对象 beanName:在配置文件中配置的类的标识.
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("第五步:初始化之前执行...");
		return bean;
	}

	public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
		System.out.println("第八步:初始化后执行...");
		// 动态代理:
		if (beanName.equals("customerService")) {
			Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
					new InvocationHandler() {
						// 调用目标方法的时候,调用invoke方法.
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							if ("add".equals(method.getName())) {
								System.out.println("权限校验...");
								Object result = method.invoke(bean, args);
								// System.out.println(System.currentTimeMillis());
								return result;
							}
							return method.invoke(bean, args);
						}
					});
			return proxy;
		}
		return bean;
	}

}
