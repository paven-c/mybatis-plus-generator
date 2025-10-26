package com.paven.controller;
import com.paven.entity.AiModelConfig;
import com.paven.service.IAiModelConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import com.paven.service.ITestService;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Ai模特图配置表 前端控制器
 * @author Yanyi
 * @since 2023-12-26
 */

@RestController
@Api(value ="Ai模特图配置表")
@RequestMapping("/ai-model-config")
public class AiModelConfigController {
    @Autowired
    private IAiModelConfigService aiModelConfigService;

    @GetMapping("/list")
    @ApiOperation(value = "Ai模特图配置表列表查询",notes = "list")
    public List<AiModelConfig> list(){
        return aiModelConfigService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "Ai模特图配置表查看详情",notes = "AiModelConfig")
    public AiModelConfig getAiModelConfigById(Long id){
            return aiModelConfigService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "Ai模特图配置表新增",notes = "AiModelConfig")
    public boolean saveAiModelConfig(AiModelConfig aiModelConfig){
            return aiModelConfigService.save(aiModelConfig);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "Ai模特图配置表新增/修改",notes = "AiModelConfig")
    public boolean saveOrUpdate(AiModelConfig aiModelConfig){
            return aiModelConfigService.saveOrUpdate(aiModelConfig);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "Ai模特图配置表修改",notes = "AiModelConfig")
    public boolean update(AiModelConfig aiModelConfig){
        return aiModelConfigService.updateById(aiModelConfig);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "Ai模特图配置表删除",notes = "AiModelConfig")
    public boolean remove(Long id){
        return aiModelConfigService.removeById(id);
    }

}
