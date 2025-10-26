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
 * @CreateDate 2023-12-12
 * @describe 算法智能标题任务表实体类
 */
@Data
@TableName("ai_video_title_task")
@ApiModel(value="AiVideoTitleTask对象", description="算法智能标题任务表")
    public class AiVideoTitleTask implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键ID
    */
    @ApiModelProperty(value = "主键ID")
    private Long id;


    /**
    * 商户ID
    */
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;


    /**
    * 任务ID
    */
    @ApiModelProperty(value = "任务ID")
    private String taskId;


    /**
    * 视频制作记录ID
    */
    @ApiModelProperty(value = "视频制作记录ID")
    private Long videoToBeMadeId;


    /**
    * 视频生成记录ID
    */
    @ApiModelProperty(value = "视频生成记录ID")
    private Long makeVideoId;


    /**
    * 任务类型 1页面请求、2后台任务
    */
    @ApiModelProperty(value = "任务类型 1页面请求、2后台任务")
    private Integer type;


    /**
    * 视频发布平台类型
    */
    @ApiModelProperty(value = "视频发布平台类型")
    private Integer videoPlatform;


    /**
    * 任务状态
    */
    @ApiModelProperty(value = "任务状态")
    private Integer status;


    /**
    * 生成的标题
    */
    @ApiModelProperty(value = "生成的标题")
    private String titles;


    /**
    * 创建时间
    */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


    /**
    * 最近更新时间
    */
    @ApiModelProperty(value = "最近更新时间")
    private LocalDateTime updateTime;


    /**
    * 逻辑删除 0未删除、1已删除
    */
    @ApiModelProperty(value = "逻辑删除 0未删除、1已删除")
    private Boolean deleted;


}