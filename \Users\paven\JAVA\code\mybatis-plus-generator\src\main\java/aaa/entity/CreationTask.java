package aaa.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: aaa.entity
 * @Author Yanyi
 * @CreateDate 2024-01-05
 * @describe 实体类
 */
@Data
@TableName("creation_task")
@ApiModel(value="CreationTask对象", description="")
    public class CreationTask implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键ID
    */
    @ApiModelProperty(value = "主键ID")
    private Long id;


    /**
    * 用户ID
    */
    @ApiModelProperty(value = "用户ID")
    private Long userId;


    /**
    * 生成记录ID
    */
    @ApiModelProperty(value = "生成记录ID")
    private Long creationId;


    /**
    * 生成记录素材图片ID
    */
    @ApiModelProperty(value = "生成记录素材图片ID")
    private Long creationAssetsImageId;


    /**
    * 任务类型
    */
    @ApiModelProperty(value = "任务类型")
    private Integer taskType;


    /**
    * 任务编号
    */
    @ApiModelProperty(value = "任务编号")
    private String taskNo;


    /**
    * 任务状态
    */
    @ApiModelProperty(value = "任务状态")
    private Integer taskStatus;


    /**
    * 完成时间
    */
    @ApiModelProperty(value = "完成时间")
    private String finishedTime;


    /**
    * 创建时间
    */
    @ApiModelProperty(value = "创建时间")
    private String createTime;


    /**
    * 更新时间
    */
    @ApiModelProperty(value = "更新时间")
    private String updateTime;


    /**
    * 逻辑删除编辑 0未删除、1已删除
    */
    @ApiModelProperty(value = "逻辑删除编辑 0未删除、1已删除")
    private Integer deleted;


}