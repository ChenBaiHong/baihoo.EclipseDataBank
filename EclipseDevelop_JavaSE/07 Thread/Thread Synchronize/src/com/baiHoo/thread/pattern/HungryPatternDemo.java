package com.baiHoo.thread.pattern;

/**
 * 饿汉式
   1)、构造器私有化 
 * 2)、声明私有的静态属性,同时创建该对象
 * 3)、对外提供访问属性的静态方法
 * @author Administrator
 *
 */
public class HungryPatternDemo {
	private static HungryPatternDemo instance =new HungryPatternDemo();
	private HungryPatternDemo(){
		
	}
	public static HungryPatternDemo getInstance (){		
		return instance;
	}

}
/**
 * 类在使用的时候加载 ，延缓加载时间
 * @author Administrator
 *
 */
class HungryPattern2 {
	private static class JVMholder{
		private static HungryPattern2 instance =new HungryPattern2();
	}
	private HungryPattern2(){
		
	}
	public static HungryPattern2 getInstance (){		
		return JVMholder.instance;
	}

}
