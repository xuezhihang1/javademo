
package com.test;
import com.test.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class fuWenTest {
    public static void main(String[] args) {
//        //登陆
//        String[] user = fuWenTest.login();
//        System.out.println("请选择以下符文：");
        //存放用户的数组
        User[] uar = new User[10];

        Scanner sc = new Scanner(System.in);


        System.out.println("欢迎来到符文大陆");
        System.out.println("================");
        System.out.println("请注册：");
        //注册
        System.out.println("请输入你的用户名：");
        String uname = sc.next();
        System.out.println("请输入你的密码：");
        String password = sc.next();

        int m =register(uname,password,uar);
        if(m == 1){
            System.out.println("注册成功");
        }
        //登录
        System.out.println("请登录");
        String uname2 = sc.next();
        String psd2 = sc.next();
        int login =login(uname2,psd2,uar);
        if(login == 1){
            System.out.println("登录成功");
            System.out.println("请选择以下铭文：");
        }

        //符文
        for (ziFuWen ziFuWen :fuWen.create()){
            System.out.println(ziFuWen.getName()+ziFuWen.getType()+ziFuWen.getColer());
        }
        while(true){
            List<ziFuWen> ziFuWens = fuWen.create();
            List<ziFuWen> has = choose(ziFuWens);
            if (has.size() == 0) {
                System.out.println("攻击：" + has.size());
            }
            //  int shuxing = 0;
            String gongji = "0";
            String fashu = "0";
            String fangyu = "0";

            for (int i = 0; i < has.size(); i++) {
                if (i < 10) {
                    gongji += has.get(i).levle;
                }
                if (i > 10 && i < 20) {
                    fashu += has.get(i).levle;
                }
                if (i > 20 && i < 30) {
                    fangyu += has.get(i).levle;
                }
            }
            System.out.println("攻击：" + gongji);
            System.out.println("法术：" + fashu);
            System.out.println("防御：" + fangyu);
        }
    }
    //登陆
//    public static String[] login(){
//        System.out.println("欢迎来到符文大陆：");
//        System.out.println("====================");
//        System.out.println("请输入用户名");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//
//        System.out.println("请输入密码");
//        Scanner scannerp = new Scanner(System.in);
//        String password = scannerp.next();
//
//
//        String[] user = new String[2];
//        user[0] = name;
//        user[1] = password;
//
//
//        return user;
//    }
    //注册
    public static int register(String uname, String password, User[] uar) {
        User u = new User();
        u.name = uname;
        u.password = password;
        for (int i = 0; i < uar.length; i++) {
            if (uar[i] == null) {
                uar[i] = u;
                return 1;
            }
        }
        return -1;
    }

    //登录
    public static int login(String uname, String password, User[] uar) {
        for (int i = 0; i < uar.length; i++) {
            if (uar[i] != null) {
                if (uar[i].                                                                                     name.equals(uname) && uar[i].password.equals(password)) {
                    return 1;
                }
            }
        }
        return -1;
    }
    //选择符文                                          所有符文
    public static  List<ziFuWen> choose(List<ziFuWen> ziFuWens){

        //所选择的符文
        List<ziFuWen> list = new ArrayList<>();

        //限制选择类型数量
        int xianzhihong = 10;
        int xianzhilan = 10;
        int xianzhilv = 10;

        System.out.println("请选择你想要的符文");

        //开始输入
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //获取输入的值
            int num = scanner.nextInt();

            //限制条件
            if (xianzhihong == 0 && xianzhilan == 0 && xianzhilv == 0 && num != 0 && num != 1) {
                System.out.println("已选够30个符文，是否确定组合？");
                System.out.println("输入0确定，输入1不确定，请选择：");
            } else if (num ==0 ) {
                //确认
//                System.out.println("是否确定");
                return list;
            } else if (num == 1){
                //放弃
                list = new ArrayList<>();
                return list;
            }else {
                //继续选择
                if (num < 30 && xianzhihong > 0) {
                    list.add(ziFuWens.get(num));
                    System.out.println("您选择了第" + num + "个");
                    xianzhihong--;
                } else if (num > 30 && num < 60 && xianzhilan > 0) {
                    list.add(ziFuWens.get(num));
                    System.out.println("您选择了第" + num + "个");
                    xianzhilan--;
                } else  if(num > 60 && num < 94 && xianzhilv > 0) {
                    list.add(ziFuWens.get(num));
                    System.out.println("您选择了第" + num + "个");
                    xianzhilv--;
                } else {
                    //限制数组越界
                    System.out.println("已选满十个，请选择其他颜色的符文：");
                }
            }

        }
    }
    }

