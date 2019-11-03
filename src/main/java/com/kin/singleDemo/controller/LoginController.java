package com.kin.singleDemo.controller;

import com.kin.singleDemo.entity.User;
import com.kin.singleDemo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author pandas
 * @ClassName LoginController
 * @Description TODO
 * @create 2019/10/31 15:18
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"","/login"},method = RequestMethod.GET)
    public String login(){
        System.out.println("asfas");
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam String email,@RequestParam String password){
        User user=userService.login(email,password);
        System.out.println("asdf");
        //如果非空，说明验证通过
        if (user!=null){
            //通过关键字跳转页面
            return "redirect:/main";
        }
        //登录失败
        else {
            return login();
        }
    }
    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView view = new ModelAndView();
        view.setViewName("test");
        view.addObject("msg","word");
        System.out.println("wo");
        return view;
    }

}
