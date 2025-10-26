package com.fancy.controller;
import com.fancy.entity.AiMaterialCategoryConfigLog;
import com.fancy.service.IAiMaterialCategoryConfigLogService;
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
@RequestMapping("/ai-material-category-config-log")
public class AiMaterialCategoryConfigLogController {
    @Autowired
    private IAiMaterialCategoryConfigLogService aiMaterialCategoryConfigLogService;

    @GetMapping("/list")
    @ApiOperation(value = "列表查询",notes = "list")
    public List<AiMaterialCategoryConfigLog> list(){
        return aiMaterialCategoryConfigLogService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "查看详情",notes = "AiMaterialCategoryConfigLog")
    public AiMaterialCategoryConfigLog getAiMaterialCategoryConfigLogById(Long id){
            return aiMaterialCategoryConfigLogService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增",notes = "AiMaterialCategoryConfigLog")
    public boolean saveAiMaterialCategoryConfigLog(AiMaterialCategoryConfigLog aiMaterialCategoryConfigLog){
            return aiMaterialCategoryConfigLogService.save(aiMaterialCategoryConfigLog);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "新增/修改",notes = "AiMaterialCategoryConfigLog")
    public boolean saveOrUpdate(AiMaterialCategoryConfigLog aiMaterialCategoryConfigLog){
            return aiMaterialCategoryConfigLogService.saveOrUpdate(aiMaterialCategoryConfigLog);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "修改",notes = "AiMaterialCategoryConfigLog")
    public boolean update(AiMaterialCategoryConfigLog aiMaterialCategoryConfigLog){
        return aiMaterialCategoryConfigLogService.updateById(aiMaterialCategoryConfigLog);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "删除",notes = "AiMaterialCategoryConfigLog")
    public boolean remove(Long id){
        return aiMaterialCategoryConfigLogService.removeById(id);
    }

}
