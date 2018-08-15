package com.baiHoo.thread.case2;

/**
 * 消费馒头
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
			System.out.println("吃馒头：" + m.toString());

		}
	}
}