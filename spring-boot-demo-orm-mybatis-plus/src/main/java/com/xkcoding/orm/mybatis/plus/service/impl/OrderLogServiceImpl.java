package com.xkcoding.orm.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xkcoding.orm.mybatis.plus.entity.OrderLog;
import com.xkcoding.orm.mybatis.plus.mapper.OrderLogMapper;
import com.xkcoding.orm.mybatis.plus.service.OrderLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户组织配置表
 * </p>
 *
 * @package: cn.regentsoft.juniu.user.orderLog.service.impl
 * @description: 用户组织配置表
 * @author: czw
 * @date: Created in 2020-01-09 19:53:49
 * @copyright: Copyright (c) 2020
 * @version: V1.0
 * @modified: czw
 */
@Service
public class OrderLogServiceImpl extends ServiceImpl<OrderLogMapper, OrderLog> implements OrderLogService {

}
