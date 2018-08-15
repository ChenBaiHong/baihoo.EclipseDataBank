package org.baiHoo.oracl.call;




/**
 * 
 * 
 *<p>类名称:ReturnValue.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月22日
 */
public class ReturnValue {
	
    public ReturnValue(int code,String msg,Object obj,String value){
		this.setIntResultCode(code);
		this.setStrResultMessage(msg);
		this.setObjReturnObject(obj);
		this.setStrResultValue(value);
	}
    
    public ReturnValue(){
    	
    }
	
	private int intResultCode;         //����������ͣ�ͨ��CodeCollection�еľ�̬��������ȡ
	private String strResultMessage;   //���������Ϣ������������Ϣ���߾�����Ϣ
	private Object objReturnObject;	   //Mgr�����ֵ������VO,map
	private String StrResultValue;
	/**
	 * @return the intResultCode
	 */
	public int getIntResultCode() {
		return intResultCode;
	}
	/**
	 * @param intResultCode the intResultCode to set
	 */
	public void setIntResultCode(int intResultCode) {
		this.intResultCode = intResultCode;
	}
	/**
	 * @return the strResultMessage
	 */
	public String getStrResultMessage() {
		return strResultMessage;
	}
	/**
	 * @param strResultMessage the strResultMessage to set
	 */
	public void setStrResultMessage(String strResultMessage) {
		this.strResultMessage = strResultMessage;
	}
	
	public String getStrResultValue() {
		return StrResultValue;
	}
	
	public void setStrResultValue(String StrResultValue) {
		this.StrResultValue = StrResultValue;
	}
	/**
	 * @return the objReturnObject
	 */
	public Object getObjReturnObject() {
		return objReturnObject;
	}
	/**
	 * @param objReturnObject the objReturnObject to set
	 */
	public void setObjReturnObject(Object objReturnObject) {
		this.objReturnObject = objReturnObject;
	}
	
	/**
     * �жϷ���ֵ�Ƿ�ɹ������ҷ�����Ϣ�ǿ�
     * @param rv
     * @return
     * @author Mayi
     * @since 2009��3��25��
     */
	public boolean isSuccessedAndReturnMessageNotNull(ReturnValue rv) {
        if (rv != null && rv.getIntResultCode() == CodeCollection.SUCCESS
                && rv.getStrResultMessage() != null) {
            return true;
        } else {
            return false;
        }
    }
	
	/**
     * �жϷ���ֵ�Ƿ�ɹ������ҷ��ض���ǿ�
     * @param rv
     * @return
     * @author Mayi
     * @since 2009��3��25��
     */
	public boolean isSuccesedAndReturnObjNotNull(ReturnValue rv) {
        if (rv != null && rv.getIntResultCode() == CodeCollection.SUCCESS
                && rv.getObjReturnObject() != null) {
            return true;
        } else {
            return false;
        }
    }
	
	/**
     * �жϷ���ֵ�Ƿ�ʧ�ܣ����ҷ�����Ϣ�ǿ�
     * @param rv
     * @return
     * @author Mayi
     * @since 2009��3��25��
     */
	public boolean isFailAndReturnMessageNotNull(ReturnValue rv) {
        if (rv != null && rv.getIntResultCode() == CodeCollection.FAIL
                && rv.getStrResultMessage() != null) {
            return true;
        } else {
            return false;
        }
    }
	
}
