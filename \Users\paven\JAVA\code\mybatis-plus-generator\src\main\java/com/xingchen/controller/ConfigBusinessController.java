package com.xingchen.controller;
import com.xingchen.entity.ConfigBusiness;
import com.xingchen.service.IConfigBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import com.xingchen.service.ITestService;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *  前端控制器
 * @author xingchen
 * @since 2023-12-30
 */

@RestController
@Api(value ="")
@RequestMapping("/config-business")
public class ConfigBusinessController {
    @Autowired
    private IConfigBusinessService configBusinessService;

    @GetMapping("/list")
    @ApiOperation(value = "列表查询",notes = "list")
    public List<ConfigBusiness> list(){
        return configBusinessService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "查看详情",notes = "ConfigBusiness")
    public ConfigBusiness getConfigBusinessById(Long id){
            return configBusinessService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增",notes = "ConfigBusiness")
    public boolean saveConfigBusiness(ConfigBusiness configBusiness){
            return configBusinessService.save(configBusiness);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "新增/修改",notes = "ConfigBusiness")
    public boolean saveOrUpdate(ConfigBusiness configBusiness){
            return configBusinessService.saveOrUpdate(configBusiness);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "修改",notes = "ConfigBusiness")
    public boolean update(ConfigBusiness configBusiness){
        return configBusinessService.updateById(configBusiness);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "删除",notes = "ConfigBusiness")
    public boolean remove(Long id){
        return configBusinessService.removeById(id);
    }

}
