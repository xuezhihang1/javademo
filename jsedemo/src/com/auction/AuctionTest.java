package com.auction;

import com.auction.controller.UserController;
import com.auction.dao.UserDao;
import com.auction.pojo.Commodity;

import java.util.Scanner;

//主入口
public class AuctionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserController a = new UserController();
        UserDao f = new UserDao();
        System.out.println("欢迎来到233年一次的万界拍卖会");
        System.out.println("==============================");
        sy:
        for (int i = 0; i < 10; ) {
            System.out.println("请根据数字，选择你所需要的功能：");
            System.out.println("1.注册；2.登录；9.离开");
            System.out.println("请输入：");
            int aa = sc.nextInt();

            switch (aa) {
                case 1:
                    System.out.println("请注册：");
                    System.out.println("请输入用户名：");
                    String uname = sc.next();
                    System.out.println("请输入密码:");
                    String psd = sc.next();
                    UserController uc = new UserController();
                    String register = uc.register(uname, psd);
                    System.out.println(register);
                    break;

                case 2:
                    System.out.println("请登录");
                    System.out.println("请输入用户名：");
                    String name = sc.next();
                    System.out.println("请输入密码：");
                    String psd2 = sc.next();
                    String dl = a.lg(name, psd2);
                    System.out.println(dl);
                    if (dl == "登录成功") {
                        System.out.println("你的用户名为：" + name);
                        System.out.println("你的密码为：" + psd2);
                        System.out.println("你的账户余额为：" + 0);
                        System.out.println("你的等级为：小白");
                        break sy;
                    } else {
                        System.out.println(dl);
                    }
                    break;
                case 9:
                    return;
            }
        }
        //进入拍卖场
        System.out.println("=================================");
        System.out.println("欢迎进入星空拍卖场");
        int z = 0;
        bj2:
        while (z != 9) {
            System.out.println("请根据数字选择你所需要的功能：");
            System.out.println("1.充值；2.展示所有商品；3.搜索商品；4.查看拍卖行排行榜；5.上架商品；6.查看我的购物车；7；加入我的购物车；8.离开拍卖场;9.重新登录");
            int c = sc.nextInt();
            switch (c) {
                //充值
                case 1:
                    System.out.println("请输入所要充值的金额（最大充值金额为100）：");
                    int d = sc.nextInt();
                    int e = a.Recharge1(d);
                    if (e != -1) {
                        System.out.println("充值成功");
                        System.out.println("你的账户余额为：" + e);
                        if (e > 100 && e <= 200) {
                            System.out.println("你的等级为：有钱人");
                        } else if (e > 200 && e <= 300) {
                            System.out.println("你的等级为：土豪");
                        } else if (e > 300 && e <= 400) {
                            System.out.println("你的等级为：神豪");
                        } else if (e > 400 && e <= 500) {
                            System.out.println("你的等级为：肝帝");
                        }
                    } else {
                        System.out.println("充值失败");
                    }
                    break;
                    //展示所有商品
                case 2:
                    f.Commodity();
                    break;
                    //搜索商品
                case 3:
                    f.Search();
                    break;
                    //查看拍卖行排行榜
                case 4:
                    f.RankingList();
                    f.showRankingList();
                    break;
                //选择想要上架的商品
                case 5:
                    System.out.println("百宝箱为：");
                    f.showTreasureBag();
                    System.out.println("请选择是否上架：");
                    System.out.println("1.是；2.不是");
                    int s = sc.nextInt();
                    if (s == 1) {
                        f.shelves();
                        System.out.println("现在的商品是：");
                        f.Commodity();
                    }
                    //查看我的购物车
                case 6:
                    System.out.println("您的购物车有以下商品：");
                    while (true) {
                        int i = a.showCar();
                        if (i == 0) {
                            break;
                        }
                    }
                    int n = a.payment();
                    System.out.println("总价：" + n);
                    System.out.println("是否结算： 1.结算 2.不结算");
                    int p = sc.nextInt();
                    if (p == 1) {
                        int r = a.spend(n);
                        if (r == 1) {
                            System.out.println("是否展示百宝箱 1.展示 2.不展示");
                            int q = sc.nextInt();
                            if (q == 1) {
                                a.showTreasureBag();
                            }
                        }
                        if (r == 0) {
                            break;
                        }
                    }
                    break;
                    //加入我的购物车
                case 7:
                    int o =0;
                    while (o != 2) {
                        System.out.println("请输入选购的商品序号：");
                        int l = sc.nextInt();
                        int i=a.shoppingCar(l);
                        if (i==1) {
                            System.out.println("加入购物车成功");
                            System.out.println(" 是否继续选购商品：1：是  2：否");
                            o = sc.nextInt();
                        }
                    }
                    break;
                    //离开拍卖场
                case 8:
                    return;
                    //重新登录
                case 9:
                    break bj2;
            }
        }
    }
}


