package com.baiHoo.thread.case1;
/**
 һ������,��ͬ����Դ
  ������������ģʽ �źŵƷ�
 wait() :�ȴ����ͷ���   sleep ���ͷ���
 notify()/notifyAll():����
  �� synchronized
 * @author Administrator
 *
 */
public class Movie {
	/**
	 * @param pic ��Ӱ����
	 */
	private String pic ;
	//�źŵ�
	//flag -->true �����������������ߵȴ� ��������ɺ�֪ͨ����
	//flag -->false ���������� �����ߵȴ�, ������ɺ�֪ͨ����
	private boolean flag =true;
	/**
	 * ��Ա��������
	 * @param pic
	 */
	public synchronized void play(String pic){
		if(!flag){ //�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������:"+pic);
		//�������		
		this.pic =pic;
		//֪ͨ����
		this.notify();
		//������ͣ��
		this.flag =false;
	}
	
	
	/**
	 * ���ڹۿ�����
	 */
	public synchronized void watch(){
		if(flag){ //�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������"+pic);
		//�������
		//֪ͨ����
		this.notifyAll();
		//����ֹͣ
		this.flag=true;
	}
}
