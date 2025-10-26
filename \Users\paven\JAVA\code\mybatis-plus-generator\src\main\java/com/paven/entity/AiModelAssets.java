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
 * @describe Ai模特素材表实体类
 */
@Data
@TableName("ai_model_assets")
@ApiModel(value="AiModelAssets对象", description="Ai模特素材表")
    public class AiModelAssets implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @ApiModelProperty(value = "主键")
    private Long id;


    /**
    * 衣服code
    */
    @ApiModelProperty(value = "衣服code")
    private String cloth;


    /**
    * 性别code
    */
    @ApiModelProperty(value = "性别code")
    private String gender;


    /**
    * 背景code
    */
    @ApiModelProperty(value = "背景code")
    private String backgroud;


    /**
    * 面部code
    */
    @ApiModelProperty(value = "面部code")
    private String face;


    /**
    * 模特图链接
    */
    @ApiModelProperty(value = "模特图链接")
    private String url;


    /**
    * 逻辑删除
    */
    @ApiModelProperty(value = "逻辑删除")
    private Integer deleted;


}