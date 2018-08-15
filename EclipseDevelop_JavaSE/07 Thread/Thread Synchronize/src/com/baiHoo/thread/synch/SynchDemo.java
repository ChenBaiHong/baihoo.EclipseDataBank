package com.baiHoo.thread.synch;


public class SynchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʵ��ɫ
		Web12306 web= new Web12306();
		//����
		Thread t1 =new Thread(web,"·�˼�");
		Thread t2 =new Thread(web,"��ţ��");
		Thread t3 =new Thread(web,"����ʦ");
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}

}

/**
 * �̰߳�ȫ����
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
	 * @describe ������Χ����ȷ �̲߳���ȫ
	 */
	public void synchUnwrapThreadUnSafe2(){
	   	
		if(num<=0){
			flag=false; //����ѭ��
			return ;
		}
		 //a  b  c 	
		synchronized(this){
			try {
				Thread.sleep(500); //ģ�� ��ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
	
	/**
	 *  @describe �̲߳���ȫ  ������Դ����ȷ
	 */
	public void synchLocklessThreadUnSafe(){
		//a  b  c
		synchronized((Integer)num){
			if(num<=0){
				flag=false; //����ѭ��
				return ;
			}
			try {
				Thread.sleep(500); //ģ�� ��ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
	
	
	/**
	 * @describe ������Χ����ȷ �̲߳���ȫ
	 */
	public void synchUnwrapThreadUnSafe(){
		//   c  1
		synchronized(this){
			//b
			if(num<=0){
				flag=false; //����ѭ��
				return ;
			}
		}
		// b
		try {
			Thread.sleep(500); //ģ�� ��ʱ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������"+num--);
	}//a -->1
	
	/**
	 * @describe �̰߳�ȫ , ������ȷ
	 */
	public void synchWrapThreadSafe(){
		//a  b  c
		synchronized(this){
			if(num<=0){
				flag=false; //����ѭ��
				return ;
			}
			try {
				Thread.sleep(500); //ģ�� ��ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
	/**
	 * @describe ����ͬ���������̰߳�ȫ
	 */
	public synchronized void synchMethodThreadSafe(){
		if(num<=0){
			flag=false; //����ѭ��
			return ;
		}
		try {
			Thread.sleep(500); //ģ�� ��ʱ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������"+num--);
	}
	
	
	/**
	 * @describe	δͬ�����̲߳���ȫ
	 */
	public void threadUnsafe(){
		if(num<=0){
			flag=false; //����ѭ��
			return ;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������"+num--);
	}
}
