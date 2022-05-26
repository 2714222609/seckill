package com.yue.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yue.seckill.pojo.User;
import com.yue.seckill.vo.LoginVo;
import com.yue.seckill.vo.RespBean;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Author yue
 * @Date 2022/5/20 22:22
 */
public interface IUserService extends IService<User> {
    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
    User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);
    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
