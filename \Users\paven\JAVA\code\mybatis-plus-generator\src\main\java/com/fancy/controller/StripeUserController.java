package com.fancy.controller;
import com.fancy.entity.StripeUser;
import com.fancy.service.IStripeUserService;
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
 * Stripe客户表 前端控制器
 * @author Yanyi
 * @since 2023-12-21
 */

@RestController
@Api(value ="Stripe客户表")
@RequestMapping("/stripe-user")
public class StripeUserController {
    @Autowired
    private IStripeUserService stripeUserService;

    @GetMapping("/list")
    @ApiOperation(value = "Stripe客户表列表查询",notes = "list")
    public List<StripeUser> list(){
        return stripeUserService.list();
    }

    @GetMapping("/detail")
    @ApiOperation(value = "Stripe客户表查看详情",notes = "StripeUser")
    public StripeUser getStripeUserById(Long id){
            return stripeUserService.getById(id);
    }

    @PostMapping("/save")
    @ApiOperation(value = "Stripe客户表新增",notes = "StripeUser")
    public boolean saveStripeUser(StripeUser stripeUser){
            return stripeUserService.save(stripeUser);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "Stripe客户表新增/修改",notes = "StripeUser")
    public boolean saveOrUpdate(StripeUser stripeUser){
            return stripeUserService.saveOrUpdate(stripeUser);
    }

    @PostMapping("/修改")
    @ApiOperation(value = "Stripe客户表修改",notes = "StripeUser")
    public boolean update(StripeUser stripeUser){
        return stripeUserService.updateById(stripeUser);
    }

    @PostMapping("/remove")
    @ApiOperation(value = "Stripe客户表删除",notes = "StripeUser")
    public boolean remove(Long id){
        return stripeUserService.removeById(id);
    }

}
