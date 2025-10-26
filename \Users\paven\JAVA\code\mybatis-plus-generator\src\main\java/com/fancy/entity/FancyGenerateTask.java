package com.fancy.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @CreateDate 2023-12-22
 * @describe fancy_ai全局任务表实体类
 */
@Data
@TableName("fancy_generate_task")
@ApiModel(value="FancyGenerateTask对象", description="fancy_ai全局任务表")
    public class FancyGenerateTask implements Serializable {

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
    * 三方用户ID
    */
    @ApiModelProperty(value = "三方用户ID")
    private String openId;


    /**
    * 任务来源 1 discord、2用户后台
    */
    @ApiModelProperty(value = "任务来源 1 discord、2用户后台")
    private Integer sourceType;


    /**
    * 会话ID
    */
    @ApiModelProperty(value = "会话ID")
    private String groupCode;


    /**
    * 批次ID
    */
    @ApiModelProperty(value = "批次ID")
    private Long taskId;


    /**
    * 消息ID
    */
    @ApiModelProperty(value = "消息ID")
    private String messageId;


    /**
    * 通道ID
    */
    @ApiModelProperty(value = "通道ID")
    private String channelId;


    /**
    * 通道类型
    */
    @ApiModelProperty(value = "通道类型")
    private String channelType;


    /**
    * 交互类型
    */
    @ApiModelProperty(value = "交互类型")
    private Integer interactionType;


    /**
    * 任务状态 0 未开始、1 AI图片制作中、2 AI图片制作完成、3 AI视频制作中、4 AI视频制作完成、5 视频制作中、6 视频制作完成
    */
    @ApiModelProperty(value = "任务状态 0 未开始、1 AI图片制作中、2 AI图片制作完成、3 AI视频制作中、4 AI视频制作完成、5 视频制作中、6 视频制作完成")
    private Integer status;


    /**
    * 失败原因  
    */
    @ApiModelProperty(value = "失败原因  ")
    private String reason;


    /**
    * 创建时间
    */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


    /**
    * 更新时间
    */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


    /**
    * 是否删除 0:未删除 1:已删除
    */
    @ApiModelProperty(value = "是否删除 0:未删除 1:已删除")
    private Integer deleted;


}