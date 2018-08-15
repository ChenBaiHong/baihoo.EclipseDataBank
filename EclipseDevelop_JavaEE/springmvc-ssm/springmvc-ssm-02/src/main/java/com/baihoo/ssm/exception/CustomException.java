package com.baihoo.ssm.exception;

/**
 * 自定義異常類
 * @author Administrator
 *
 */
public class CustomException  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//異常信息
	private String message;
	public CustomException(String message) {
		super(message);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
		
}
