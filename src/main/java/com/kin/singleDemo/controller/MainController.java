package com.kin.singleDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author pandas
 * @ClassName MainController
 * @Description TODO
 * @create 2019/11/3 16:15
 */
@Controller
public class MainController {
    @RequestMapping(value = "main",method = RequestMethod.GET)
    public String main(){
        return "main";
    }

}
