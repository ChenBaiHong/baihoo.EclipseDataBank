package com.baiHoo.thread.case2;

/**
 * 
 *  管盛器
 * @author Administrator
 *  
 */
public class SyncStack{
	int index=0;
	/**
	 * 管盛器，上限10个馒头
	 */
	ManTou[] ms = new ManTou[10];
	/**
	 * 放入馒头
	 * @param m
	 */
	public synchronized void push(ManTou m){
		while(index==ms.length){
			try {
				this.wait(); 
				//wait后，线程会将持有的锁释放。sleep是即使睡着也持有互斥锁。
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify(); //唤醒在当前对象等待池中等待的第一个线程。notifyAll叫醒所有在当前对象等待池中等待的所有线程。
		//如果不唤醒的话。以后这两个线程都会进入等待线程，没有人唤醒。
		ms[index]=m;
		index++;
	}
	/**
	 * 取出馒头
	 * @return
	 */
	public synchronized ManTou pop(){
		while(index==0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return ms[index];
	}
}