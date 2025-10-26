package com.skai.controller;
import com.skai.entity.AdminOauth2AccessToken;
import com.skai.service.AdminOauth2AccessTokenService;
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
 * OAuth2 访问令牌 前端控制器
 * @author Yanyi
 * @since 2025-04-11
 */

@RestController
@Api(value ="OAuth2 访问令牌")
@RequestMapping("/admin-oauth2-access-token")
public class AdminOauth2AccessTokenController {
    @Autowired
    private AdminOauth2AccessTokenService adminOauth2AccessTokenService;

    @GetMapping("/list")
    @ApiOperation(value = "OAuth2 访问令牌列表查询",notes = "list")
    public List<AdminOauth2AccessToken> list(){
        return adminOauth2AccessTokenService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "OAuth2 访问令牌查看详情",notes = "AdminOauth2AccessToken")
    public AdminOauth2AccessToken getAdminOauth2AccessTokenById(Long id){
            return adminOauth2AccessTokenService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "OAuth2 访问令牌新增",notes = "AdminOauth2AccessToken")
    public boolean saveAdminOauth2AccessToken(AdminOauth2AccessToken adminOauth2AccessToken){
            return adminOauth2AccessTokenService.save(adminOauth2AccessToken);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "OAuth2 访问令牌新增/修改",notes = "AdminOauth2AccessToken")
    public boolean saveOrUpdate(AdminOauth2AccessToken adminOauth2AccessToken){
            return adminOauth2AccessTokenService.saveOrUpdate(adminOauth2AccessToken);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "OAuth2 访问令牌修改",notes = "AdminOauth2AccessToken")
    public boolean update(AdminOauth2AccessToken adminOauth2AccessToken){
        return adminOauth2AccessTokenService.updateById(adminOauth2AccessToken);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "OAuth2 访问令牌删除",notes = "AdminOauth2AccessToken")
    public boolean remove(Long id){
        return adminOauth2AccessTokenService.removeById(id);
    }

}
