package com.yue.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yue.seckill.pojo.SeckillOrder;
import com.yue.seckill.pojo.User;

/**
 * 秒杀订单表 服务类
 *
 * @author LiChao
 * @since 2022-03-03
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {


    Long getResult(User user, Long goodsId);
}
