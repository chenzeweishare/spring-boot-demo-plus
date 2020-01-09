package com.xkcoding.orm.mybatis.plus.entity;

import java.math.BigDecimal;
import java.sql.Date;

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
 * @package:  cn.regentsoft.juniu.user.orderLog.bean
 * @description: 用户组织配置表
 * @author: czw
 * @date: Created in 2020-01-09 19:53:49
 * @copyright: Copyright (c) 2020
 * @version: V1.0
 * @modified: czw
 */
@Data
@TableName("order_log")
@EqualsAndHashCode(callSuper = true)
public class OrderLog extends Model<OrderLog> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     *
     */
    private Long userId;
    /**
     * 名称
     */
    private String name;
    /**
     * 基础金额
     */
    private BigDecimal baseAmount;
    /**
     * 实际金额
     */
    private BigDecimal actualAmount;
    /**
     * 折扣金额
     */
    private BigDecimal discountAmount;
    /**
     * 门店Id
     */
    private Long shopId;
    /**
     * 商品id
     */
    private Long productId;
    /**
     * 优惠卷Id
     */
    private Long couponId;
    /**
     * 优惠卷金额
     */
    private BigDecimal couponAmount;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 支付状态
     */
    private Integer payStatus;
    /**
     * 用户微信Id
     */
    private Long weixinId;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 区
     */
    private String district;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     *
     */
    private Long createBy;
    /**
     *
     */
    private Date createTime;
    /**
     *
     */
    private Long updateBy;
    /**
     *
     */
    private Date updateTime;

}
