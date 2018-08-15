package org.baiHoo.bean;

import java.io.Serializable;

/**
 * 
 *
 *<p> 项目名称：baiHoo 电子商城</p>
 *<p>类名称:FdmpStoreInExt.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月12日下午2:52:33
 */
public class BaseBean  implements Serializable ,Cloneable  {
	
	 public Object clone()  { 
		 BaseBean o=null; 
		 try { 
			 o=(BaseBean)super.clone(); 
		 } catch(CloneNotSupportedException e) { 
			 System.out.println(e.toString()); 
		 } 
		 return o; 
	  }  
}
