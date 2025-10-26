package com.fancy.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: com.fancy.entity
 * @Author Yanyi
 * @CreateDate 2023-12-19
 * @describe 计划订阅订单表实体类
 */
@Data
@TableName("plan_order")
@ApiModel(value="PlanOrder对象", description="计划订阅订单表")
    public class PlanOrder implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @ApiModelProperty(value = "主键")
    private Long id;


    /**
    * 订单编号
    */
    @ApiModelProperty(value = "订单编号")
    private String orderNo;


    /**
    * 订单类型
    */
    @ApiModelProperty(value = "订单类型")
    private Integer type;


    /**
    * 用户ID
    */
    @ApiModelProperty(value = "用户ID")
    private Long userId;


    /**
    * 用户IP
    */
    @ApiModelProperty(value = "用户IP")
    private String userIp;


    /**
    * 订单状态 PlanOrderStatusEnum
    */
    @ApiModelProperty(value = "订单状态 PlanOrderStatusEnum")
    private Integer status;


    /**
    * 取消订单类型 PlanOrderCancelTypeEnum
    */
    @ApiModelProperty(value = "取消订单类型 PlanOrderCancelTypeEnum")
    private Integer cancelType;


    /**
    * 支付标识
    */
    @ApiModelProperty(value = "支付标识")
    private Boolean payStatus;


    /**
    * 付款时间
    */
    @ApiModelProperty(value = "付款时间")
    private LocalDateTime payTime;


    /**
    * 完成时间
    */
    @ApiModelProperty(value = "完成时间")
    private LocalDateTime finishTime;


    /**
    * 取消时间
    */
    @ApiModelProperty(value = "取消时间")
    private LocalDateTime cancelTime;


    /**
    * 折扣金额
    */
    @ApiModelProperty(value = "折扣金额")
    private Integer discountPrice;


    /**
    * 应付金额
    */
    @ApiModelProperty(value = "应付金额")
    private Integer payPrice;


    /**
    * 支付订单ID
    */
    @ApiModelProperty(value = "支付订单ID")
    private Long payOrderId;


    /**
    * 支付渠道code
    */
    @ApiModelProperty(value = "支付渠道code")
    private String payChannelCode;


    /**
    * 退款金额
    */
    @ApiModelProperty(value = "退款金额")
    private Integer refundPrice;


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