package com.baiHoo.thread.pattern;
/**
 * 单例创建的方式
 * 1、懒汉式
 * 1)、构造器私有化
 * 2)、声明私有的静态属性
 * 3)、对外提供访问属性的静态方法，确保该对象存在
 * 
 * @author Administrator
 *
 */
public class IdlerPatternDemo {
	private static IdlerPatternDemo instance;
	private IdlerPatternDemo(){
		
	}
	public static IdlerPatternDemo getInstance (){
		if(null==instance){ //提供效率
			synchronized(IdlerPatternDemo.class){
				if(null==instance){ //安全
					instance =new IdlerPatternDemo();
				}
			}
		}
		return instance;
	}
}
