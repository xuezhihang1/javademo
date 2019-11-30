package com.auction.dao;

import com.AuctionHouse.Users;

public class UserDao {
    //创建用户数据数组
    private static Users[] ue ;
    static{
        ue = new Users[10];
    }
    //根据用户名查找用户
    public Users selectByUname(String uname){
        for(int i = 0;i < ue.length;i++){
            if(ue[i] != null){
                if(ue[i].getUname().equals(uname)){
                    return ue[i];
                }
            }
        }
        return null;
    }

    //往数组内放入新用户
    public int addOne(Users us){
        //遍历用户数组，找到空的位置，存放新的用户数据
        for(int i = 0;i < ue.length;i++){
            if (ue[i] == null){
                ue[i]  = us;
                return 1;
            }
        }
        return 0;
    }
    //判断用户是否存在
    public int login(String name,String psd){
        for (int j = 0;j <ue.length;j++ ){
            if (ue[j] !=null){
                if (ue[j].getUname().equals(name) && ue[j].getPassword().equals(psd)){
                    return 1;
                }
            }
        }
        return -1;
    }
}
