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
 * @CreateDate 2023-10-26
 * @describe 商户AI素材配置表实体类
 */
@Data
@TableName("merchant_ai_material_config")
@ApiModel(value="MerchantAiMaterialConfig对象", description="商户AI素材配置表")
    public class MerchantAiMaterialConfig implements Serializable {

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
    * 配置类型： 1-模特属性、2-背景属性
    */
    @ApiModelProperty(value = "配置类型： 1-模特属性、2-背景属性")
    private Integer type;


    /**
    * 模特类型： 1-男、2-女、3-男童、4-女童
    */
    @ApiModelProperty(value = "模特类型： 1-男、2-女、3-男童、4-女童")
    private Integer model;


    /**
    * 人种：1-欧美、2-亚洲
    */
    @ApiModelProperty(value = "人种：1-欧美、2-亚洲")
    private Integer races;


    /**
    * 年龄段：1-小童、2-大童、3-少年、4-青年、5-中年、6-老年
    */
    @ApiModelProperty(value = "年龄段：1-小童、2-大童、3-少年、4-青年、5-中年、6-老年")
    private Integer ageGroups;


    /**
    * 发型：1-短发、2-长发、3-卷发、4-马尾
    */
    @ApiModelProperty(value = "发型：1-短发、2-长发、3-卷发、4-马尾")
    private Integer hairStyles;


    /**
    * 面部装饰：1-戴眼镜、2-手挡脸、3-口罩
    */
    @ApiModelProperty(value = "面部装饰：1-戴眼镜、2-手挡脸、3-口罩")
    private Integer faceDecorations;


    /**
    * 背景：1-白背景、2-室内、3-室外
    */
    @ApiModelProperty(value = "背景：1-白背景、2-室内、3-室外")
    private Integer backgrouds;


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