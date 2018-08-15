package com.baiHoo.thread.case2;

/**
 * 馒头
 * 
 * @author Administrator
 *
 */
public class ManTou {
	/**
	 * @param customCode 馒头产出标号
	 * @param name 馒头名称
	 */
	Integer customCode;
	String customName ; 
	
	/**
	 * 
	 * @param customCode
	 * @param customName
	 */
	ManTou(Integer customCode,String customName) {
		this.customCode = customCode;
		this.customName=customName;
	}

	@Override
	public String toString() {
		return  customName;
	}
}