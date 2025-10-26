package com.fancy.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @CreateDate 2023-12-21
 * @describe Stripe客户表实体类
 */
@Data
@TableName("stripe_user")
@ApiModel(value="StripeUser对象", description="Stripe客户表")
    public class StripeUser implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键ID
    */
    @ApiModelProperty(value = "主键ID")
    private Long id;


    /**
    * 用户ID
    */
    @ApiModelProperty(value = "用户ID")
    private Long userId;


    /**
    * stripe客户ID
    */
    @ApiModelProperty(value = "stripe客户ID")
    private String customerId;


    /**
    * stripe客户名称
    */
    @ApiModelProperty(value = "stripe客户名称")
    private String customerName;


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


    /**
    * 是否删除
    */
    @ApiModelProperty(value = "是否删除")
    private Boolean deleted;


}