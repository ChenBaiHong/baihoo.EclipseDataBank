package com.baiHoo.demo;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 
 * @author Administrator
 * ģ�������ŶӴ�Ǯ���Ƚ��ȳ�
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<Request> que = new ArrayDeque<Request>();
		//Stack<Request> stack = new Stack<Request>();
		for(int i= 0 ; i<10 ; i++) {
			 Integer num = i;
			//ģ�������Ŷ����,�����࣬�ڲ������
			 //����
			que.offer(new Request() {
				@Override
				public void deposit() {
					System.out.println("��"+num+"���˴�Ǯ��"+Math.random()*10000);
				}
			});
		}
		dealWith(que);
	}
	/**
	 * ����ҵ��
	 */
	public static void dealWith(Queue<Request> que){
		Request req = null;
		//ȡ��
		while(null !=(req=que.poll())) {
			req.deposit();
		}
	}
	public interface Request{
		/**
		 * 
		 * �洢
		 */
		public  void deposit();
	}
}
