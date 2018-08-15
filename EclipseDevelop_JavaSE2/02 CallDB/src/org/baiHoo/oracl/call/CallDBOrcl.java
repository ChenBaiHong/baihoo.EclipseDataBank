package org.baiHoo.oracl.call;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.baiHoo.oracl.db.MyOraDbUtils;



/**
 * 
 * 
 *<p>类名称:CallDBOrcl.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月22日
 */
public class CallDBOrcl {
	public static int FAIL=-1;
	public static int SUCCESS=1;
	/**
	 * 调用存储过程
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public ReturnValue callProcedureCommon(String procedure,List listParam)throws Exception{
		ReturnValue returnValue = new ReturnValue();
		String vCall = "{call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			
			Object obj = listParam.get(i);
			if(obj==null){// 在不改变原有功能代码的基础上，加上如果参数为null时，赋值为空字符串,解决null.toString()会报空指针的异常，create
							// by 胡刚 20120517
				obj = "";
				vCall += "'" + obj.toString() + "',";				
			}else{
				vCall += "'" + listParam.get(i).toString() + "',";		
			}
		}
		vCall += "?,?)}";
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try{
			// 在事务环境下，获取的是当前事务中跟当前线程绑定的数据源连接，
			// 如果没有找到数据源连接，则创建一个新的连接，绑定到事务中。
			// 在非事务环境下，直接从数据源取得连接。
			// CallableStatement cstmt;
				cstmt = conn.prepareCall(vCall);	
				cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
				cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
				cstmt.execute();	
				returnValue.setIntResultCode(cstmt.getInt(1));
				returnValue.setStrResultMessage(cstmt.getString(2));
				if (returnValue.getIntResultCode() != 0 && returnValue.getIntResultCode() != 2) {
					throw new Exception(returnValue.getStrResultMessage());
				}
				// cstmt.close();
				
		} catch (SQLException e) {	
			returnValue.setIntResultCode(FAIL);
			returnValue.setStrResultMessage(e.getLocalizedMessage());
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
				cstmt = null;
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return returnValue;
	}
	
	/**
	 * "调用存储过程"
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public ReturnValue callProcedureCommonNoReturn(String procedure,List listParam)throws Exception{
		ReturnValue returnValue = new ReturnValue();
		String vCall = "{call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			
			Object obj = listParam.get(i);
			if(obj==null){// 在不改变原有功能代码的基础上，加上如果参数为null时，赋值为空字符串,解决null.toString()会报空指针的异常，create
							// by 胡刚 20120517
				obj = "";
				vCall += "'" + obj.toString() + "',";				
			}else{
				if(i == listParam.size() - 1){
					vCall += "'" + listParam.get(i).toString()+"'";
					break;
				}
				vCall += "'" + listParam.get(i).toString() + "',";		
			}
		}
		vCall += ")}";
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try{
			// 在事务环境下，获取的是当前事务中跟当前线程绑定的数据源连接，
			// 如果没有找到数据源连接，则创建一个新的连接，绑定到事务中。
			// 在非事务环境下，直接从数据源取得连接。
			// CallableStatement cstmt;
				cstmt = conn.prepareCall(vCall);	
				cstmt.execute();	
				returnValue.setIntResultCode(0);
				returnValue.setStrResultMessage("成功");
				if (returnValue.getIntResultCode() != 0 && returnValue.getIntResultCode() != 2) {
					throw new Exception(returnValue.getStrResultMessage());
				}
				// cstmt.close();
				
		} catch (SQLException e) {	
			returnValue.setIntResultCode(FAIL);
			returnValue.setStrResultMessage(e.getLocalizedMessage());
// manager.rollback();
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
				cstmt = null;
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return returnValue;
	}
	
	/**
	 * 和上面一个实质上是一样的，只是先拼接vCall，再赋值
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public ReturnValue callProcedureCommon2(String procedure,List listParam)throws Exception{
		ReturnValue returnValue = new ReturnValue();
		String vCall = "{call " + procedure + " (";
		for(int i = 0;i < listParam.size();i++){
				vCall += "?,";
		}
		vCall += "?,?)}";	
		Connection conn =MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// 在事务环境下，获取的是当前事务中跟当前线程绑定的数据源连接，
		// 如果没有找到数据源连接，则创建一个新的连接，绑定到事务中。
		// 在非事务环境下，直接从数据源取得连接。
		// CallableStatement cstmt;
		// cstmt = conn.prepareCall(vCall);
			cstmt = conn.prepareCall(vCall);
			for(int i = 0;i < listParam.size();i++){
				cstmt.setObject(i + 1, listParam.get(i));
			}
			cstmt.registerOutParameter(listParam.size()+1,java.sql.Types.INTEGER);
			cstmt.registerOutParameter(listParam.size()+2,java.sql.Types.VARCHAR);
			cstmt.execute();	
			returnValue.setIntResultCode(cstmt.getInt(listParam.size()+1));
			returnValue.setStrResultMessage(cstmt.getString(listParam.size()+2));
			
		// 事务提交的同时，连接会自动关闭
	}catch(Exception e){
		returnValue.setIntResultCode(FAIL);
		returnValue.setStrResultMessage(e.getLocalizedMessage());
		throw e;
	} finally{
		if(cstmt != null) {
			cstmt.close();
			cstmt = null;
		}
		if(conn != null && !conn.isClosed()) {
			conn.close();
		}
	}
		return returnValue;
	}
	
	/**
	 * 调用函数，返回值为int型，不带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public int callFunction(String procedure,List listParam)throws Exception{
		int number;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			if(listParam.get(i) == null){
				if (i == listParam.size() - 1){
					vCall += "''";
				}else{
					vCall += "'',";
				}
			}
			else{
				if (i == listParam.size() - 1){
					vCall += "'" + listParam.get(i).toString() + "'";
				}else{
					vCall += "'" + listParam.get(i).toString() + "',";
				}	
			}
		}
		vCall += ")}";	
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
			cstmt.execute();	
			number = cstmt.getInt(1);
			
		} catch (SQLException e) {	
			
// manager.rollback();
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}	
		return number;	
	}
	/**
	 * 调用函数，返回值为String型，不带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public String callFunction2(String procedure,List listParam)throws Exception{
		String root;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			if(listParam.get(i) == null){
				if (i == listParam.size() - 1){
					vCall += "''";
				}else{
					vCall += "'',";
				}
			}
			else{
				if (i == listParam.size() - 1){
					vCall += "'" + listParam.get(i).toString() + "'";
				}else{
					vCall += "'" + listParam.get(i).toString() + "',";
				}	
			}
		} 
		vCall += ")}";	
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.VARCHAR);
			cstmt.execute();	
			
			root = cstmt.getString(1);
			
			
		} catch (SQLException e) {	
// manager.rollback();
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return root;	
	}
	/**
	 * 调用函数，返回值为String型，带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public String callFunction3(String procedure,List listParam)throws Exception{
		String root;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			Object obj = listParam.get(i);
			if(obj==null){
				vCall += "'',";				
				}
			else{
				vCall += "'" + listParam.get(i).toString() + "',";
			}
		} 
		vCall += "?,?)}";	
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.VARCHAR);
			cstmt.registerOutParameter(2,java.sql.Types.INTEGER);
			cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);
			cstmt.execute();	
			root = cstmt.getString(1);
			
		} catch (SQLException e) {	
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return root;	
	}
	/**
	 * 调用函数，返回值为int型，带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public int callFunction4(String procedure,List listParam)throws Exception{
		int number;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			Object obj = listParam.get(i);
			if(obj==null){
				vCall += "'',";				
				}
			else{
				vCall += "'" + listParam.get(i).toString() + "',";
			}
		} 
		vCall += "?,?)}";
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
			cstmt.registerOutParameter(2,java.sql.Types.INTEGER);
			cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);
			cstmt.execute();	
			number = cstmt.getInt(1);
			
		} catch (SQLException e) {	
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}	
		return number;	
	}
	

	/**
	 * 调用函数，返回值为int型，不带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public int callFunctionReturnIntNo(String procedure,List listParam)throws Exception{
		int number;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			if(listParam.get(i) == null){
				if (i == listParam.size() - 1){
					vCall += "''";
				}else{
					vCall += "'',";
				}
			}
			else{
				if (i == listParam.size() - 1){
					vCall += "'" + listParam.get(i).toString() + "'";
				}else{
					vCall += "'" + listParam.get(i).toString() + "',";
				}	
			}
		}
		vCall += ")}";	
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
			cstmt.execute();	
			number = cstmt.getInt(1);
			
		} catch (SQLException e) {	
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}	
		return number;	
	}
	/**
	 * 调用函数，返回值为String型，不带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public String callFunctionReturnStringNo(String procedure,List listParam)throws Exception{
		String root;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			if(listParam.get(i) == null){
				if (i == listParam.size() - 1){
					vCall += "''";
				}else{
					vCall += "'',";
				}
			}
			else{
				if (i == listParam.size() - 1){
					vCall += "'" + listParam.get(i).toString() + "'";
				}else{
					vCall += "'" + listParam.get(i).toString() + "',";
				}	
			}
		} 
		vCall += ")}";
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.VARCHAR);
			cstmt.execute();	
			
			root = cstmt.getString(1);
			
			
		} catch (SQLException e) {	
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return root;	
	}
	/**
	 * 调用函数，返回值为String型，带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public String callFunctionReturnString(String procedure,List listParam)throws Exception{
		String root;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			Object obj = listParam.get(i);
			if(obj==null){
				vCall += "'',";				
				}
			else{
				vCall += "'" + listParam.get(i).toString() + "',";
			}
		} 
		vCall += "?,?)}";	
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.VARCHAR);
			cstmt.registerOutParameter(2,java.sql.Types.INTEGER);
			cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);
			cstmt.execute();	
			root = cstmt.getString(1);
			
		} catch (SQLException e) {	
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return root;	
	}
	/**
	 * 调用函数，返回值为int型，带o_return_int和o_return_string字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public int callFunctionReturnInt(String procedure,List listParam)throws Exception{
		int number;
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			Object obj = listParam.get(i);
			if(obj==null){
				vCall += "'',";				
				}
			else{
				vCall += "'" + listParam.get(i).toString() + "',";
			}
		} 
		vCall += "?,?)}";
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
		// Connection conn =
		// MyOraDbUtils.getConnection();
		// conn.setAutoCommit(false);
		// CallableStatement cstmt = null;
			cstmt = conn.prepareCall(vCall);	
			cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
			cstmt.registerOutParameter(2,java.sql.Types.INTEGER);
			cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);
			cstmt.execute();	
			number = cstmt.getInt(1);
			
		} catch (SQLException e) {	
			throw e;
		} finally{
			if(cstmt != null) {
				cstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}	
		return number;	
	}
	
	/**
	 * 新增一个调用存储过程的方法
	 * 调用函数，不带返回字段
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public String callFunctionCommonNoOut(String procedure, List listParam) throws Exception {
		String value = "";
		String vCall = "{ ?=call " + procedure + "(";
		for(int i = 0;i<listParam.size();i++){
			if(listParam.get(i) == null){
				if (i == listParam.size() - 1){
					vCall += "''";
				}else{
					vCall += "'',";
				}
			}
			else{
				if (i == listParam.size() - 1){
					vCall += "'" + listParam.get(i).toString() + "'";
				}else{
					vCall += "'" + listParam.get(i).toString() + "',";
				}	
			}
		}
		vCall += ")}";
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
			cstmt = conn.prepareCall(vCall);
			// 对返回值进行注册
			cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
			cstmt.execute();
			// 存放返回数据，操作标识，操作反馈消息
			value = cstmt.getString(1);
		} catch (SQLException e) {
			throw e;
		} finally {
			if (cstmt != null) {
				cstmt.close();
			}
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return value;
	}
	
	/**
	 * 调用函数，返回值为String型，带o_return_int和o_return_string字段
	 * 新增一个调用存储过程的方法
	 * @param procedure
	 * @param listParam
	 * @return
	 * @throws Exception
	 */
	public String callFunctionCommon(String procedure, List listParam) throws Exception {
		ReturnValue returnValue = new ReturnValue();
		String value = "";
		String vCall = "{ ?=call " + procedure + "(";
		for (int i = 0; i < listParam.size(); i++) {
			Object obj = listParam.get(i);
			if (obj == null) {
				vCall += "'',";
			} else {
				vCall += "'" + listParam.get(i).toString() + "',";
			}
		}
		vCall += "?,?)}";
		Connection conn = MyOraDbUtils.getConnection();
		CallableStatement cstmt = null;
		try {
			cstmt = conn.prepareCall(vCall);
			// 对返回值进行注册
			cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			cstmt.execute();
			// 存放返回数据，操作标识，操作反馈消息
			value = cstmt.getString(1);
			returnValue.setStrResultValue(cstmt.getString(1));
			returnValue.setIntResultCode(cstmt.getInt(2));
			returnValue.setStrResultMessage(cstmt.getString(3));
			// 如果数据库返回操作标识为失败，抛出异常
			if (returnValue.getIntResultCode() != 0 && returnValue.getIntResultCode() != 2) {
				throw new Exception(returnValue.getStrResultMessage());
			}

		} catch (SQLException e) {
			throw e;
		} finally {
			if (cstmt != null) {
				cstmt.close();
			}
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		return value;
	}
	
	/**
	 * AO校验不通过的数据放行的存储过程
	 * @param planid
	 * @return
	 * @throws Exception
	 */
	public int callAoInterFP(String planid) throws Exception {
		List list = new LinkedList();
		list.add(planid);
		ReturnValue val = callProcedureCommon("CAC_AO_INTERFACE_PKG.aointer_f_p", list);
		return val.getIntResultCode();
	}
	
	/**
	 * AO校验不通过的数据打回的存储过程
	 * @param planid
	 * @return
	 * @throws Exception
	 */
	public int callAoInterDP(String planid) throws Exception {
		List list = new LinkedList();
		list.add(planid);
		ReturnValue val = callProcedureCommon("CAC_AO_INTERFACE_PKG.aointer_d_p", list);
		return val.getIntResultCode();
	}
	
	/*
	 * PROCEDURE SYS_EXCEPTION_HANDLE( i_ERROR_CODE IN VARCHAR2, i_ERROR_NAME IN
	 * VARCHAR2, i_ERROR_DESC IN VARCHAR2, i_ERROR_USERID IN VARCHAR2,
	 * i_ORIGIN_DATA IN VARCHAR2, i_LAST_UPDATE_DATE IN VARCHAR2,
	 * i_LAST_UPDATED_BY IN VARCHAR2, i_CREATION_DATE IN VARCHAR2, i_CREATED_BY
	 * IN VARCHAR2, i_LAST_UPDATE_IP IN VARCHAR2, O_RET_INT OUT INTEGER,
	 * O_RET_STRING OUT VARCHAR2)
	 */
	public static  void main(String args[])
	{
		ReturnValue returnvalue = new ReturnValue();
		List list = new ArrayList();
		CallDBOrcl callDBProcedureUtil = new CallDBOrcl();
		/*
		 * list.add("601"); list.add(1); list.add("I_TITLE");
		 * list.add("I_MESSAGE"); list.add("jiangm"); list.add("2012-02-23
		 * 11:11:33"); list.add("I_NOTE"); try { returnvalue =
		 * callDBProcedureUtil.callProcedureCommon("SYS_COMMON_PKG.SYS_MSG_HANDLE_BY_DEPT",list); }
		 * catch (Exception e) { // TODO 自动生成 catch 块 e.printStackTrace(); }
		 */
		  
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		try {
			returnvalue = callDBProcedureUtil.callProcedureCommon("sys_Get_Session_Info_pkg.Set_Role_Id",list);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		
		List list2 = new ArrayList();
		String strRet = "";
		try {
			strRet = callDBProcedureUtil.callFunctionForUnitTest("sys_Get_Session_Info_pkg.get_role_id",list2);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
	}
	
	/*
	 * for 单元测试
	 */
	/*
	 *  public ReturnValue callProcedureCommon(String procedure,List
	 * listParam)throws Exception{ String driver =
	 * "oracle.jdbc.driver.OracleDriver"; String strUrl =
	 * "jdbc:oracle:thin:@192.168.0.236:1521:erptest";
	 * 
	 * ReturnValue returnValue = new ReturnValue(); String vCall = "{call " +
	 * procedure + "("; for(int i = 0;i<listParam.size();i++){ vCall += "'" +
	 * listParam.get(i).toString() + "',"; } vCall += "?,?)}"; Connection conn =
	 * null;//MyOraDbUtils.getConnection();
	 * 
	 * Class.forName(driver); conn = DriverManager.getConnection(strUrl, "apps",
	 * "cape");
	 * 
	 * 
	 * CallableStatement cstmt = null; try { cstmt = conn.prepareCall(vCall);
	 * cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
	 * cstmt.registerOutParameter(2,java.sql.Types.VARCHAR); cstmt.execute();
	 * returnValue.setIntResultCode(cstmt.getInt(1));
	 * returnValue.setStrResultMessage(cstmt.getString(2));
	 * 
	 *  } catch (SQLException e) { throw e; } finally{ cstmt.close();
	 * conn.commit(); conn.close(); } return returnValue; }
	 */
	
	public String callFunctionForUnitTest(String procedure,List listParam)throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String strUrl = "jdbc:oracle:thin:@192.168.0.236:1521:erptest";
		String strRet = "";
		Connection conn = null;// MyOraDbUtils.getConnection();
		
		Class.forName(driver);
	    conn = DriverManager.getConnection(strUrl, "apps", "cape");
	    
	    CallableStatement cs = null; 
	    
	  try {
		  cs = conn.prepareCall("{call sys_Get_Session_Info_pkg.SET_ROLE_ID(?)}");
		  cs.registerOutParameter(1,java.sql.Types.VARCHAR); 
		  System.out.println("now set 111@@@@@");
		  cs.setString(1,"111"); 
		  cs.execute(); 
		  
		  cs.close();
			// conn.commit();
			conn.close();
			
		  
		  UnitTest unitTest = new UnitTest();
		  String[] args = null;
		  unitTest.main(args);
		  
		  conn = null;// MyOraDbUtils.getConnection();
			
			Class.forName(driver);
		    conn = DriverManager.getConnection(strUrl, "apps", "cape");
		    
		    cs = null; 
		  
		  cs = conn.prepareCall("{? = call sys_Get_Session_Info_pkg.get_role_id}"); 
		  cs.registerOutParameter(1,java.sql.Types.VARCHAR); 
		  cs.execute(); 
		  strRet = cs.getString(1); 
		  System.out.println("111@@@@@");
		  System.out.println("111@@@@@");
		  System.out.println("111@@@@@");
		  System.out.println(strRet);
		  System.out.println("111@@@@@");
		  System.out.println("111@@@@@");
		  System.out.println("111@@@@@");
			
		} catch (SQLException e) {			
			throw e;
		} finally{
			if(cs != null) {
				cs.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}	
	    
	    /*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * CallableStatement cstmt = null; try { cstmt =
		 * conn.prepareCall(vCall);
		 * cstmt.registerOutParameter(1,java.sql.Types.VARCHAR);
		 * cstmt.execute();
		 * 
		 * strRet = cstmt.getString(1);
		 * 
		 *  } catch (SQLException e) { throw e; } finally{ cstmt.close();
		 * conn.commit(); conn.close(); }
		 */
		return strRet;	
	}
	
}
