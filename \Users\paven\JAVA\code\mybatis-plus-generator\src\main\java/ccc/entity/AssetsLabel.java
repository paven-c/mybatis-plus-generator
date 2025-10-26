package ccc.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: ccc.entity
 * @Author yanyi
 * @CreateDate 2024-01-06
 * @describe 素材图片类型实体类
 */
@Data
@TableName("assets_label")
@ApiModel(value="AssetsLabel对象", description="素材图片类型")
    public class AssetsLabel implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键ID
    */
    @ApiModelProperty(value = "主键ID")
    private Long id;


    /**
    * 素材类型 0 图片、1 视频
    */
    @ApiModelProperty(value = "素材类型 0 图片、1 视频")
    private Integer type;


    /**
    * 类型
    */
    @ApiModelProperty(value = "类型")
    private String name;


    /**
    * 逻辑删除 0未删除、1已删除
    */
    @ApiModelProperty(value = "逻辑删除 0未删除、1已删除")
    private Integer deleted;


}