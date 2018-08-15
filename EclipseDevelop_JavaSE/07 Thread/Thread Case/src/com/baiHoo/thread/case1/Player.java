package com.baiHoo.thread.case1;
/**
 * 生产者，演员
 * @author Administrator
 *
 */
public class Player implements Runnable {
	private Movie m ;
	
	/**
	 * 生产者演员，产出表演的电影作品
	 * @param m
	 */
	public Player(Movie m) {
		super();
		this.m = m;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++){
			if(0==i%2){
				m.play("左青龙");
			}else{
				m.play("右白虎");
			}
		}
	}

}
