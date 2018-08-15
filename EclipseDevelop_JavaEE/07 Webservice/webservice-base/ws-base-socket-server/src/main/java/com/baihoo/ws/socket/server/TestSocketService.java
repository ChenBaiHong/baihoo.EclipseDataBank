package com.baihoo.ws.socket.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 测试 端口服务端
 * @author Administrator
 *
 */
public class TestSocketService {
	public static void main(String[] args) throws IOException {
		//创建服务接口
		ServerSocket ss = new ServerSocket(8888);
		//接受请求
		Socket s = ss.accept();
		//调用服务端业务逻辑
		String result = new PersonService().sayHello();
		//获取输出流
		OutputStream out = s.getOutputStream();
		//发送数据
		out.write(result.getBytes());
		//关闭资源
		out.close();
		s.close();
		ss.close();
	}
}
