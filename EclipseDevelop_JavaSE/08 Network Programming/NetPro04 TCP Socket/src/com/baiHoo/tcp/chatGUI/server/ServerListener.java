package com.baiHoo.tcp.chatGUI.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * 
 * @author Administrator
 *
 */
public class ServerListener extends Thread {

	@Override
	public void run() {
		//1-65535
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			while (true) {
				//block
				Socket socket = serverSocket.accept();
				//��������
				JOptionPane.showMessageDialog(null, "�пͻ������ӵ��˱�����12345�˿�");
				//��socket���ݸ��µ��߳�
				ChatSocket cs = new ChatSocket(socket);
				cs.start();
				ChatManager.getChatManager().add(cs);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
