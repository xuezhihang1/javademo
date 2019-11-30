package com.caiquangame;

import com.caiquangame.controller.UserController;

import java.util.Scanner;
public class CaiQuanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎进入猜拳小游戏");
        System.out.println("===================");
        System.out.println("请输入用户名：");
        String uname = sc.next();
        System.out.println("请输入密码：");
        String psd = sc.next();
        UserController uc = new UserController();
        String register = uc.register(uname,psd);
        System.out.println(register);
    }
}
