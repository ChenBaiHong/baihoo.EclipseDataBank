package com.baiHoo.thread.case2;
/**
 * 
 * @author Administrator
 * 管盛器模式，生产者与消费者
 */
public class AppProduce {
	public static void main(String[] args) {
		//管盛器
		SyncStack sStack = new SyncStack();
		//生产
		ShengChan sc = new ShengChan(sStack);
		//消费
		XiaoFei xf = new XiaoFei(sStack);
		sc.start();
		xf.start();
	}
}




