package com.baiHoo.thread.case1;
/**
 * 
 * @author Administrator
 *	��������������
 */
public class Application {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//��ͬ����Դ
		Movie m = new Movie();
		
		//���߳�
		Player p = new Player(m);
		Watcher w = new Watcher(m);
		
		new Thread(p).start();		
		new Thread(w).start();
	}
}
