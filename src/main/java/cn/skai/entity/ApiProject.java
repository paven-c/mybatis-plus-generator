package cn.skai.entity;
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
 * @author Yanyi
 */
@Data
@TableName("api_project")
    public class ApiProject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键ID
    */
    private Long id;

    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 项目ID
    */
    private Long projectId;

    /**
    * 项目类型
    */
    private String projectType;

    /**
    * 状态
    */
    private String status;

    /**
    * 当前任务类型
    */
    private String currentTask;

    /**
    * 最终结果
    */
    private String finalResponse;

    /**
    * 开始时间
    */
    private LocalDateTime projectStart;

    /**
    * 结束时间
    */
    private LocalDateTime projectEnd;

    /**
    * 创建时间
    */
    private LocalDateTime createAt;

    /**
    * 更新时间
    */
    private LocalDateTime updateAt;


}