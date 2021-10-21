package com.hs.controller;

import com.hs.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/dongtai/test")
    public User test(String name){
        User user=new User();
        user.setUid(1001);
        user.setUname(name);
        System.out.println(user);
        return user;
    }
}
