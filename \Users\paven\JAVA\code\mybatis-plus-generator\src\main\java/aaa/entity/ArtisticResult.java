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
@TableName("artistic_result")
@ApiModel(value="ArtisticResult对象", description="")
    public class ArtisticResult implements Serializable {

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
    * 文件类型 0模特图、1模特动作视频、2渲染视频
    */
    @ApiModelProperty(value = "文件类型 0模特图、1模特动作视频、2渲染视频")
    private Integer fileType;


    /**
    * 链接
    */
    @ApiModelProperty(value = "链接")
    private String url;


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
    * 逻辑删除 0未删除、1已删除
    */
    @ApiModelProperty(value = "逻辑删除 0未删除、1已删除")
    private Integer deleted;


}