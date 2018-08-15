package com.baihoo.springboot.service;

/**
 * 模擬銀行轉賬業務，測試事務的提交
 * @author Administrator
 *
 */
public interface BhAccountService {
	/**
	 * 模擬銀行轉賬方法
	 * 
	 * @param from 轉賬人，
	 * @param to		收款人
	 * @param money 轉入金額
	 * @throws Exception
	 */
	public void transferAccount(String from , String to , Double money) throws Exception;
}
