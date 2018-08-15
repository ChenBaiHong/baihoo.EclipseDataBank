package com.baiHoo.demo;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 
 * @author Administrator
 * 模拟银行排队存钱，先进先出
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<Request> que = new ArrayDeque<Request>();
		//Stack<Request> stack = new Stack<Request>();
		for(int i= 0 ; i<10 ; i++) {
			 Integer num = i;
			//模拟银行排队情况,匿名类，内部类对象
			 //放入
			que.offer(new Request() {
				@Override
				public void deposit() {
					System.out.println("第"+num+"个人存钱："+Math.random()*10000);
				}
			});
		}
		dealWith(que);
	}
	/**
	 * 办理业务
	 */
	public static void dealWith(Queue<Request> que){
		Request req = null;
		//取出
		while(null !=(req=que.poll())) {
			req.deposit();
		}
	}
	public interface Request{
		/**
		 * 
		 * 存储
		 */
		public  void deposit();
	}
}
