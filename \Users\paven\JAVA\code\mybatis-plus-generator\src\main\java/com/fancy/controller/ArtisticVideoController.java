package com.fancy.controller;
import com.fancy.entity.ArtisticVideo;
import com.fancy.service.IArtisticVideoService;
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
 * 作品集 - 视频数据 前端控制器
 * @author Yanyi
 * @since 2023-12-18
 */

@RestController
@Api(value ="作品集 - 视频数据")
@RequestMapping("/artistic-video")
public class ArtisticVideoController {
    @Autowired
    private IArtisticVideoService artisticVideoService;

    @GetMapping("/list")
    @ApiOperation(value = "作品集 - 视频数据列表查询",notes = "list")
    public List<ArtisticVideo> list(){
        return artisticVideoService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "作品集 - 视频数据查看详情",notes = "ArtisticVideo")
    public ArtisticVideo getArtisticVideoById(Long id){
            return artisticVideoService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "作品集 - 视频数据新增",notes = "ArtisticVideo")
    public boolean saveArtisticVideo(ArtisticVideo artisticVideo){
            return artisticVideoService.save(artisticVideo);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "作品集 - 视频数据新增/修改",notes = "ArtisticVideo")
    public boolean saveOrUpdate(ArtisticVideo artisticVideo){
            return artisticVideoService.saveOrUpdate(artisticVideo);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "作品集 - 视频数据修改",notes = "ArtisticVideo")
    public boolean update(ArtisticVideo artisticVideo){
        return artisticVideoService.updateById(artisticVideo);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "作品集 - 视频数据删除",notes = "ArtisticVideo")
    public boolean remove(Long id){
        return artisticVideoService.removeById(id);
    }

}
