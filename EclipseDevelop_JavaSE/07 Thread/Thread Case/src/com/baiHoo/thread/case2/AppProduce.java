package com.baiHoo.thread.case2;
/**
 * 
 * @author Administrator
 * ��ʢ��ģʽ����������������
 */
public class AppProduce {
	public static void main(String[] args) {
		//��ʢ��
		SyncStack sStack = new SyncStack();
		//����
		ShengChan sc = new ShengChan(sStack);
		//����
		XiaoFei xf = new XiaoFei(sStack);
		sc.start();
		xf.start();
	}
}




