package com.baiHoo.test.exception;
/**
 * 
 * @author baiHoo.Chen
 *	�����쳣
 */
@SuppressWarnings("all")
public class TestException {
	public static void main(String[] args) {
		TestException test= new TestException();
		test.numberFormatException();
	}
	/**
	 * �׳����������쳣
	 */
	private  void arithmeticException() {
		int i = 1/0;
	}
	/**
	 * �׳���ָ���쳣
	 */
	private   void nullPointException() {
		TestException test=null;
		test.arithmeticException();
	}
	/**
	 * ��ǿת�쳣
	 */
	private void classCastException() {
			Object obj = new Object();
			if(obj instanceof TestException) {
				TestException test= (TestException) obj;
			}
			//TestException test= (TestException) obj;
	}
	/**
	 * �����±�Խ���쳣
	 */
	private void arrayIndexOutOfBoundsException() {
		int[] nums = {1,2,2};
		int index=3;
		System.out.println(nums[index]);
	}
	/**
	 * ���ָ�ʽ���쳣
	 */
	private void numberFormatException() {
		String numc = "1234ui";
		Integer integer = new Integer(numc);
		System.out.println(integer);
	}
}
