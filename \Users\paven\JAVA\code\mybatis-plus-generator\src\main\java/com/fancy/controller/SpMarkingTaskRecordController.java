package com.fancy.controller;
import com.fancy.entity.SpMarkingTaskRecord;
import com.fancy.service.ISpMarkingTaskRecordService;
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
 * FANCY_GPT007_源素材打标任务操作记录表 前端控制器
 * @author Yanyi
 * @since 2023-08-11
 */

@RestController
@Api(value ="FANCY_GPT007_源素材打标任务操作记录表")
@RequestMapping("/sp-marking-task-record")
public class SpMarkingTaskRecordController {
    @Autowired
    private ISpMarkingTaskRecordService spMarkingTaskRecordService;

    @GetMapping("/list")
    @ApiOperation(value = "FANCY_GPT007_源素材打标任务操作记录表列表查询",notes = "list")
    public List<SpMarkingTaskRecord> list(){
        return spMarkingTaskRecordService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "FANCY_GPT007_源素材打标任务操作记录表查看详情",notes = "SpMarkingTaskRecord")
    public SpMarkingTaskRecord getSpMarkingTaskRecordById(Long id){
            return spMarkingTaskRecordService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "FANCY_GPT007_源素材打标任务操作记录表新增",notes = "SpMarkingTaskRecord")
    public boolean saveSpMarkingTaskRecord(SpMarkingTaskRecord spMarkingTaskRecord){
            return spMarkingTaskRecordService.save(spMarkingTaskRecord);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "FANCY_GPT007_源素材打标任务操作记录表新增/修改",notes = "SpMarkingTaskRecord")
    public boolean saveOrUpdate(SpMarkingTaskRecord spMarkingTaskRecord){
            return spMarkingTaskRecordService.saveOrUpdate(spMarkingTaskRecord);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "FANCY_GPT007_源素材打标任务操作记录表修改",notes = "SpMarkingTaskRecord")
    public boolean update(SpMarkingTaskRecord spMarkingTaskRecord){
        return spMarkingTaskRecordService.updateById(spMarkingTaskRecord);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "FANCY_GPT007_源素材打标任务操作记录表删除",notes = "SpMarkingTaskRecord")
    public boolean remove(Long id){
        return spMarkingTaskRecordService.removeById(id);
    }

}
