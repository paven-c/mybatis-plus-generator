package com.fancy.controller;
import com.fancy.entity.CmsVideoJd;
import com.fancy.service.ICmsVideoJdService;
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
 * 京东视频上传记录 前端控制器
 * @author Yanyi
 * @since 2023-11-08
 */

@RestController
@Api(value ="京东视频上传记录")
@RequestMapping("/cms-video-jd")
public class CmsVideoJdController {
    @Autowired
    private ICmsVideoJdService cmsVideoJdService;

    @GetMapping("/list")
    @ApiOperation(value = "京东视频上传记录列表查询",notes = "list")
    public List<CmsVideoJd> list(){
        return cmsVideoJdService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "京东视频上传记录查看详情",notes = "CmsVideoJd")
    public CmsVideoJd getCmsVideoJdById(Long id){
            return cmsVideoJdService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "京东视频上传记录新增",notes = "CmsVideoJd")
    public boolean saveCmsVideoJd(CmsVideoJd cmsVideoJd){
            return cmsVideoJdService.save(cmsVideoJd);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "京东视频上传记录新增/修改",notes = "CmsVideoJd")
    public boolean saveOrUpdate(CmsVideoJd cmsVideoJd){
            return cmsVideoJdService.saveOrUpdate(cmsVideoJd);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "京东视频上传记录修改",notes = "CmsVideoJd")
    public boolean update(CmsVideoJd cmsVideoJd){
        return cmsVideoJdService.updateById(cmsVideoJd);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "京东视频上传记录删除",notes = "CmsVideoJd")
    public boolean remove(Long id){
        return cmsVideoJdService.removeById(id);
    }

}
