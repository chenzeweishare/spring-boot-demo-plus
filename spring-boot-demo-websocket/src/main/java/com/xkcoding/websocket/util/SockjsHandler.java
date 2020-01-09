package com.xkcoding.websocket.util;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SockjsHandler extends TextWebSocketHandler {

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("connect to the websocket success......");
		String username = (String) session.getAttributes().get("messageName");
		if (null != username) {
			MessageUtil.putUserWebSocketSession(username, session);
			System.out.println("User Name:" + username);
		}
		super.afterConnectionEstablished(session);
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		System.out.println("websocket connection closed......");
		String username = (String) session.getAttributes().get("messageName");
		if (null == username) {
			MessageUtil.removeUserWebSocketSession(username);
		}
		super.handleTransportError(session, exception);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		System.out.println("websocket connection closed......");
		String username = (String) session.getAttributes().get("messageName");
		if (null == username) {
			MessageUtil.removeUserWebSocketSession(username);
		}
		super.afterConnectionClosed(session, closeStatus);
	}

	@Override
	public boolean supportsPartialMessages() {
		return false;
	}

	@Override
	 public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		session.sendMessage(new TextMessage("欢迎登录消息中心系统"));
	}

}
