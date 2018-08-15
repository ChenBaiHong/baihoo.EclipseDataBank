package com.baiHoo.thread.status;

/**
 * yield 状态实例
 * yield: 退让，退位;
 * @author Administrator
 *		
 */
public class YieldDemo01 extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		YieldDemo01 demo = new YieldDemo01();
		Thread t = new Thread(demo); //新生
		t.start();//就绪
		//cpu调度 运行
		
		
		for(int i=0;i<1000;i++){
			if(i%20==0){
				// (暂停)本线程 main 为另一个线程退让
				Thread.yield();
			}
			System.out.println("main...."+i);
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("yield...."+i);
		}
	}

}
