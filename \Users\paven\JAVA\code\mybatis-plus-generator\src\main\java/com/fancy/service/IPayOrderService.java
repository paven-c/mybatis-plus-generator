package com.fancy.service;

import com.fancy.entity.PayOrder;
import com.baomidou.mybatisplus.extension.service.IService;import io.swagger.annotations.Api;

/**
 * @auther Yanyi
 * @create 2023-12-19
 * @describe 支付订单表服务类
 */
@Api(value = "PayOrder服务类")
public interface IPayOrderService extends IService<PayOrder> {

}
