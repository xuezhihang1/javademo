package com.caiquangame.controller;

import com.caiquangame.service.UserService;

public class UserController {

    UserService us = new UserService();
    public String register(String uname,String psd){

        String re = us.register(uname,psd);
        return re;
    }
}
