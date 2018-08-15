package com.baiHoo.thread.synch;


public class SynchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//真实角色
		Web12306 web= new Web12306();
		//代理
		Thread t1 =new Thread(web,"路人甲");
		Thread t2 =new Thread(web,"黄牛已");
		Thread t3 =new Thread(web,"攻城师");
		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}

}

/**
 * 线程安全的类
 * @author Administrator
 *
 */
class Web12306 implements Runnable {
	private int num =10;
	private boolean flag =true;
	@Override
	public void run() {
		while(flag){
			synchWrapThreadSafe();
		}
	}
	/**
	 * @describe 锁定范围不正确 线程不安全
	 */
	public void synchUnwrapThreadUnSafe2(){
	   	
		if(num<=0){
			flag=false; //跳出循环
			return ;
		}
		 //a  b  c 	
		synchronized(this){
			try {
				Thread.sleep(500); //模拟 延时
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
	
	/**
	 *  @describe 线程不安全  锁定资源不正确
	 */
	public void synchLocklessThreadUnSafe(){
		//a  b  c
		synchronized((Integer)num){
			if(num<=0){
				flag=false; //跳出循环
				return ;
			}
			try {
				Thread.sleep(500); //模拟 延时
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
	
	
	/**
	 * @describe 锁定范围不正确 线程不安全
	 */
	public void synchUnwrapThreadUnSafe(){
		//   c  1
		synchronized(this){
			//b
			if(num<=0){
				flag=false; //跳出循环
				return ;
			}
		}
		// b
		try {
			Thread.sleep(500); //模拟 延时
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
	}//a -->1
	
	/**
	 * @describe 线程安全 , 锁定正确
	 */
	public void synchWrapThreadSafe(){
		//a  b  c
		synchronized(this){
			if(num<=0){
				flag=false; //跳出循环
				return ;
			}
			try {
				Thread.sleep(500); //模拟 延时
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
	/**
	 * @describe 锁定同步方法，线程安全
	 */
	public synchronized void synchMethodThreadSafe(){
		if(num<=0){
			flag=false; //跳出循环
			return ;
		}
		try {
			Thread.sleep(500); //模拟 延时
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
	}
	
	
	/**
	 * @describe	未同步，线程不安全
	 */
	public void threadUnsafe(){
		if(num<=0){
			flag=false; //跳出循环
			return ;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
	}
}
