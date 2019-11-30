package com.AuctionHouse;

import java.util.Scanner;
public class AuctionHouseTest {
    static Users[] us;

    static {
        //准备一个存放用户的数组
        us = new Users[10];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到每233年举办一次的万界拍卖会");
        int m = 0;
        while (m != 9){

            System.out.println("请根据数字序号选择功能:");
            System.out.println("1.用户登录");
            System.out.println("2.用户注册");
            System.out.println("9.离开拍卖场");
            m = sc.nextInt();

            switch (m){
                case 1:
                    System.out.println("请输入用户名：");
                    String name = sc.next();
                    System.out.println("请输入密码：");
                    String psd = sc.next();
                    login(name,psd,us);
                    break;
                case 2:
                    System.out.println("请输入用户名：");
                    String name2 = sc.next();
                    System.out.println("请输入密码：");
                    String psd2 = sc.next();
                    register(name2,psd2,us);
                    break;
                case 9:
                    return;
            }
        }
    }


    //用户注册
    public static int register(String name, String password, Users[] us) {
        //参数非空判断
        Users u = new Users();
        u.setUname(name);
        u.setPassword(password);
        Users u1 = new Users(name, password);

        //判断用户是否存在
       int is =  userExist(u,us);
       if (is == 1) {
           for (int j = 0; j < us.length; j++) {
               if (us[j] == null) {
                   us[j] = u;
                   return is;
               }
           }
       }
        return is;
    }

    //判断用户是否存在
    public static int userExist(Users ue,Users[] us) {

        //判断用户是否存在
        for (int i = 0; i < us.length; i++) {
            if (us[i] != null) {
                //当用户没有注册时，把用户放进数组中空的位置
                if ( ! us[i].getUname().equals(ue.getUname())) {
                    return 1;
                }
            }
        }
        return -1;
    }

    //用户登录
    public static int login(String uname,String password,Users[] us){
        //判断用户是否存在
        for (int i = 0; i < us.length; i++) {
            if (us[i] != null) {
                //当用户名和密码都匹配的时候，说明用户存在，登录成功
                if (us[i].getUname().equals(uname) && us[i].getPassword().equals(password)) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
