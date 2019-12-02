package com.auction.controller;

import com.auction.pojo.Users;
import com.auction.service.UserService;


//控制层
public class UserController {

    UserService us = new UserService();
    //用户注册需要两个参数
    public String register(String uname,String psd){

        String re = us.register(uname,psd);
        return re;
    }
    public String lg(String name,String psd2){
        String a = us.login(name,psd2);
        return a;
    }
    //充值
    public int Recharge1(int re){
        int r = us.Recharge(re);
        return r;
    }
    //展示百宝囊
    public void showTreasureBag(){
        us.showTreasureBag();
    }
    //上架商品
    public void shelves(){
        us.shelves();
    }
    //展示购物车
    public int showCar(){
        int i = us.showCar();
        return i;
    }
    //加入购物车
    public int shoppingCar(int a){
        int i=us.shoppingCar(a);
        return i;
    }
    //结算模块
    public int payment(){
        int n=us.payment();
        return n;
    }
    public int  spend(int n){
        int r=us.spend(n);
        return r;
    }
}
