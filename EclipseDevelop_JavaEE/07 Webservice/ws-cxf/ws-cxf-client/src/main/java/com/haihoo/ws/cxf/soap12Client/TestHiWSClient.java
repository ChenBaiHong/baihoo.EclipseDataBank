package com.haihoo.ws.cxf.soap12Client;

import com.haihoo.ws.cxf.soap12.hiWS.HiServer;
import com.haihoo.ws.cxf.soap12.hiWS.HiServerService;

public class TestHiWSClient {
	public static void main(String[] args) {
		//创建服务访问点集合
		HiServerService hss = new HiServerService();
		//根据服务访问点获取绑定的类
		HiServer hs= hss.getHiServerPort();
		//调用具体业务逻辑
		String result = hs.sysHi("BaiHOO");
		System.out.println(result);
	}
}
