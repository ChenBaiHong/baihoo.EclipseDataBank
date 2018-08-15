package com.haihoo.ws.cxf.server.soap12.impl;
/**
 * 1.创建服务接口
 * 		“@WebService”注意注解加在接口上
 */
public class HiServerImpl implements com.haihoo.ws.cxf.server.soap12.HiServer {

	@Override
	public String sysHi(String name) {
		
		return name +"! werbservice 调用了！！";
	}

}
