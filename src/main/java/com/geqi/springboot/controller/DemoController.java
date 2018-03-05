package com.geqi.springboot.controller;

import com.geqi.springboot.pojo.User;
import com.geqi.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
//@RequestMapping("/demo")
public class DemoController {

    private String DEMO="demo";

    @Autowired
    private UserService userService;

    @RequestMapping("/demo")
    public String demo(){
        return DEMO;
    }

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
         userService.addUser(user);
        return "SUCCESS";
    }

//    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
//    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
//        return userService.findAllUser(pageNum,pageSize);
//    }
}
