package com.kin.singleDemo.service.impl;

import com.kin.singleDemo.dao.Impl.UserDaoImpl;
import com.kin.singleDemo.dao.UserDao;
import com.kin.singleDemo.entity.User;
import com.kin.singleDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author pandas
 * @ClassName UserServiceImpl
 * @Description TODO
 * @create 2019/10/31 14:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User login(String email, String password) {

        return userDao.getUser(email,password);
    }
}
