package org.baiHoo.utils;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TempTest {
	String temp;
	public static void main(String[] args) throws Exception {
		Method[] methods = TempTest.class.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("method:" + method.getName());// 方法名

			// //////////////方法的参数
			System.out.println(" paramTypeType: ");
			Type[] paramTypeList = method.getGenericParameterTypes();// 方法的参数列表
			for (Type paramType : paramTypeList) {
				System.out.println("  " + paramType);// 参数类型
				if (paramType instanceof ParameterizedType)/**//* 如果是泛型类型 */ {
					Type[] types = ((ParameterizedType) paramType).getActualTypeArguments();// 泛型类型列表
					System.out.println("  TypeArgument: ");
					for (Type type : types) {
						System.out.println("   " + type);
					}
				}
			}

			// //////////////方法的返回值
			System.out.println(" returnType: ");
			Type returnType = method.getGenericReturnType();// 返回类型
			System.out.println("  -------------------------------  " + returnType.toString());
			if (returnType instanceof ParameterizedType)/**//* 如果是泛型类型 */ {
				Type[] types = ((ParameterizedType) returnType).getActualTypeArguments();// 泛型类型列表
				System.out.println("  TypeArgument: ");
				for (Type type : types) {
					System.out.println("   " + type);
				}
			}

		}

	}

	public static String method1(List list) {
		return null;
	}

	private static Map<String, Double> method2(Map<String, Object> map) {
		return null;
	}

	public String getTemp() {
		return temp;
	}
	public int getInt() {
		
		return 1;
	}
	@Test
	public void getInteger() {
		
	}
}