package com.baiHoo.thread.case1;
/**
 * 消费者，观众
 * @author Administrator
 *
 */
public class Watcher implements Runnable {
	private Movie m ;
	
	/**
	 * 消费者，观看电影
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
