package com.baihoo.ws.test.client;

import com.baihoo.ws.ws.stub.MobileCodeWS;
import com.baihoo.ws.ws.stub.MobileCodeWSSoap;

/**
 * 测试来自webservice 的外来java 文件
 * @author Administrator
 *
 */
public class TestMobileCodeClient {
	public static void main(String [] args) {
		//创建服务访问点集合
		MobileCodeWS mc = new MobileCodeWS();
		//更具服务访问点获取绑定的类
		MobileCodeWSSoap serviceClass = mc.getMobileCodeWSSoap();
		//调用具体业务逻辑
		String result = serviceClass.getMobileCodeInfo("13678005440", null);
		System.out.println(result);
	}
}
