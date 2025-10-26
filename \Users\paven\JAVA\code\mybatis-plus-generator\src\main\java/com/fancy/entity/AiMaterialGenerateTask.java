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
 * @CreateDate 2023-09-01
 * @describe Ai素材任务表实体类
 */
@Data
@TableName("ai_material_generate_task")
@ApiModel(value="AiMaterialGenerateTask对象", description="Ai素材任务表")
    public class AiMaterialGenerateTask implements Serializable {

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
    * 商户名称
    */
    @ApiModelProperty(value = "商户名称")
    private String merchantName;


    /**
    * 素材ID
    */
    @ApiModelProperty(value = "素材ID")
    private Long materialId;


    /**
    * fancy商品ID
    */
    @ApiModelProperty(value = "fancy商品ID")
    private Long fancyItemId;


    /**
    * 商品名称
    */
    @ApiModelProperty(value = "商品名称")
    private String productName;


    /**
    * 平台商品ID
    */
    @ApiModelProperty(value = "平台商品ID")
    private Long platformItemId;


    /**
    * 平台类型
    */
    @ApiModelProperty(value = "平台类型")
    private String platformType;


    /**
    * 任务类型 0 生成模特场景图、1生成商品场景图
    */
    @ApiModelProperty(value = "任务类型 0 生成模特场景图、1生成商品场景图")
    private Integer taskType;


    /**
    * 任务状态 0 初始化、1生成中、2已生成、3生成失败、4已取消
    */
    @ApiModelProperty(value = "任务状态 0 初始化、1生成中、2已生成、3生成失败、4已取消")
    private Integer status;


    /**
    * 触发类型 0 手动、1系统
    */
    @ApiModelProperty(value = "触发类型 0 手动、1系统")
    private Integer triggerType;


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