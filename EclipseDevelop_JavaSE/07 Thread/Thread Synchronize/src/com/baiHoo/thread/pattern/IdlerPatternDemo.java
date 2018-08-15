package com.baiHoo.thread.pattern;
/**
 * ���������ķ�ʽ
 * 1������ʽ
 * 1)��������˽�л�
 * 2)������˽�еľ�̬����
 * 3)�������ṩ�������Եľ�̬������ȷ���ö������
 * 
 * @author Administrator
 *
 */
public class IdlerPatternDemo {
	private static IdlerPatternDemo instance;
	private IdlerPatternDemo(){
		
	}
	public static IdlerPatternDemo getInstance (){
		if(null==instance){ //�ṩЧ��
			synchronized(IdlerPatternDemo.class){
				if(null==instance){ //��ȫ
					instance =new IdlerPatternDemo();
				}
			}
		}
		return instance;
	}
}
