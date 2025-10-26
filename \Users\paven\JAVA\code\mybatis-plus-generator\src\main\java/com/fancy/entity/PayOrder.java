package com.fancy.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: com.fancy.entity
 * @Author Yanyi
 * @CreateDate 2023-12-19
 * @describe 支付订单表实体类
 */
@Data
@TableName("pay_order")
@ApiModel(value="PayOrder对象", description="支付订单表")
    public class PayOrder implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @ApiModelProperty(value = "主键")
    private Long id;


    /**
    * 支付渠道code
    */
    @ApiModelProperty(value = "支付渠道code")
    private String channelCode;


    /**
    * 计划名称
    */
    @ApiModelProperty(value = "计划名称")
    private String planName;


    /**
    * 计划信息json
    */
    @ApiModelProperty(value = "计划信息json")
    private String body;


    /**
    * 异步通知地址
    */
    @ApiModelProperty(value = "异步通知地址")
    private String notifyUrl;


    /**
    * 支付金额
    */
    @ApiModelProperty(value = "支付金额")
    private Long price;


    /**
    * 渠道手续费率
    */
    @ApiModelProperty(value = "渠道手续费率")
    private BigDecimal channelFeeRate;


    /**
    * 渠道手续费
    */
    @ApiModelProperty(value = "渠道手续费")
    private Long channelFeePrice;


    /**
    * 支付状态
    */
    @ApiModelProperty(value = "支付状态")
    private Integer status;


    /**
    * 用户IP
    */
    @ApiModelProperty(value = "用户IP")
    private String userIp;


    /**
    * 订单过期时间
    */
    @ApiModelProperty(value = "订单过期时间")
    private LocalDateTime expireTime;


    /**
    * 订单完成时间
    */
    @ApiModelProperty(value = "订单完成时间")
    private LocalDateTime successTime;


    /**
    * 订单通知时间
    */
    @ApiModelProperty(value = "订单通知时间")
    private LocalDateTime notifyTime;


    /**
    * 外部订单号
    */
    @ApiModelProperty(value = "外部订单号")
    private String orderNo;


    /**
    * 退款金额
    */
    @ApiModelProperty(value = "退款金额")
    private Long refundPrice;


    /**
    * 渠道用户ID
    */
    @ApiModelProperty(value = "渠道用户ID")
    private String channelUserId;


    /**
    * 渠道订单号
    */
    @ApiModelProperty(value = "渠道订单号")
    private String channelOrderNo;


    /**
    * 创建人userId
    */
    @ApiModelProperty(value = "创建人userId")
    private Long createUserId;


    /**
    * 创建时间
    */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


    /**
    * 最近更新人userId
    */
    @ApiModelProperty(value = "最近更新人userId")
    private Long updateUserId;


    /**
    * 最近更新时间
    */
    @ApiModelProperty(value = "最近更新时间")
    private LocalDateTime updateTime;


    /**
    * 是否删除
    */
    @ApiModelProperty(value = "是否删除")
    private Boolean deleted;


    /**
    * 创建时间戳
    */
    @ApiModelProperty(value = "创建时间戳")
    private LocalDateTime createTimestamp;


    /**
    * 最近更新时间戳
    */
    @ApiModelProperty(value = "最近更新时间戳")
    private LocalDateTime updateTimestamp;


}