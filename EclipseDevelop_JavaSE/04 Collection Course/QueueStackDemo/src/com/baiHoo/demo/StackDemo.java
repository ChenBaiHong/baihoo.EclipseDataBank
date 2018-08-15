package com.baiHoo.demo;

import java.util.Stack;

/**
 * 
 * @author Administrator
 *	 ջ���ԣ��Ƚ����
 */
public class StackDemo {
	public static void main(String[] args) {
		Stack<Request> stack = new Stack<Request>();
		for(int i= 0 ; i<10 ; i++) {
			 Integer num = i;
			//ģ�������Ŷ����,�����࣬�ڲ������
			 //����
			 stack.push(new Request() {
				@Override
				public void deposit() {
					System.out.println("��"+num+"���˴�Ǯ��"+Math.random()*10000);
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
		 * �洢
		 */
		public  void deposit();
	}
}
