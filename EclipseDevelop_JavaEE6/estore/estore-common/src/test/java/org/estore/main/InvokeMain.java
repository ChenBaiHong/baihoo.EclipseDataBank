package org.estore.main;

import org.estore.common.bean.GenEntityOracle;
import org.estore.common.excel.ExcelToOracle;

/**
 * 
 *
 *<p> 项目名称：baiHoo 电子商城</p>
 *<p>类名称:InvokeUtils.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月8日上午8:59:01
 */
public class InvokeMain {
	
	public static void main(String[] args) throws Exception {
		ExcelToOracle excelToOra = new ExcelToOracle();
		excelToOra.importDataStoreIn("C:/Users/Administrator/Desktop/库房台账导入模板.xls", 500);
	}
	public void invokeGenEntityOracle() throws Exception {
		String uRL="jdbc:oracle:thin:@192.168.0.99:1521/fdmp";
		String nAME="fdmp"; 
		String pASS="cape";
		String packageOutPath="org.estore.common.bean";
		String authorName="baiHoo.Chen";
		GenEntityOracle genE = new GenEntityOracle(uRL , nAME , pASS , packageOutPath ,authorName);
		genE.generate("FDMP_STORE_IN");
	}
	
}
