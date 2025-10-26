package com.fancy.controller;
import com.fancy.entity.AiVideoTitleTask;
import com.fancy.service.IAiVideoTitleTaskService;
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
 * 算法智能标题任务表 前端控制器
 * @author Yanyi
 * @since 2023-12-12
 */

@RestController
@Api(value ="算法智能标题任务表")
@RequestMapping("/ai-video-title-task")
public class AiVideoTitleTaskController {
    @Autowired
    private IAiVideoTitleTaskService aiVideoTitleTaskService;

    @GetMapping("/list")
    @ApiOperation(value = "算法智能标题任务表列表查询",notes = "list")
    public List<AiVideoTitleTask> list(){
        return aiVideoTitleTaskService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "算法智能标题任务表查看详情",notes = "AiVideoTitleTask")
    public AiVideoTitleTask getAiVideoTitleTaskById(Long id){
            return aiVideoTitleTaskService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "算法智能标题任务表新增",notes = "AiVideoTitleTask")
    public boolean saveAiVideoTitleTask(AiVideoTitleTask aiVideoTitleTask){
            return aiVideoTitleTaskService.save(aiVideoTitleTask);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "算法智能标题任务表新增/修改",notes = "AiVideoTitleTask")
    public boolean saveOrUpdate(AiVideoTitleTask aiVideoTitleTask){
            return aiVideoTitleTaskService.saveOrUpdate(aiVideoTitleTask);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "算法智能标题任务表修改",notes = "AiVideoTitleTask")
    public boolean update(AiVideoTitleTask aiVideoTitleTask){
        return aiVideoTitleTaskService.updateById(aiVideoTitleTask);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "算法智能标题任务表删除",notes = "AiVideoTitleTask")
    public boolean remove(Long id){
        return aiVideoTitleTaskService.removeById(id);
    }

}
