package com.chilly.demo.controller;

import com.chilly.demo.entity.User;
import com.chilly.demo.exception.BaseExceptionHandleAction;
import com.chilly.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @auther ChillyLin
 * @date 2019/12/27
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseExceptionHandleAction {

    @Resource
    UserService userService;

    @GetMapping({"/login"})
    public String login() {
        return "Login";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        HttpSession session) {

        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            session.setAttribute("errorMsg", "用户名或密码不能为空");
            return "Login";
        }

        User user = userService.getUser(userName, password);
        if (user != null) {
            session.setAttribute("loginUser", user.getUserName());
            //session过期时间设置为7200秒 即两小时
            //session.setMaxInactiveInterval(60 * 60 * 2);
            return "redirect:/user/index";
        } else {
            session.setAttribute("errorMsg", "登陆失败,账号或密码有误");
            return "Login";
        }
    }
    @RequestMapping("/index")
    public String toIndex(){
            return "index";
    }

}
