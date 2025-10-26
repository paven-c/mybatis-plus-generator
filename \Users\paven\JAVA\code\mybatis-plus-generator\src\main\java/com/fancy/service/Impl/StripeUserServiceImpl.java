package com.fancy.service.Impl;

import com.fancy.entity.StripeUser;
import com.fancy.mapper.StripeUserMapper;
import com.fancy.service.IStripeUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther Yanyi
 * @create 2023-12-21
 * @describe Stripe客户表服务实现类
 */
@Service
public class StripeUserServiceImpl extends ServiceImpl<StripeUserMapper, StripeUser> implements IStripeUserService {

}
