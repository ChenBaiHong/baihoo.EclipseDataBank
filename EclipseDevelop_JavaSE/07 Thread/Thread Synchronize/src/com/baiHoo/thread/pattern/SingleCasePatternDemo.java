package com.baiHoo.thread.pattern;

/**
 * 单例设计模式:确保一个类只有一个对象
 * @author Administrator
 *
 */
public class SingleCasePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleCasePatternThread thread1 = new SingleCasePatternThread(100);
		SingleCasePatternThread thread2 = new SingleCasePatternThread(500);
		thread1.start();
		thread2.start();
		
	}

}
class SingleCasePatternThread extends Thread{
	private long time;
	public SingleCasePatternThread() {
	}
	public SingleCasePatternThread(long time) {
		this.time =time;
	}
	@Override
	public void run() {		
		System.out.println(Thread.currentThread().getName()+"-->创建:"+SingleCasePattern.getInstance(time));
	}
}


/**
 * 单例设计模式
 * 确保一个类只有一个对象
 * 懒汉式  double checking
 * 1、构造器私有化,避免外部直接创建对象
 * 2、声明一个私有的静态变量
 * 3、创建一个对外的公共的静态方法 访问该变量，如果变量没有对象，创建该对象
 */
class SingleCasePattern {
	//声明一个私有的静态变量
	private static SingleCasePattern instance =null;	
	//构造器私有化,避免外部直接创建对象
	private SingleCasePattern(){
		
	}
	//创建一个对外的公共的静态方法 访问该变量，如果变量没有对象，创建该对象
	public static SingleCasePattern getInstance(long time){
		// c d e  -->效率  提供 已经存在对象的访问效率
		if(null==instance){	
			// a b
			synchronized(SingleCasePattern.class){
				if(null==instance ){
					try {
						Thread.sleep(time); //延时 ，放大错误
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance =new SingleCasePattern();
				}
			}
	  }//a
	  return instance;
	}
	
	
	public static SingleCasePattern getInstance3(long time){
		//a b c d e  -->效率不高 c  存在对象也需要等待
		synchronized(SingleCasePattern.class){
			if(null==instance ){
				try {
					Thread.sleep(time); //延时 ，放大错误
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				instance =new SingleCasePattern();
			}
			return instance;
		}
	}
	
	
	public static synchronized SingleCasePattern getInstance2(long time){
		if(null==instance ){
			try {
				Thread.sleep(time); //延时 ，放大错误
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance =new SingleCasePattern();
		}
		return instance;
	}
	
	
	
	public static SingleCasePattern getInstance1(long time){
		if(null==instance ){
			try {
				Thread.sleep(time); //延时 ，放大错误
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance =new SingleCasePattern();
		}
		return instance;
	}
}