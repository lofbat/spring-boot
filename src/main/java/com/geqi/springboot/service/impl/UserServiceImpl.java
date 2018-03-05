package com.geqi.springboot.service.impl;

import com.geqi.springboot.dao.UserMapper;
import com.geqi.springboot.pojo.User;
import com.geqi.springboot.service.UserService;
//import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

//    @Override
//    public List<User> findAllUser(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        return userMapper.selectAllUser();
//    }
}
