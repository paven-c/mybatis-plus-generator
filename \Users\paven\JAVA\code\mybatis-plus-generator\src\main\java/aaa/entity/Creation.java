package aaa.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("creation")
@ApiModel(value="Creation对象", description="")
    public class Creation implements Serializable {

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
    * 生成记录名称
    */
    @ApiModelProperty(value = "生成记录名称")
    private String name;


    /**
    * 生成记录编号
    */
    @ApiModelProperty(value = "生成记录编号")
    private String creationNo;


    /**
    * 生成记录索引
    */
    @ApiModelProperty(value = "生成记录索引")
    private Integer index;


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
    * 逻辑删除标记 0未删除、1已删除
    */
    @ApiModelProperty(value = "逻辑删除标记 0未删除、1已删除")
    private Integer deleted;


}