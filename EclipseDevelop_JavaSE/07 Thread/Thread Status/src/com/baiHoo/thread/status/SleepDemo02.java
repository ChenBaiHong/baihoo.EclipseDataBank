package com.baiHoo.thread.status;


/**
 * Sleepģ�� ������ʱ  �̲߳���ȫ����
 * 
 * @author Administrator
 *
 */
public class SleepDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʵ��ɫ
		Web12306 web1= new Web12306();
		Web12306 web2 = new Web12306();
		Web12306 web3 = new Web12306();
		//����
		Thread t1 =new Thread(web1,"·�˼�");
		Thread t2 =new Thread(web2,"��ţ��");
		Thread t3 =new Thread(web3,"����ʦ");
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}

}

class Web12306 implements Runnable {
	private int num =50;

	@Override
	public void run() {
		while(true){
			if(num<=0){
				break; //����ѭ��
			}
			try {
				Thread.sleep(500);// ��ʱ500����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
	
	
}
