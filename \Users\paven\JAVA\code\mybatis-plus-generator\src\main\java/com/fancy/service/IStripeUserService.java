package com.fancy.service;

import com.fancy.entity.StripeUser;
import com.baomidou.mybatisplus.extension.service.IService;import io.swagger.annotations.Api;

/**
 * @auther Yanyi
 * @create 2023-12-21
 * @describe Stripe客户表服务类
 */
@Api(value = "StripeUser服务类")
public interface IStripeUserService extends IService<StripeUser> {

}
