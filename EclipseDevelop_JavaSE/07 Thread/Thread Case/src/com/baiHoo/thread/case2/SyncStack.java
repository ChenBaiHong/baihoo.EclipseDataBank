package com.baiHoo.thread.case2;

/**
 * 
 *  ��ʢ��
 * @author Administrator
 *  
 */
public class SyncStack{
	int index=0;
	/**
	 * ��ʢ��������10����ͷ
	 */
	ManTou[] ms = new ManTou[10];
	/**
	 * ������ͷ
	 * @param m
	 */
	public synchronized void push(ManTou m){
		while(index==ms.length){
			try {
				this.wait(); 
				//wait���̻߳Ὣ���е����ͷš�sleep�Ǽ�ʹ˯��Ҳ���л�������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify(); //�����ڵ�ǰ����ȴ����еȴ��ĵ�һ���̡߳�notifyAll���������ڵ�ǰ����ȴ����еȴ��������̡߳�
		//��������ѵĻ����Ժ��������̶߳������ȴ��̣߳�û���˻��ѡ�
		ms[index]=m;
		index++;
	}
	/**
	 * ȡ����ͷ
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