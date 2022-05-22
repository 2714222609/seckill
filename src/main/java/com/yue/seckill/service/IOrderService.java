package com.yue.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yue.seckill.pojo.Order;
import com.yue.seckill.pojo.User;
import com.yue.seckill.vo.GoodsVo;

/**
 * 服务类
 *
 * @author LiChao
 * @since 2022-03-03
 */
public interface IOrderService extends IService<Order> {

    Order seckill(User user, GoodsVo goods);
}
