package com.baiHoo.thread.case2;

/**
 * ������ͷ
 * 
 * @author Administrator
 *
 */
public class ShengChan extends Thread {
	SyncStack ss = null;

	public ShengChan(SyncStack ss) {
		this.ss = ss;
	}

	@Override
	public void run() {
		for (Integer i = 0; i < 20; i++) {
			System.out.println(" ����ͷ��[ baiHoo����ͷ ] -- "+i);
			ManTou m = new ManTou(i,"[ baiHoo����ͷ ] -- "+i);
			ss.push(m);
		}
	}
}
