package com.yue.seckill.controller;

import com.yue.seckill.pojo.User;
import com.yue.seckill.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Author yue
 * @Date 2022/5/21 09:41
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/toList")
    public String toList(Model model, User user){
        model.addAttribute("user", user);
        return "goodsList";
    }
}
