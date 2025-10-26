package com.fancy.service.Impl;

import com.fancy.entity.PayOrder;
import com.fancy.mapper.PayOrderMapper;
import com.fancy.service.IPayOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther Yanyi
 * @create 2023-12-19
 * @describe 支付订单表服务实现类
 */
@Service
public class PayOrderServiceImpl extends ServiceImpl<PayOrderMapper, PayOrder> implements IPayOrderService {

}
