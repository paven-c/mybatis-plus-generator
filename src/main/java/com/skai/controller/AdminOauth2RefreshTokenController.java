package com.skai.controller;
import com.skai.entity.AdminOauth2RefreshToken;
import com.skai.service.AdminOauth2RefreshTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import org.springframework.web.bind.annotation.RestController;

/**
 *
 * OAuth2 刷新令牌 前端控制器
 * @author Yanyi
 * @since 2025-04-11
 */

@RestController
@Api(value ="OAuth2 刷新令牌")
@RequestMapping("/admin-oauth2-refresh-token")
public class AdminOauth2RefreshTokenController {
    @Autowired
    private AdminOauth2RefreshTokenService adminOauth2RefreshTokenService;

    @GetMapping("/list")
    @ApiOperation(value = "OAuth2 刷新令牌列表查询",notes = "list")
    public List<AdminOauth2RefreshToken> list(){
        return adminOauth2RefreshTokenService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "OAuth2 刷新令牌查看详情",notes = "AdminOauth2RefreshToken")
    public AdminOauth2RefreshToken getAdminOauth2RefreshTokenById(Long id){
            return adminOauth2RefreshTokenService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "OAuth2 刷新令牌新增",notes = "AdminOauth2RefreshToken")
    public boolean saveAdminOauth2RefreshToken(AdminOauth2RefreshToken adminOauth2RefreshToken){
            return adminOauth2RefreshTokenService.save(adminOauth2RefreshToken);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "OAuth2 刷新令牌新增/修改",notes = "AdminOauth2RefreshToken")
    public boolean saveOrUpdate(AdminOauth2RefreshToken adminOauth2RefreshToken){
            return adminOauth2RefreshTokenService.saveOrUpdate(adminOauth2RefreshToken);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "OAuth2 刷新令牌修改",notes = "AdminOauth2RefreshToken")
    public boolean update(AdminOauth2RefreshToken adminOauth2RefreshToken){
        return adminOauth2RefreshTokenService.updateById(adminOauth2RefreshToken);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "OAuth2 刷新令牌删除",notes = "AdminOauth2RefreshToken")
    public boolean remove(Long id){
        return adminOauth2RefreshTokenService.removeById(id);
    }

}
