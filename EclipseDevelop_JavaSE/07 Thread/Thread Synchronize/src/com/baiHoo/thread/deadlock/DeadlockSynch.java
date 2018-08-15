package com.baiHoo.thread.deadlock;
/**
 * �����ͬ�����������������
 * @author Administrator
 *
 */
public class DeadlockSynch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��
		Object goods =new Object();
		// Ǯ
		Object money = new Object();
		// Ǯ��ҵ����
		Business bus1 =new Business(goods,money);
		Business2 bus2 = new Business2(goods,money);
		Thread proxy = new Thread(bus1);
		Thread proxy2 = new Thread(bus2);
		proxy.start();
		proxy2.start();
	}

}
/**
 * ҵ����1
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
	 * @describe  �ȸ������Ǯ
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
		System.out.println("һ�ָ�Ǯ");
	}
}
/**
 * ҵ����2
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
	 * @describe  �ȸ�Ǯ�����
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
		System.out.println("һ�ָ���");
	}
}



