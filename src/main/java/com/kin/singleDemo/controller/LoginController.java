package com.kin.singleDemo.controller;

import com.kin.singleDemo.entity.User;
import com.kin.singleDemo.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author pandas
 * @ClassName LoginController
 * @Description TODO
 * @create 2019/10/31 15:18
 */
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String hEmail=req.getParameter("email");
        String hPassword=req.getParameter("password");
        UserServiceImpl userService=new UserServiceImpl();
        User user=userService.login(hEmail,hPassword);
        //如果非空，说明验证通过
        if (user!=null){
            resp.sendRedirect("/main.jsp");
        }
        //登录失败
        else {
            req.setAttribute("message","用户或密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }


    }
}
