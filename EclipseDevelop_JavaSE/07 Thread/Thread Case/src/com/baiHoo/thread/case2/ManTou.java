package com.baiHoo.thread.case2;

/**
 * ��ͷ
 * 
 * @author Administrator
 *
 */
public class ManTou {
	/**
	 * @param customCode ��ͷ�������
	 * @param name ��ͷ����
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