package org.estore.bs.bean.genbean;

import org.junit.Test;

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
public class InvokeUtils {
	@Test
	public void invokeGenEntityOracle() throws Exception {
		String uRL="jdbc:oracle:thin:@192.168.0.99:1521/fdmp";
		String nAME="fdmp"; 
		String pASS="cape";
		String packageOutPath="edu.baiHoo.estore.bs.bean.bean";
		String authorName="baiHoo.Chen";
		GenEntityOracle genE = new GenEntityOracle(uRL , nAME , pASS , packageOutPath ,authorName);
		genE.generate("FDMP_STORE_IN");
		
	}
}
