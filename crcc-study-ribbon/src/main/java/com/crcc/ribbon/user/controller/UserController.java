package com.crcc.ribbon.user.controller;

import com.crcc.ribbon.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2019/7/11.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userSerivce;

    @RequestMapping("/getByName/{name}")
    public String getUserByName(@PathVariable("name")String userName){
        return userSerivce.getUserByName(userName);
    }

    @RequestMapping("/getById")
    public String getUserById(@RequestParam("id")String id){
        return userSerivce.getUserById(id);
    }
}
