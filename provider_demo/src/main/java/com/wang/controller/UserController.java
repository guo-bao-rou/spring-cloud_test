package com.wang.controller;

import com.wang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userController")
public class UserController {

    @RequestMapping(value = "/{id}")
    public User getUser(Long id){
        User user = new User(id,"2323");
        return user;
    }
}
