package com.fancy.controller;
import com.fancy.entity.CmsVideoJdMain;
import com.fancy.service.ICmsVideoJdMainService;
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
 * 京东主图视频 前端控制器
 * @author Yanyi
 * @since 2023-11-08
 */

@RestController
@Api(value ="京东主图视频")
@RequestMapping("/cms-video-jd-main")
public class CmsVideoJdMainController {
    @Autowired
    private ICmsVideoJdMainService cmsVideoJdMainService;

    @GetMapping("/list")
    @ApiOperation(value = "京东主图视频列表查询",notes = "list")
    public List<CmsVideoJdMain> list(){
        return cmsVideoJdMainService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "京东主图视频查看详情",notes = "CmsVideoJdMain")
    public CmsVideoJdMain getCmsVideoJdMainById(Long id){
            return cmsVideoJdMainService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "京东主图视频新增",notes = "CmsVideoJdMain")
    public boolean saveCmsVideoJdMain(CmsVideoJdMain cmsVideoJdMain){
            return cmsVideoJdMainService.save(cmsVideoJdMain);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "京东主图视频新增/修改",notes = "CmsVideoJdMain")
    public boolean saveOrUpdate(CmsVideoJdMain cmsVideoJdMain){
            return cmsVideoJdMainService.saveOrUpdate(cmsVideoJdMain);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "京东主图视频修改",notes = "CmsVideoJdMain")
    public boolean update(CmsVideoJdMain cmsVideoJdMain){
        return cmsVideoJdMainService.updateById(cmsVideoJdMain);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "京东主图视频删除",notes = "CmsVideoJdMain")
    public boolean remove(Long id){
        return cmsVideoJdMainService.removeById(id);
    }

}
