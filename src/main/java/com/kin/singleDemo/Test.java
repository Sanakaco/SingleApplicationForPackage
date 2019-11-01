package com.kin.singleDemo;

import com.kin.singleDemo.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pandas
 * @ClassName Test
 * @Description TODO
 * @create 2019/10/31 16:50
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDaoId = context.getBean("UserDaoId",UserDao.class);
        System.out.println(userDaoId.getUser("admin@163.com","admin"));

    }
}
