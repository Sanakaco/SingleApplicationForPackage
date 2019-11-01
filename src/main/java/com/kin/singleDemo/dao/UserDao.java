package com.kin.singleDemo.dao;

import com.kin.singleDemo.entity.User;

/**
 * @author pandas
 * @InterfaceName UserDao
 * @Description TODO
 * @create 2019/10/31 11:19
 */
public interface UserDao {

    public User getUser(String email,String password);

}
