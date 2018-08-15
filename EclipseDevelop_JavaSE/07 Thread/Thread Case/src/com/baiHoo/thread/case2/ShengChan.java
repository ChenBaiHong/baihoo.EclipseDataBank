package com.baiHoo.thread.case2;

/**
 * 生产馒头
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
			System.out.println(" 产馒头：[ baiHoo店馒头 ] -- "+i);
			ManTou m = new ManTou(i,"[ baiHoo店馒头 ] -- "+i);
			ss.push(m);
		}
	}
}
