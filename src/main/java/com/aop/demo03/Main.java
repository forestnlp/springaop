package com.aop.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
            ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
            UserDao userDao = context.getBean( UserDao.class);
            int add = userDao.addUser(10,"晓明");
    }
}
