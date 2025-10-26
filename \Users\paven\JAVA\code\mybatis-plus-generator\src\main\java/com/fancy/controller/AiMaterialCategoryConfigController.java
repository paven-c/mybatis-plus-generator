package com.fancy.controller;
import com.fancy.entity.AiMaterialCategoryConfig;
import com.fancy.service.IAiMaterialCategoryConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import com.fancy.service.ITestService;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *  前端控制器
 * @author Yanyi
 * @since 2023-09-14
 */

@RestController
@Api(value ="")
@RequestMapping("/ai-material-category-config")
public class AiMaterialCategoryConfigController {
    @Autowired
    private IAiMaterialCategoryConfigService aiMaterialCategoryConfigService;

    @GetMapping("/list")
    @ApiOperation(value = "列表查询",notes = "list")
    public List<AiMaterialCategoryConfig> list(){
        return aiMaterialCategoryConfigService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "查看详情",notes = "AiMaterialCategoryConfig")
    public AiMaterialCategoryConfig getAiMaterialCategoryConfigById(Long id){
            return aiMaterialCategoryConfigService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增",notes = "AiMaterialCategoryConfig")
    public boolean saveAiMaterialCategoryConfig(AiMaterialCategoryConfig aiMaterialCategoryConfig){
            return aiMaterialCategoryConfigService.save(aiMaterialCategoryConfig);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "新增/修改",notes = "AiMaterialCategoryConfig")
    public boolean saveOrUpdate(AiMaterialCategoryConfig aiMaterialCategoryConfig){
            return aiMaterialCategoryConfigService.saveOrUpdate(aiMaterialCategoryConfig);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "修改",notes = "AiMaterialCategoryConfig")
    public boolean update(AiMaterialCategoryConfig aiMaterialCategoryConfig){
        return aiMaterialCategoryConfigService.updateById(aiMaterialCategoryConfig);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "删除",notes = "AiMaterialCategoryConfig")
    public boolean remove(Long id){
        return aiMaterialCategoryConfigService.removeById(id);
    }

}
