package com.baiHoo.test.exception;
/**
 * 
 * @author baiHoo.Chen
 *	测试异常
 */
@SuppressWarnings("all")
public class TestException {
	public static void main(String[] args) {
		TestException test= new TestException();
		test.numberFormatException();
	}
	/**
	 * 抛出算术计算异常
	 */
	private  void arithmeticException() {
		int i = 1/0;
	}
	/**
	 * 抛出空指针异常
	 */
	private   void nullPointException() {
		TestException test=null;
		test.arithmeticException();
	}
	/**
	 * 类强转异常
	 */
	private void classCastException() {
			Object obj = new Object();
			if(obj instanceof TestException) {
				TestException test= (TestException) obj;
			}
			//TestException test= (TestException) obj;
	}
	/**
	 * 数组下标越界异常
	 */
	private void arrayIndexOutOfBoundsException() {
		int[] nums = {1,2,2};
		int index=3;
		System.out.println(nums[index]);
	}
	/**
	 * 数字格式化异常
	 */
	private void numberFormatException() {
		String numc = "1234ui";
		Integer integer = new Integer(numc);
		System.out.println(integer);
	}
}
