package com.kin.singleDemo.dao.Impl;

import com.kin.singleDemo.dao.UserDao;
import com.kin.singleDemo.entity.User;
import com.kin.singleDemo.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pandas
 * @ClassName UserDaoImpl
 * @Description TODO
 * @create 2019/10/31 11:23
 */
public class UserDaoImpl implements UserDao {

    private User user=null;
    @Override
    public User getUser(String email, String password) {


        if ("admin@163.com".equals(email)){
            if ("admin".equals(password)){
                user=new User();
                user.setEmail("admin");
                user.setUsername("管理员");
            }
        }

        return user;
    }
}
