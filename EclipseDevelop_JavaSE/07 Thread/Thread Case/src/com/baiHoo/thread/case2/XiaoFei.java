package com.baiHoo.thread.case2;

/**
 * ������ͷ
 * 
 * @author Administrator
 *
 */
public class XiaoFei extends Thread {
	SyncStack ss = null;

	public XiaoFei(SyncStack ss) {
		this.ss = ss;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			ManTou m = ss.pop();
			System.out.println("����ͷ��" + m.toString());

		}
	}
}