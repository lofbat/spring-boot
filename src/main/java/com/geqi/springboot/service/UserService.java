package com.geqi.springboot.service;

import com.geqi.springboot.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    //List<User> findAllUser(int pageNum, int pageSize);
}
