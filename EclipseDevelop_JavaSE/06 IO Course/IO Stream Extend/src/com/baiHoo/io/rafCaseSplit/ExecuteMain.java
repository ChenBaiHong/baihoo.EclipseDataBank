package com.baiHoo.io.rafCaseSplit;

/**
 * 
 * @author Administrator
 *
 */
public class ExecuteMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RafFileSplit split = new RafFileSplit("D:/Desktop Pictures/01.jpg","D:/Desktop Pictures/Temp",51);
		//�_ʼ�и�
		split.split();
		//�и�ϲ�����һ���ļ�
		split.merge("D:/Desktop Pictures/Test/����.jpg");
	}
}
