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
@TableName("creation_config")
@ApiModel(value="CreationConfig对象", description="")
    public class CreationConfig implements Serializable {

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
    * 生成图片数
    */
    @ApiModelProperty(value = "生成图片数")
    private Integer imgNum;


    /**
    * 图片比例
    */
    @ApiModelProperty(value = "图片比例")
    private Integer ratio;


    /**
    * 服饰类型
    */
    @ApiModelProperty(value = "服饰类型")
    private Integer clotheType;


    /**
    * 自定义脸图片链接
    */
    @ApiModelProperty(value = "自定义脸图片链接")
    private String faceUrl;


    /**
    * 性别
    */
    @ApiModelProperty(value = "性别")
    private Integer gender;


    /**
    * 人种
    */
    @ApiModelProperty(value = "人种")
    private Integer race;


    /**
    * 年龄段
    */
    @ApiModelProperty(value = "年龄段")
    private Integer ageRange;


    /**
    * 背景
    */
    @ApiModelProperty(value = "背景")
    private Integer background;


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


}