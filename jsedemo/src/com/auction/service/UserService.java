package com.auction.service;

import com.auction.pojo.Users;
import com.auction.dao.UserDao;


//业务层
public class UserService {
    private UserDao ud = new UserDao();

    public String register(String uname, String psd) {
        //参数非空判断
        if (uname != null) {
            if (psd != null) {

            }
        }
        //查看当前用户是否注册
        Users users = ud.selectByUname(uname);
        if (users != null) {
            return "用户名已存在";
        }
        //注册用户，把用户信息储存起来
        Users u = new Users();
        u.setUname(uname);
        u.setPassword(psd);
        int i = ud.addOne(u);
        if (i <= 0) {
            return "用户注册失败";
        }
        return "用户注册成功";
    }

    //登录
    public String login(String uname, String password) {
        int i = ud.login(uname, password);
        if (i == 1) {
            return "登录成功";
        }
        return "登录失败";
    }

    //充值
    public int Recharge(int re) {
        int a = ud.Recharge(re);
        return a;
    }

    //展示百宝囊
    public void showTreasureBag() {
        ud.showTreasureBag();
    }

    //上架商品
    public void shelves() {
        ud.shelves();
    }

    //展示购物车
    public int showCar() {
        int i = ud.showCar();
        return i;
    }

    //加入购物车
    public int shoppingCar(int l) {
        int i = ud.shoppingCar(l);
        return i;
    }

    //结算模块
    public int payment() {
        int n = ud.payment();
        return n;
    }

    public int spend(int n) {
        int r = ud.spend(n);
        return r;
    }
}
