package com.yue.seckill.controller;

import com.yue.seckill.pojo.User;
import com.yue.seckill.rabbitmq.MQSender;
import com.yue.seckill.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author yue
 * @Date 2022/5/20 22:18
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    MQSender mqSender;

    @RequestMapping("/info")
    @ResponseBody
    public RespBean info(User user) {
        return RespBean.success(user);
    }
//
//    @RequestMapping("/mq")
//    @ResponseBody
//    public void mq(){
//        mqSender.send("Hello");
//    }
//
//    @RequestMapping("/mq/fanout")
//    @ResponseBody
//    public void mq01() {
//        mqSender.send("Hello");
//    }

//    @RequestMapping(value = "/mq/direct01")
//    @ResponseBody
//    public void mqDirect01() {
//        mqSender.send01("Hello Red");
//    }
//
//    @RequestMapping(value = "/mq/direct02")
//    @ResponseBody
//    public void mqDirect02() {
//        mqSender.send02("Hello Green");
//    }
//
//    @RequestMapping(value = "/mq/topic01")
//    @ResponseBody
//    public void mqtopic01() {
//        mqSender.send03("Hello Red");
//    }
//
//    @RequestMapping(value = "/mq/topic02")
//    @ResponseBody
//    public void mqtopic02() {
//        mqSender.send04("Hello Green");
//    }

}
