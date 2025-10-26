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
 * @CreateDate 2023-11-08
 * @describe 京东视频上传记录实体类
 */
@Data
@TableName("cms_video_jd")
@ApiModel(value="CmsVideoJd对象", description="京东视频上传记录")
    public class CmsVideoJd implements Serializable {

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
    * 模板ID
    */
    @ApiModelProperty(value = "模板ID")
    private Long templateId;


    /**
    * 待制作视频ID
    */
    @ApiModelProperty(value = "待制作视频ID")
    private Long videoToBeMadeId;


    /**
    * 平台商品ID
    */
    @ApiModelProperty(value = "平台商品ID")
    private String itemId;


    /**
    * 任务ID
    */
    @ApiModelProperty(value = "任务ID")
    private Long videoTaskId;


    /**
    * fancy商品ID
    */
    @ApiModelProperty(value = "fancy商品ID")
    private Long fancyItemId;


    /**
    * fancySkuID
    */
    @ApiModelProperty(value = "fancySkuID")
    private Long fancySkuId;


    /**
    * 视频链接
    */
    @ApiModelProperty(value = "视频链接")
    private String videoSrc;


    /**
    * 视频尺寸
    */
    @ApiModelProperty(value = "视频尺寸")
    private String videoSize;


    /**
    * 视频时长
    */
    @ApiModelProperty(value = "视频时长")
    private Float videoDuration;


    /**
    * 京东videoId
    */
    @ApiModelProperty(value = "京东videoId")
    private String videoId;


    /**
    * 京东agentId
    */
    @ApiModelProperty(value = "京东agentId")
    private String agentVideoId;


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
    * 是否删除
    */
    @ApiModelProperty(value = "是否删除")
    private Boolean deleted;


}