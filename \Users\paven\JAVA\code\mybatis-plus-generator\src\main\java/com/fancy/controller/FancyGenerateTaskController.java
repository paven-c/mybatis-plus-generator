package com.fancy.controller;
import com.fancy.entity.FancyGenerateTask;
import com.fancy.service.IFancyGenerateTaskService;
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
 * fancy_ai全局任务表 前端控制器
 * @author Yanyi
 * @since 2023-12-22
 */

@RestController
@Api(value ="fancy_ai全局任务表")
@RequestMapping("/fancy-generate-task")
public class FancyGenerateTaskController {
    @Autowired
    private IFancyGenerateTaskService fancyGenerateTaskService;

    @GetMapping("/list")
    @ApiOperation(value = "fancy_ai全局任务表列表查询",notes = "list")
    public List<FancyGenerateTask> list(){
        return fancyGenerateTaskService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "fancy_ai全局任务表查看详情",notes = "FancyGenerateTask")
    public FancyGenerateTask getFancyGenerateTaskById(Long id){
            return fancyGenerateTaskService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "fancy_ai全局任务表新增",notes = "FancyGenerateTask")
    public boolean saveFancyGenerateTask(FancyGenerateTask fancyGenerateTask){
            return fancyGenerateTaskService.save(fancyGenerateTask);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "fancy_ai全局任务表新增/修改",notes = "FancyGenerateTask")
    public boolean saveOrUpdate(FancyGenerateTask fancyGenerateTask){
            return fancyGenerateTaskService.saveOrUpdate(fancyGenerateTask);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "fancy_ai全局任务表修改",notes = "FancyGenerateTask")
    public boolean update(FancyGenerateTask fancyGenerateTask){
        return fancyGenerateTaskService.updateById(fancyGenerateTask);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "fancy_ai全局任务表删除",notes = "FancyGenerateTask")
    public boolean remove(Long id){
        return fancyGenerateTaskService.removeById(id);
    }

}
