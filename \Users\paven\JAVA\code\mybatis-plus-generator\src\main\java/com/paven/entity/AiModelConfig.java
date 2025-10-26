package com.paven.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: com.paven.entity
 * @Author Yanyi
 * @CreateDate 2023-12-26
 * @describe Ai模特图配置表实体类
 */
@Data
@TableName("ai_model_config")
@ApiModel(value="AiModelConfig对象", description="Ai模特图配置表")
    public class AiModelConfig implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @ApiModelProperty(value = "主键")
    private Long id;


    /**
    * 配置类型
    */
    @ApiModelProperty(value = "配置类型")
    private Integer type;


    /**
    * 类目code
    */
    @ApiModelProperty(value = "类目code")
    private String categoryCode;


    /**
    * 配置code
    */
    @ApiModelProperty(value = "配置code")
    private String code;


    /**
    * 配置图片链接
    */
    @ApiModelProperty(value = "配置图片链接")
    private String url;


    /**
    * 逻辑删除
    */
    @ApiModelProperty(value = "逻辑删除")
    private Integer deleted;


}