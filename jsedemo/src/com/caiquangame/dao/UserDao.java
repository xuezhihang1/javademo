package com.caiquangame.dao;

import com.caiquangame.pojo.Users;

public class UserDao {

    //创建储存用户的数组
    private static Users[] ur;
    static{
        ur = new Users[10];
    }
    //根据用户名查找数组
    public Users selectByUname(String uname){
        for (int i = 0;i < ur.length;i++){
            if (ur[i] !=null){
                if(ur[i].getUname().equals(uname)){
                    return ur[i];
                }
            }
        }
        return null;
    }

    //往用户数组中放入新用户
    public int addOne(Users us){
        //遍历用户数组
        for (int i = 0;i < ur.length;i++){
            if (ur[i] == null){
                ur[i] = us;
                return 1;
            }
        }
        return 0;
    }
}
