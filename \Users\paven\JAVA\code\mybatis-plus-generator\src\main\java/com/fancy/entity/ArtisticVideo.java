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
 * @CreateDate 2023-12-18
 * @describe 作品集 - 视频数据实体类
 */
@Data
@TableName("artistic_video")
@ApiModel(value="ArtisticVideo对象", description="作品集 - 视频数据")
    public class ArtisticVideo implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 
    */
    @ApiModelProperty(value = "")
    private Long id;


    /**
    * 用户ID
    */
    @ApiModelProperty(value = "用户ID")
    private Long userId;


    /**
    * 素材对应的组号
    */
    @ApiModelProperty(value = "素材对应的组号")
    private String groupCode;


    /**
    * 同组素材生成任务批次
    */
    @ApiModelProperty(value = "同组素材生成任务批次")
    private Integer taskId;


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
    * 模板ID
    */
    @ApiModelProperty(value = "模板ID")
    private Long templateId;


    /**
    * 模板code
    */
    @ApiModelProperty(value = "模板code")
    private String templateCode;


    /**
    * 视频尺寸，0->1:1，1->4:3，2->16:9
    */
    @ApiModelProperty(value = "视频尺寸，0->1:1，1->4:3，2->16:9")
    private Integer videoSize;


    /**
    * 音乐ID
    */
    @ApiModelProperty(value = "音乐ID")
    private Long audioId;


    /**
    * 是否有背景音乐 0没有 1有
    */
    @ApiModelProperty(value = "是否有背景音乐 0没有 1有")
    private Boolean videoAudio;


    /**
    * 制作视频的url地址
    */
    @ApiModelProperty(value = "制作视频的url地址")
    private String makeUrl;


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
    * 创建时间时间戳
    */
    @ApiModelProperty(value = "创建时间时间戳")
    private LocalDateTime createTimestamp;


    /**
    * 更细时间时间戳
    */
    @ApiModelProperty(value = "更细时间时间戳")
    private LocalDateTime updateTimestamp;


    /**
    * 是否删除 0:未删除 1:已删除
    */
    @ApiModelProperty(value = "是否删除 0:未删除 1:已删除")
    private Integer deleted;


}