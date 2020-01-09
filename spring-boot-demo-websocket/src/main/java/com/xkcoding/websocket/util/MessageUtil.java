package com.xkcoding.websocket.util;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

public class MessageUtil {

	private static Map<String, WebSocketSession> userWebSocketSessions = new ConcurrentHashMap<String, WebSocketSession>();

	/**
     * 给所有在线用户发送消息
     *
     * @param message
     */
    public static void sendMessageToUsers(TextMessage message) {
        Map<String, WebSocketSession> users = getUserWebSocketSessions();
        System.out.println("Users:" + users.size());
        for (WebSocketSession session : users.values()) {
        	System.out.println("WebSocketSession:" +session.toString());
        	try {
                if (session.isOpen()) {
                	session.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void sendMessageToUsers(String message) {
        sendMessageToUsers(new TextMessage(message));
    }


    /**
     * 给某个用户发送消息
     * @param username
     * @param message
     */
    public static void sendMessageToUser(String username, String message) {
        sendMessageToUser(username, new TextMessage(message));
    }

    public static void sendMessageToUser(String username, TextMessage message) {
        WebSocketSession session = getUserWebSocketSession(username);
        try {
            if (session.isOpen()) {
            	session.sendMessage(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加
     * @param username
     * @param session
     */
    public static void putUserWebSocketSession(String username, WebSocketSession session){
    	userWebSocketSessions.put(username, session);
    }

    public static void removeUserWebSocketSession(String username){
    	userWebSocketSessions.remove(username);
    }

    public static WebSocketSession getUserWebSocketSession(String username) {
		return userWebSocketSessions.get(username);
	}

	public static Map<String, WebSocketSession> getUserWebSocketSessions() {
		return userWebSocketSessions;
	}

}
