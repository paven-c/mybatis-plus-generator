package com.skai.entity;
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
@TableName("admin_oauth2_access_token")
    public class AdminOauth2AccessToken implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 编号
    */
    private Long id;

    /**
    * 用户编号
    */
    private Long userId;

    /**
    * 用户信息
    */
    private String userInfo;

    /**
    * 访问令牌
    */
    private String accessToken;

    /**
    * 刷新令牌
    */
    private String refreshToken;

    /**
    * 授权范围
    */
    private String scopes;

    /**
    * 过期时间
    */
    private LocalDateTime expiresTime;

    /**
    * 创建者
    */
    private String creator;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新者
    */
    private String updater;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;

    /**
    * 是否删除
    */
    private Boolean deleted;


}