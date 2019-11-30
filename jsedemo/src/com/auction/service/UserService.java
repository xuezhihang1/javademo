package com.auction.service;

import com.AuctionHouse.Users;
import com.auction.dao.UserDao;

public class UserService {
    private UserDao ud = new UserDao();

    public String register(String uname,String psd){
        //参数非空判断
        if (uname != null){
            if(psd != null){

            }
        }
        //查看当前用户是否注册
        Users users= ud.selectByUname(uname);
        if(users != null){
            return "用户名已存在";
        }
        //注册用户，把用户信息储存起来
        Users u = new Users();
        u.setUname(uname);
        u.setPassword(psd);
        int i = ud.addOne(u);
        if (i <= 0){
            return "用户注册失败";
        }
        return "用户注册成功";
    }
    public String login(String uname,String password){
        int i = ud.login(uname,password);
        if (i ==1){
            return "登录成功";
        }
        return "登录失败";
    }
}
