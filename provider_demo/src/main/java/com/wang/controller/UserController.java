package com.wang.controller;

import com.wang.mapper.UserMapper;
import com.wang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "userController")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Long id){
        User user = userMapper.selectById(id);
        return user;
    }
}
