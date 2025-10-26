package com.fancy.controller;
import com.fancy.entity.MerchantAiMaterialConfig;
import com.fancy.service.IMerchantAiMaterialConfigService;
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
 * 商户AI素材配置表 前端控制器
 * @author Yanyi
 * @since 2023-10-26
 */

@RestController
@Api(value ="商户AI素材配置表")
@RequestMapping("/merchant-ai-material-config")
public class MerchantAiMaterialConfigController {
    @Autowired
    private IMerchantAiMaterialConfigService merchantAiMaterialConfigService;

    @GetMapping("/list")
    @ApiOperation(value = "商户AI素材配置表列表查询",notes = "list")
    public List<MerchantAiMaterialConfig> list(){
        return merchantAiMaterialConfigService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "商户AI素材配置表查看详情",notes = "MerchantAiMaterialConfig")
    public MerchantAiMaterialConfig getMerchantAiMaterialConfigById(Long id){
            return merchantAiMaterialConfigService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "商户AI素材配置表新增",notes = "MerchantAiMaterialConfig")
    public boolean saveMerchantAiMaterialConfig(MerchantAiMaterialConfig merchantAiMaterialConfig){
            return merchantAiMaterialConfigService.save(merchantAiMaterialConfig);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "商户AI素材配置表新增/修改",notes = "MerchantAiMaterialConfig")
    public boolean saveOrUpdate(MerchantAiMaterialConfig merchantAiMaterialConfig){
            return merchantAiMaterialConfigService.saveOrUpdate(merchantAiMaterialConfig);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "商户AI素材配置表修改",notes = "MerchantAiMaterialConfig")
    public boolean update(MerchantAiMaterialConfig merchantAiMaterialConfig){
        return merchantAiMaterialConfigService.updateById(merchantAiMaterialConfig);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "商户AI素材配置表删除",notes = "MerchantAiMaterialConfig")
    public boolean remove(Long id){
        return merchantAiMaterialConfigService.removeById(id);
    }

}
