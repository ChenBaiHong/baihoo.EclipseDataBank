package com.baiHoo.thread.status;

/**
 * yield ״̬ʵ��
 * yield: ���ã���λ;
 * @author Administrator
 *		
 */
public class YieldDemo01 extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		YieldDemo01 demo = new YieldDemo01();
		Thread t = new Thread(demo); //����
		t.start();//����
		//cpu���� ����
		
		
		for(int i=0;i<1000;i++){
			if(i%20==0){
				// (��ͣ)���߳� main Ϊ��һ���߳�����
				Thread.yield();
			}
			System.out.println("main...."+i);
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("yield...."+i);
		}
	}

}
