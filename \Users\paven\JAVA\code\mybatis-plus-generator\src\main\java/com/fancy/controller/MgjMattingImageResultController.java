package com.fancy.controller;
import com.fancy.entity.MgjMattingImageResult;
import com.fancy.service.IMgjMattingImageResultService;
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
 * FANCY_GPT007_源素材清洗任务表 前端控制器
 * @author Yanyi
 * @since 2023-08-18
 */

@RestController
@Api(value ="FANCY_GPT007_源素材清洗任务表")
@RequestMapping("/mgj-matting-image-result")
public class MgjMattingImageResultController {
    @Autowired
    private IMgjMattingImageResultService mgjMattingImageResultService;

    @GetMapping("/list")
    @ApiOperation(value = "FANCY_GPT007_源素材清洗任务表列表查询",notes = "list")
    public List<MgjMattingImageResult> list(){
        return mgjMattingImageResultService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "FANCY_GPT007_源素材清洗任务表查看详情",notes = "MgjMattingImageResult")
    public MgjMattingImageResult getMgjMattingImageResultById(Long id){
            return mgjMattingImageResultService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "FANCY_GPT007_源素材清洗任务表新增",notes = "MgjMattingImageResult")
    public boolean saveMgjMattingImageResult(MgjMattingImageResult mgjMattingImageResult){
            return mgjMattingImageResultService.save(mgjMattingImageResult);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "FANCY_GPT007_源素材清洗任务表新增/修改",notes = "MgjMattingImageResult")
    public boolean saveOrUpdate(MgjMattingImageResult mgjMattingImageResult){
            return mgjMattingImageResultService.saveOrUpdate(mgjMattingImageResult);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "FANCY_GPT007_源素材清洗任务表修改",notes = "MgjMattingImageResult")
    public boolean update(MgjMattingImageResult mgjMattingImageResult){
        return mgjMattingImageResultService.updateById(mgjMattingImageResult);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "FANCY_GPT007_源素材清洗任务表删除",notes = "MgjMattingImageResult")
    public boolean remove(Long id){
        return mgjMattingImageResultService.removeById(id);
    }

}
