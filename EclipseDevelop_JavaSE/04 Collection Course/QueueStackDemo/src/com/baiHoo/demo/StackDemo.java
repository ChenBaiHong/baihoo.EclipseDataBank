package com.baiHoo.demo;

import java.util.Stack;

/**
 * 
 * @author Administrator
 *	 栈特性，先进后出
 */
public class StackDemo {
	public static void main(String[] args) {
		Stack<Request> stack = new Stack<Request>();
		for(int i= 0 ; i<10 ; i++) {
			 Integer num = i;
			//模拟银行排队情况,匿名类，内部类对象
			 //放入
			 stack.push(new Request() {
				@Override
				public void deposit() {
					System.out.println("第"+num+"个人存钱："+Math.random()*10000);
				}
			});
		}
		dealWith(stack);
	}
	public static void dealWith(Stack<Request> stack){
		Request req = null;
		while((req=stack.pop())!=null) {
			req.deposit();
		}
		/*
		for (Iterator<Request> iterator = stack.iterator(); iterator.hasNext();) {
			req = (Request) iterator.next();
			req.deposit();
		}
		*/
	}
	public interface Request{
		/**
		 * 
		 * 存储
		 */
		public  void deposit();
	}
}
