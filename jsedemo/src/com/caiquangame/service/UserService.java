package com.caiquangame.service;

import com.caiquangame.dao.UserDao;
import com.caiquangame.pojo.Users;

public class UserService {
    private UserDao ua = new UserDao();

    public String register(String uname,String psd){
        //参数非空判断
        if (uname !=null && psd !=null){
            //查看用户是否注册
            Users user = ua.selectByUname(uname);
            if (user != null){
                return "该用户已存在";
            }
            //注册用户
            Users u = new Users();
            u.setUname(uname);
            u.setPassword(psd);
            int i = ua.addOne(u);
            if (i <= 0){
                return "用户注册失败";
            }
        }
        return "用户注册成功";
    }
    //判断用户是否存在

}
