package com.baiHoo.thread.pattern;

/**
 * �������ģʽ:ȷ��һ����ֻ��һ������
 * @author Administrator
 *
 */
public class SingleCasePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleCasePatternThread thread1 = new SingleCasePatternThread(100);
		SingleCasePatternThread thread2 = new SingleCasePatternThread(500);
		thread1.start();
		thread2.start();
		
	}

}
class SingleCasePatternThread extends Thread{
	private long time;
	public SingleCasePatternThread() {
	}
	public SingleCasePatternThread(long time) {
		this.time =time;
	}
	@Override
	public void run() {		
		System.out.println(Thread.currentThread().getName()+"-->����:"+SingleCasePattern.getInstance(time));
	}
}


/**
 * �������ģʽ
 * ȷ��һ����ֻ��һ������
 * ����ʽ  double checking
 * 1��������˽�л�,�����ⲿֱ�Ӵ�������
 * 2������һ��˽�еľ�̬����
 * 3������һ������Ĺ����ľ�̬���� ���ʸñ������������û�ж��󣬴����ö���
 */
class SingleCasePattern {
	//����һ��˽�еľ�̬����
	private static SingleCasePattern instance =null;	
	//������˽�л�,�����ⲿֱ�Ӵ�������
	private SingleCasePattern(){
		
	}
	//����һ������Ĺ����ľ�̬���� ���ʸñ������������û�ж��󣬴����ö���
	public static SingleCasePattern getInstance(long time){
		// c d e  -->Ч��  �ṩ �Ѿ����ڶ���ķ���Ч��
		if(null==instance){	
			// a b
			synchronized(SingleCasePattern.class){
				if(null==instance ){
					try {
						Thread.sleep(time); //��ʱ ���Ŵ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance =new SingleCasePattern();
				}
			}
	  }//a
	  return instance;
	}
	
	
	public static SingleCasePattern getInstance3(long time){
		//a b c d e  -->Ч�ʲ��� c  ���ڶ���Ҳ��Ҫ�ȴ�
		synchronized(SingleCasePattern.class){
			if(null==instance ){
				try {
					Thread.sleep(time); //��ʱ ���Ŵ����
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				instance =new SingleCasePattern();
			}
			return instance;
		}
	}
	
	
	public static synchronized SingleCasePattern getInstance2(long time){
		if(null==instance ){
			try {
				Thread.sleep(time); //��ʱ ���Ŵ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance =new SingleCasePattern();
		}
		return instance;
	}
	
	
	
	public static SingleCasePattern getInstance1(long time){
		if(null==instance ){
			try {
				Thread.sleep(time); //��ʱ ���Ŵ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance =new SingleCasePattern();
		}
		return instance;
	}
}