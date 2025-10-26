package ccc.controller;
import ccc.entity.AssetsLabel;
import ccc.service.IAssetsLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import ccc.service.ITestService;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 素材图片类型 前端控制器
 * @author yanyi
 * @since 2024-01-06
 */

@RestController
@Api(value ="素材图片类型")
@RequestMapping("/assets-label")
public class AssetsLabelController {
    @Autowired
    private IAssetsLabelService assetsLabelService;

    @GetMapping("/list")
    @ApiOperation(value = "素材图片类型列表查询",notes = "list")
    public List<AssetsLabel> list(){
        return assetsLabelService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "素材图片类型查看详情",notes = "AssetsLabel")
    public AssetsLabel getAssetsLabelById(Long id){
            return assetsLabelService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "素材图片类型新增",notes = "AssetsLabel")
    public boolean saveAssetsLabel(AssetsLabel assetsLabel){
            return assetsLabelService.save(assetsLabel);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "素材图片类型新增/修改",notes = "AssetsLabel")
    public boolean saveOrUpdate(AssetsLabel assetsLabel){
            return assetsLabelService.saveOrUpdate(assetsLabel);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "素材图片类型修改",notes = "AssetsLabel")
    public boolean update(AssetsLabel assetsLabel){
        return assetsLabelService.updateById(assetsLabel);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "素材图片类型删除",notes = "AssetsLabel")
    public boolean remove(Long id){
        return assetsLabelService.removeById(id);
    }

}
