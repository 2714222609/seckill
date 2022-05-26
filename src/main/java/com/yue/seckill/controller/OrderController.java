package com.yue.seckill.controller;

import com.yue.seckill.pojo.User;
import com.yue.seckill.service.IOrderService;
import com.yue.seckill.vo.OrderDeatilVo;
import com.yue.seckill.vo.RespBean;
import com.yue.seckill.vo.RespBeanEnum;
import net.sf.ehcache.search.expression.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 前端控制器
 *
 * @author LiChao
 * @since 2022-03-03
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("/detail")
    @ResponseBody
    public RespBean detail(User user, Long orderId) {
        if (user == null) {
            return RespBean.error(RespBeanEnum.SESSION_ERROR);
        }
        OrderDeatilVo detail = orderService.detail(orderId);
        return RespBean.success(detail);
    }

}
