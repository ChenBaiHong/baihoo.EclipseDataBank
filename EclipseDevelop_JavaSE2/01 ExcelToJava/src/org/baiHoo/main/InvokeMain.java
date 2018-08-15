package org.baiHoo.main;

import org.baiHoo.db.GenEntityOracle;
import org.baiHoo.utils.ExcelUtils;

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
		//ExcelBsiToOracle excelToOra = new ExcelBsiToOracle();
		//excelToOra.importDataStoreIn("C:\\Users\\Administrator\\Desktop\\库房台账附件导入模板.xls", 500);
		//ExcelTemplate excelTemp = new ExcelTemplate();
		//excelTemp.importDataStoreIn("C:\\Users\\Administrator\\Desktop\\SIMC_STORE_IN2.xls", "org.estore.common.bean.SimcStoreIn", 500);
		//ExcelUtils.exportExcel(exportObjects, exportInfo, templateFilename)
	}
	public static void invokeGenEntityOracle() throws Exception {
		String uRL="jdbc:oracle:thin:@192.168.1.8:1521/orcl";
		String nAME="BEST"; 
		String pASS="123456";
		String packageOutPath="org.baiHoo.bean";
		String authorName="baiHoo.Chen";
		GenEntityOracle genE = new GenEntityOracle(uRL , nAME , pASS , packageOutPath ,authorName);
		genE.generate("SIMC_STORE_IN");
	}
	
}
