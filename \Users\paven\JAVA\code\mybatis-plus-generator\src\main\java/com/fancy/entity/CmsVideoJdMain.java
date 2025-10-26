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
 * @describe 京东主图视频实体类
 */
@Data
@TableName("cms_video_jd_main")
@ApiModel(value="CmsVideoJdMain对象", description="京东主图视频")
    public class CmsVideoJdMain implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键ID
    */
    @ApiModelProperty(value = "主键ID")
    private Long id;


    /**
    * 父ID【替换的时候会有】
    */
    @ApiModelProperty(value = "父ID【替换的时候会有】")
    private Long parentId;


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
    * 主图视频ID
    */
    @ApiModelProperty(value = "主图视频ID")
    private String articleId;


    /**
    * 标题
    */
    @ApiModelProperty(value = "标题")
    private String title;


    /**
    * 图片
    */
    @ApiModelProperty(value = "图片")
    private String pic;


    /**
    * 发布微详情侧唯一标识
    */
    @ApiModelProperty(value = "发布微详情侧唯一标识")
    private String pythonTaskId;


    /**
    * 待制作视频ID
    */
    @ApiModelProperty(value = "待制作视频ID")
    private Long videoToBeMadeId;


    /**
    * 音乐ID
    */
    @ApiModelProperty(value = "音乐ID")
    private Long audioId;


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
    * 是否发布 0->未发布 1->已发布 2->发布中 3->审核失败 4->已失效 5->发布失败
    */
    @ApiModelProperty(value = "是否发布 0->未发布 1->已发布 2->发布中 3->审核失败 4->已失效 5->发布失败")
    private Integer publishStatus;


    /**
    * 发布时间
    */
    @ApiModelProperty(value = "发布时间")
    private LocalDateTime publishTime;


    /**
    * 发布失败的原因
    */
    @ApiModelProperty(value = "发布失败的原因")
    private String failReason;


    /**
    * 发布时关联平台skuIds快照
    */
    @ApiModelProperty(value = "发布时关联平台skuIds快照")
    private String otherSkuIds;


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
    * 是否需要复审 0:否 1:是
    */
    @ApiModelProperty(value = "是否需要复审 0:否 1:是")
    private Boolean needReview;


    /**
    * 复审是否通过 0:否 1:是
    */
    @ApiModelProperty(value = "复审是否通过 0:否 1:是")
    private Boolean reviewStatus;


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