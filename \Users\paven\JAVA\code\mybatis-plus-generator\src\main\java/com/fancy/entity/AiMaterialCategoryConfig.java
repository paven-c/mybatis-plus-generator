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
 * @CreateDate 2023-09-14
 * @describe 实体类
 */
@Data
@TableName("ai_material_category_config")
@ApiModel(value="AiMaterialCategoryConfig对象", description="")
    public class AiMaterialCategoryConfig implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键ID
    */
    @ApiModelProperty(value = "主键ID")
    private Long id;


    /**
    * fancy类目ID
    */
    @ApiModelProperty(value = "fancy类目ID")
    private Long fancyCategoryId;


    /**
    * fancy类目名称
    */
    @ApiModelProperty(value = "fancy类目名称")
    private String fancyCategoryName;


    /**
    * 源素材规则key
    */
    @ApiModelProperty(value = "源素材规则key")
    private Integer materialRuleKey;


    /**
    * 操作人ID
    */
    @ApiModelProperty(value = "操作人ID")
    private Long operatorId;


    /**
    * 操作人姓名
    */
    @ApiModelProperty(value = "操作人姓名")
    private String operatorName;


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