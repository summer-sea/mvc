package com.summer.controller;


import com.summer.pojo.User;
import com.summer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("getByid")
    @ResponseBody
    public List<User> getUser(String id){
        System.out.println(" id = "+id);

        return userService.getUser(id);
    }
}
