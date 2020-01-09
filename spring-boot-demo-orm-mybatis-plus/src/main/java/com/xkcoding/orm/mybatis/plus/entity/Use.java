package com.xkcoding.orm.mybatis.plus.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户组织配置表
 * </p>
 *
 * @package:  cn.regentsoft.juniu.user.use.bean
 * @description: 用户组织配置表
 * @author: czw
 * @date: Created in 2020-01-09 19:53:04
 * @copyright: Copyright (c) 2020
 * @version: V1.0
 * @modified: czw
 */
@Data
@TableName("orm_use")
@EqualsAndHashCode(callSuper = true)
public class Use extends Model<Use> {
    private static final long serialVersionUID = 1L;

    /**
     * 用户表
     */
    @TableId
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * appId
     */
    private String appId;
    /**
     * 用户账号
     */
    private String account;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 微信用户唯一标识
     */
    private String openId;
    /**
     * 组织id
     */
    private String bossUnitId;
    /**
     * ip
     */
    private String ip;
    /**
     * 0可用，1不可用
     */
    private Integer loginStatus;
    /**
     * 0可用，1不可用
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建者
     */
    private Long createBy;
    /**
     * 上次更新时间
     */
    private Date updateTime;
    /**
     * 更新者
     */
    private Long updateBy;
    /**
     * 积分
     */
    private BigDecimal integral;
    /**
     * 油点
     */
    private BigDecimal oil;

}
