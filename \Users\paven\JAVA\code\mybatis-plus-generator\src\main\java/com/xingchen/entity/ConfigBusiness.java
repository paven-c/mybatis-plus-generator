package com.xingchen.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: com.xingchen.entity
 * @Author xingchen
 * @CreateDate 2023-12-30
 * @describe 实体类
 */
@Data
@TableName("config_business")
@ApiModel(value="ConfigBusiness对象", description="")
    public class ConfigBusiness implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 
    */
    @ApiModelProperty(value = "")
    private Long id;


    /**
    * 
    */
    @ApiModelProperty(value = "")
    private String key;


    /**
    * 
    */
    @ApiModelProperty(value = "")
    private String value;


    /**
    * 
    */
    @ApiModelProperty(value = "")
    private String remark;


}