package com.aop.demo02;

import org.springframework.stereotype.Repository;

public interface UserDao {
     int addUser(Integer userid,String username);
}
