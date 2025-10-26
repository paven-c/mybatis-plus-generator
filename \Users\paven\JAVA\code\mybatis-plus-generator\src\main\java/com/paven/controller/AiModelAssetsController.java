package com.paven.controller;
import com.paven.entity.AiModelAssets;
import com.paven.service.IAiModelAssetsService;
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
 * Ai模特素材表 前端控制器
 * @author Yanyi
 * @since 2023-12-26
 */

@RestController
@Api(value ="Ai模特素材表")
@RequestMapping("/ai-model-assets")
public class AiModelAssetsController {
    @Autowired
    private IAiModelAssetsService aiModelAssetsService;

    @GetMapping("/list")
    @ApiOperation(value = "Ai模特素材表列表查询",notes = "list")
    public List<AiModelAssets> list(){
        return aiModelAssetsService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "Ai模特素材表查看详情",notes = "AiModelAssets")
    public AiModelAssets getAiModelAssetsById(Long id){
            return aiModelAssetsService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "Ai模特素材表新增",notes = "AiModelAssets")
    public boolean saveAiModelAssets(AiModelAssets aiModelAssets){
            return aiModelAssetsService.save(aiModelAssets);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "Ai模特素材表新增/修改",notes = "AiModelAssets")
    public boolean saveOrUpdate(AiModelAssets aiModelAssets){
            return aiModelAssetsService.saveOrUpdate(aiModelAssets);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "Ai模特素材表修改",notes = "AiModelAssets")
    public boolean update(AiModelAssets aiModelAssets){
        return aiModelAssetsService.updateById(aiModelAssets);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "Ai模特素材表删除",notes = "AiModelAssets")
    public boolean remove(Long id){
        return aiModelAssetsService.removeById(id);
    }

}
