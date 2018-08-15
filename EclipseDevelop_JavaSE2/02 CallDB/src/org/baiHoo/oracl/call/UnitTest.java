package org.baiHoo.oracl.call;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 *<p>类名称:UnitTest.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月22日
 */
public class UnitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根
		String strRet = "";
		List list = new ArrayList();
		CallDBOrcl CallDBOrcl = new CallDBOrcl();
		/*
		list.add("601");
		list.add(1);
		list.add("I_TITLE");
		list.add("I_MESSAGE");
		list.add("jiangm");
		list.add("2012-02-23 11:11:33");
		list.add("I_NOTE");
		try {
			returnvalue = CallDBOrcl.callProcedureCommon("SYS_COMMON_PKG.SYS_MSG_HANDLE_BY_DEPT",list);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		*/
		  
		list.add("222");
		list.add("222");
		list.add("222");
		list.add("222");
		list.add("222");
		try {
			strRet = callFunctionForUnitTest("sys_Get_Session_Info_pkg.Set_User_Info",list);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}

	}
	
	public static String callFunctionForUnitTest(String procedure,List listParam)throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String strUrl = "jdbc:oracle:thin:@192.168.0.236:1521:erptest";
		String strRet = "";
		Connection conn = null;//ConnectionHelper.getCurrentContributionConnection("default");
		
		Class.forName(driver);
	    conn = DriverManager.getConnection(strUrl, "apps", "cape");
	    
	    CallableStatement cs = null; 
	    
	  try {
		  cs = conn.prepareCall("{call sys_Get_Session_Info_pkg.SET_ROLE_ID(?)}");
		  cs.registerOutParameter(1,java.sql.Types.VARCHAR); 
		  System.out.println("now set 222@@@@@");
		  cs.setString(1,"222"); 
		  cs.execute(); 
		  
		  cs = conn.prepareCall("{? = call sys_Get_Session_Info_pkg.get_role_id}"); 
		  cs.registerOutParameter(1,java.sql.Types.VARCHAR); 
		  cs.execute(); 
		  strRet = cs.getString(1);
		  System.out.println("222@@@@@");
		  System.out.println("222@@@@@");
		  System.out.println("222@@@@@");
		  System.out.println(strRet);
		  System.out.println("222@@@@@");
		  System.out.println("222@@@@@");
		  System.out.println("222@@@@@");
			
		} catch (SQLException e) {			
			throw e;
		}	finally{
			cs.close();
			conn.commit();
			conn.close();
		}
		return strRet;
	}
}
