package com.baiHoo.websocket.chat;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.catalina.connector.Request;
import org.apache.jasper.runtime.PageContextImpl;

import net.sf.json.JSONObject;

/**
 * 
 * @author Administrator 简易的聊天服务器
 */
@ServerEndpoint("/chatroom")
public class WebsocketChatService {
	/**
	 * 日期格式化
	 */
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 初始化一个会话
	 * 
	 * @param session
	 */
	@OnOpen
	public void onOpen(Session session) {

	}

	@OnMessage
	public void onMessage(String message, Session session) {

		// 将消息格式化成json
		JSONObject jsonObj = JSONObject.fromObject(message);

		// 在消息中添加发送时间
		jsonObj.put("date", DATE_FORMAT.format(new Date()));

		// 遍历所有的消息
		for (Session openSession : session.getOpenSessions()) {

			// 在消息中添加是否是当前会话的标志
			jsonObj.put("isSelf", openSession.equals(session));

			// 发送json格式的消息
			openSession.getAsyncRemote().sendText(jsonObj.toString());
		}
	}

	/**
	 * todo : 关闭一个会话时的操作
	 */
	@OnClose
	public void onClose() {

	}

	/**
	 * todo : 处理错误
	 */
	@OnError
	public void onError(Throwable t) {
		/*
		Server server = new StandardServer();
		Service[] services = server.findServices();
		for (Service service : services) {
			for (Connector connector : service.findConnectors()) {
				ProtocolHandler protocolHandler = connector.getProtocolHandler();
				if (protocolHandler instanceof Http11Protocol || protocolHandler instanceof Http11AprProtocol
						|| protocolHandler instanceof Http11NioProtocol) {
					connector.getScheme();
					System.out.println("HTTP Port: " + connector.getPort());
				}
			}
		}
		*/
	}
}
