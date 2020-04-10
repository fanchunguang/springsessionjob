package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class UserController {

    private static final String LOGIN_ASSIGN = "admin";

    @RequestMapping(value = "/loginSystem",method = RequestMethod.POST)
    public String login(String username, String password,
                            HttpSession session){
        if(username!=null && LOGIN_ASSIGN.equals(username)
                && password!=null && LOGIN_ASSIGN.equals(password)){
            session.setAttribute("login",true);
            return "redirect:/resume/resume01";
        }else{
            return "login/toLogin";
        }
    }

    @RequestMapping("toLogin")
    public String toLogin() {
        System.out.println("================++++++++++++++跳转登录页面");
        return "login";
    }

}
