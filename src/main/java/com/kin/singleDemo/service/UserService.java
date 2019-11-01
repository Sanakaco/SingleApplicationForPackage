package com.kin.singleDemo.service;

import com.kin.singleDemo.entity.User;

/**
 * @author pandas
 * @InterfaceName UserService
 * @Description TODO
 * @create 2019/10/31 14:54
 */
public interface UserService  {

    public User login(String email,String password);
}
