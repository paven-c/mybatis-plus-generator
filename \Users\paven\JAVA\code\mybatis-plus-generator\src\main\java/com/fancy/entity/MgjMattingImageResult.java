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
 * @CreateDate 2023-08-18
 * @describe FANCY_GPT007_源素材清洗任务表实体类
 */
@Data
@TableName("mgj_matting_image_result")
@ApiModel(value="MgjMattingImageResult对象", description="FANCY_GPT007_源素材清洗任务表")
    public class MgjMattingImageResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @ApiModelProperty(value = "主键")
    private Long id;


    /**
    * 任务ID
    */
    @ApiModelProperty(value = "任务ID")
    private String taskId;


    /**
    * 原始图片路径
    */
    @ApiModelProperty(value = "原始图片路径")
    private String imageUrl;


    /**
    * 抠图结果图片路径
    */
    @ApiModelProperty(value = "抠图结果图片路径")
    private String mattingImageUrl;


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


}