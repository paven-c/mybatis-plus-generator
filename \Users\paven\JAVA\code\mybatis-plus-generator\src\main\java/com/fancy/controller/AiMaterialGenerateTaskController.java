package com.fancy.controller;
import com.fancy.entity.AiMaterialGenerateTask;
import com.fancy.service.IAiMaterialGenerateTaskService;
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
 * Ai素材任务表 前端控制器
 * @author Yanyi
 * @since 2023-09-01
 */

@RestController
@Api(value ="Ai素材任务表")
@RequestMapping("/ai-material-generate-task")
public class AiMaterialGenerateTaskController {
    @Autowired
    private IAiMaterialGenerateTaskService aiMaterialGenerateTaskService;

    @GetMapping("/list")
    @ApiOperation(value = "Ai素材任务表列表查询",notes = "list")
    public List<AiMaterialGenerateTask> list(){
        return aiMaterialGenerateTaskService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "Ai素材任务表查看详情",notes = "AiMaterialGenerateTask")
    public AiMaterialGenerateTask getAiMaterialGenerateTaskById(Long id){
            return aiMaterialGenerateTaskService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "Ai素材任务表新增",notes = "AiMaterialGenerateTask")
    public boolean saveAiMaterialGenerateTask(AiMaterialGenerateTask aiMaterialGenerateTask){
            return aiMaterialGenerateTaskService.save(aiMaterialGenerateTask);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "Ai素材任务表新增/修改",notes = "AiMaterialGenerateTask")
    public boolean saveOrUpdate(AiMaterialGenerateTask aiMaterialGenerateTask){
            return aiMaterialGenerateTaskService.saveOrUpdate(aiMaterialGenerateTask);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "Ai素材任务表修改",notes = "AiMaterialGenerateTask")
    public boolean update(AiMaterialGenerateTask aiMaterialGenerateTask){
        return aiMaterialGenerateTaskService.updateById(aiMaterialGenerateTask);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "Ai素材任务表删除",notes = "AiMaterialGenerateTask")
    public boolean remove(Long id){
        return aiMaterialGenerateTaskService.removeById(id);
    }

}
