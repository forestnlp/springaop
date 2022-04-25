package com.aop.demo02;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public int addUser(Integer userid,String username){
        System.out.println("我是 add ... ...");
        int i =1/0;
        return 1;
    }
}
