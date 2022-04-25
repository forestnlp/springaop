package com.aop.demo01;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public int addUser(Integer userid,String username){
        System.out.println("userdao add ... ...");
        int i =1/0;
        return 1;
    }
}
