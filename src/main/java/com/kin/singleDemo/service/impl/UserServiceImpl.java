package com.kin.singleDemo.service.impl;

import com.kin.singleDemo.dao.Impl.UserDaoImpl;
import com.kin.singleDemo.dao.UserDao;
import com.kin.singleDemo.entity.User;
import com.kin.singleDemo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pandas
 * @ClassName UserServiceImpl
 * @Description TODO
 * @create 2019/10/31 14:54
 */
public class UserServiceImpl implements UserService {


    @Override
    public User login(String email, String password) {
        UserDao userDaoId = new UserDaoImpl();
        return userDaoId.getUser(email,password);
    }
}
