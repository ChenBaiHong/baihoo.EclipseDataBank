package com.baiHoo.thread.pattern;

/**
 * ����ʽ
   1)��������˽�л� 
 * 2)������˽�еľ�̬����,ͬʱ�����ö���
 * 3)�������ṩ�������Եľ�̬����
 * @author Administrator
 *
 */
public class HungryPatternDemo {
	private static HungryPatternDemo instance =new HungryPatternDemo();
	private HungryPatternDemo(){
		
	}
	public static HungryPatternDemo getInstance (){		
		return instance;
	}

}
/**
 * ����ʹ�õ�ʱ����� ���ӻ�����ʱ��
 * @author Administrator
 *
 */
class HungryPattern2 {
	private static class JVMholder{
		private static HungryPattern2 instance =new HungryPattern2();
	}
	private HungryPattern2(){
		
	}
	public static HungryPattern2 getInstance (){		
		return JVMholder.instance;
	}

}
