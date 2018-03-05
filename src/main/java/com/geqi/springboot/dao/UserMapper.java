package com.geqi.springboot.dao;

import com.geqi.springboot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value="userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //List<User> selectAllUser();
}