package com.baihoo.ws.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestSocketClient {
	public static void main(String [] args) throws UnknownHostException, IOException {
		//创建客服端socket
		Socket s = new Socket("127.0.0.1" , 8888);
		//获得输入流
		InputStream  in = s.getInputStream();
		//输入流转换字节输入流
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line = null;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		//关闭资源
		reader.close();
		in.close();
		s.close();
	}
}
