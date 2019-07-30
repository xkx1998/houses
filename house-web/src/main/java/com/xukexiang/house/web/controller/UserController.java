package com.xukexiang.house.web.controller;

import com.xukexiang.house.biz.service.UserService;
import com.xukexiang.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
