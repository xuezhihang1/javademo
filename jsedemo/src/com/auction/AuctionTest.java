package com.auction;

import com.auction.controller.UserController;

import java.util.Scanner;
public class AuctionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserController a = new UserController();
        for (int i = 0;i<10;) {
            System.out.println("欢迎来到233年一次的万界拍卖会");
            System.out.println("==============================");
            System.out.println("请注册：");
            System.out.println("请输入用户名：");
            String uname = sc.next();
            System.out.println("请输入密码:");
            String psd = sc.next();
            UserController uc = new UserController();
            String register = uc.register(uname, psd);
            System.out.println(register);
            System.out.println("请登录");
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String psd2  = sc.next();
            String dl = a.lg(name,psd);
            System.out.println(dl);
        }
    }
}
