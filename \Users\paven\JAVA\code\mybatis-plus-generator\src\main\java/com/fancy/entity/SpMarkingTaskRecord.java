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
 * @CreateDate 2023-08-11
 * @describe FANCY_GPT007_源素材打标任务操作记录表实体类
 */
@Data
@TableName("sp_marking_task_record")
@ApiModel(value="SpMarkingTaskRecord对象", description="FANCY_GPT007_源素材打标任务操作记录表")
    public class SpMarkingTaskRecord implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @ApiModelProperty(value = "主键")
    private Long id;


    /**
    * 商家ID
    */
    @ApiModelProperty(value = "商家ID")
    private Long merchantId;


    /**
    * 商户名称
    */
    @ApiModelProperty(value = "商户名称")
    private String merchantName;


    /**
    * 打标任务ID
    */
    @ApiModelProperty(value = "打标任务ID")
    private Long markingTaskId;


    /**
    * 源素材ID
    */
    @ApiModelProperty(value = "源素材ID")
    private Long materialId;


    /**
    * Fancy商品ID
    */
    @ApiModelProperty(value = "Fancy商品ID")
    private Long fancyItemId;


    /**
    * 操作用户ID
    */
    @ApiModelProperty(value = "操作用户ID")
    private Integer operatorId;


    /**
    * 操作用户名称
    */
    @ApiModelProperty(value = "操作用户名称")
    private String operatorName;


    /**
    * 操作时间
    */
    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operateTime;


    /**
    * 操作内容
    */
    @ApiModelProperty(value = "操作内容")
    private String operateContent;


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