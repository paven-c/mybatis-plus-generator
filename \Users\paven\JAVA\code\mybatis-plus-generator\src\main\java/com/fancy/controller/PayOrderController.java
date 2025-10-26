package com.fancy.controller;
import com.fancy.entity.PayOrder;
import com.fancy.service.IPayOrderService;
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
 * 支付订单表 前端控制器
 * @author Yanyi
 * @since 2023-12-19
 */

@RestController
@Api(value ="支付订单表")
@RequestMapping("/pay-order")
public class PayOrderController {
    @Autowired
    private IPayOrderService payOrderService;

    @GetMapping("/list")
    @ApiOperation(value = "支付订单表列表查询",notes = "list")
    public List<PayOrder> list(){
        return payOrderService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "支付订单表查看详情",notes = "PayOrder")
    public PayOrder getPayOrderById(Long id){
            return payOrderService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "支付订单表新增",notes = "PayOrder")
    public boolean savePayOrder(PayOrder payOrder){
            return payOrderService.save(payOrder);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "支付订单表新增/修改",notes = "PayOrder")
    public boolean saveOrUpdate(PayOrder payOrder){
            return payOrderService.saveOrUpdate(payOrder);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "支付订单表修改",notes = "PayOrder")
    public boolean update(PayOrder payOrder){
        return payOrderService.updateById(payOrder);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "支付订单表删除",notes = "PayOrder")
    public boolean remove(Long id){
        return payOrderService.removeById(id);
    }

}
