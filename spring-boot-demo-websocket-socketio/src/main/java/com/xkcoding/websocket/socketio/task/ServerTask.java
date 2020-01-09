package com.xkcoding.websocket.socketio.task;

import java.util.Date;

import cn.hutool.core.date.DateUtil;
import com.xkcoding.websocket.socketio.handler.MessageEventHandler;
import com.xkcoding.websocket.socketio.payload.BroadcastMessageRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 服务器定时推送任务
 * </p>
 *
 * @package: com.xkcoding.websocket.task
 * @description: 服务器定时推送任务
 * @author: yangkai.shen
 * @date: Created in 2018-12-14 16:04
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
@Component
public class ServerTask {

    @Autowired
    private MessageEventHandler messageEventHandler;

    /**
     * 按照标准时间来算，每隔 2s 执行一次
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void websocket() throws Exception {
        log.info("【推送消息】开始执行：{}", DateUtil.formatDateTime(new Date()));
        // 查询服务器状态
        messageEventHandler.sendToBroadcast(BroadcastMessageRequest.builder().message("测试测试").build());
        log.info("【推送消息】执行结束：{}", DateUtil.formatDateTime(new Date()));
    }
}
