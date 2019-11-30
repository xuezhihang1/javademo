package com.auction.controller;

import com.AuctionHouse.Users;
import com.auction.service.UserService;

public class UserController {

    UserService us = new UserService();
    //用户注册需要两个参数
    public String register(String uname,String psd){

        String re = us.register(uname,psd);
        return re;
    }
    public String lg(String name,String psd){
        String a = us.login(name,psd);
        return a;
    }
}
