package com.baiHoo.thread.deadlock;
/**
 * 过多的同步方法可能造成死锁
 * @author Administrator
 *
 */
public class DeadlockSynch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 货
		Object goods =new Object();
		// 钱
		Object money = new Object();
		// 钱货业务交易
		Business bus1 =new Business(goods,money);
		Business2 bus2 = new Business2(goods,money);
		Thread proxy = new Thread(bus1);
		Thread proxy2 = new Thread(bus2);
		proxy.start();
		proxy2.start();
	}

}
/**
 * 业务交易1
 * @author Administrator
 *
 */
class Business implements Runnable{
	Object goods ;
	Object money ;
	
	public Business(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}

	@Override
	public void run() {
		while(true){
			preGoodsMoney();
		}
	}
	/**
	 * @describe  先给货后给钱
	 */
	public void preGoodsMoney(){
		synchronized(goods){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(money){
				
			}
			
		}
		System.out.println("一手给钱");
	}
}
/**
 * 业务交易2
 * @author Administrator
 *
 */
class Business2  implements Runnable{
	Object goods ;
	Object money ;
	
	public Business2(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}

	@Override
	public void run() {
		while(true){
			preMoneyGoods();
		}
	}
	/**
	 * @describe  先给钱后给货
	 */
	public void preMoneyGoods(){
		synchronized(money){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(goods){
			}
		}
		System.out.println("一手给货");
	}
}



