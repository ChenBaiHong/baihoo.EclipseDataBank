package com.baiHoo.thread.case1;
/**
 * �����ߣ�����
 * @author Administrator
 *
 */
public class Watcher implements Runnable {
	private Movie m ;
	
	/**
	 * �����ߣ��ۿ���Ӱ
	 * @param m
	 */
	public Watcher(Movie m) {
		super();
		this.m = m;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++){
			m.watch();
		}
	}

}
