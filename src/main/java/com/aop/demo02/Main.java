package com.aop.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
            ApplicationContext context=new ClassPathXmlApplicationContext("aop1.xml");
            UserDao userDao = context.getBean( UserDao.class);
            int add = userDao.addUser(10,"晓明");
    }
}
