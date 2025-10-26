package com.fancy.controller;
import com.fancy.entity.PlanOrder;
import com.fancy.service.IPlanOrderService;
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
 * 计划订阅订单表 前端控制器
 * @author Yanyi
 * @since 2023-12-19
 */

@RestController
@Api(value ="计划订阅订单表")
@RequestMapping("/plan-order")
public class PlanOrderController {
    @Autowired
    private IPlanOrderService planOrderService;

    @GetMapping("/list")
    @ApiOperation(value = "计划订阅订单表列表查询",notes = "list")
    public List<PlanOrder> list(){
        return planOrderService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "计划订阅订单表查看详情",notes = "PlanOrder")
    public PlanOrder getPlanOrderById(Long id){
            return planOrderService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "计划订阅订单表新增",notes = "PlanOrder")
    public boolean savePlanOrder(PlanOrder planOrder){
            return planOrderService.save(planOrder);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "计划订阅订单表新增/修改",notes = "PlanOrder")
    public boolean saveOrUpdate(PlanOrder planOrder){
            return planOrderService.saveOrUpdate(planOrder);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "计划订阅订单表修改",notes = "PlanOrder")
    public boolean update(PlanOrder planOrder){
        return planOrderService.updateById(planOrder);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "计划订阅订单表删除",notes = "PlanOrder")
    public boolean remove(Long id){
        return planOrderService.removeById(id);
    }

}
