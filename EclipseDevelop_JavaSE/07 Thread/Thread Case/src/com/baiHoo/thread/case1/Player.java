package com.baiHoo.thread.case1;
/**
 * �����ߣ���Ա
 * @author Administrator
 *
 */
public class Player implements Runnable {
	private Movie m ;
	
	/**
	 * ��������Ա���������ݵĵ�Ӱ��Ʒ
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
				m.play("������");
			}else{
				m.play("�Ұ׻�");
			}
		}
	}

}
