package cn.skai.controller;
import cn.skai.entity.ApiProject;
import cn.skai.service.ApiProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import org.springframework.web.bind.annotation.RestController;

/**
 *
 *  前端控制器
 * @author Yanyi
 * @since 2025-05-09
 */

@RestController
@Api(value ="")
@RequestMapping("/api-project")
public class ApiProjectController {
    @Autowired
    private ApiProjectService apiProjectService;

    @GetMapping("/list")
    @ApiOperation(value = "列表查询",notes = "list")
    public List<ApiProject> list(){
        return apiProjectService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "查看详情",notes = "ApiProject")
    public ApiProject getApiProjectById(Long id){
            return apiProjectService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增",notes = "ApiProject")
    public boolean saveApiProject(ApiProject apiProject){
            return apiProjectService.save(apiProject);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "新增/修改",notes = "ApiProject")
    public boolean saveOrUpdate(ApiProject apiProject){
            return apiProjectService.saveOrUpdate(apiProject);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "修改",notes = "ApiProject")
    public boolean update(ApiProject apiProject){
        return apiProjectService.updateById(apiProject);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "删除",notes = "ApiProject")
    public boolean remove(Long id){
        return apiProjectService.removeById(id);
    }

}
