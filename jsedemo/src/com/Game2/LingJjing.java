package com.Game2;

import java.util.Scanner;
public class LingJjing {
    //存放用户数组
    static Users[] ua = new Users[100];
    //存放门派数组
    static String[] mp2 = new String[5];
    static int[] mpnum = new int[5];
    static{
        mp2[0] = "武当";
        mp2[1] = "华山";
        mp2[2] = "java";
        mp2[3] = "峨眉";
        mp2[4] = "嵩山";
    }
    //灵境主入口
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("欢迎来到灵境");
        System.out.println("====================");
        System.out.println("请记录你的名字：");
        String a1 = sc.next();
        System.out.println("请记录你的门派：");
        String a2 = sc.next();
        System.out.println("请记录你的性别：");
        String a3 = sc.next();
        System.out.println("请记录你的年龄:");
        int a4 = sc.nextInt();
        int i = Uage(new Users(a1, a2, a3, a4));
        System.out.println(i);

        //记录进入的人
        Users s = new Users(a1,a2,a3,a4);
        int k = SaveName(s,ua);
        System.out.println(k);

        //判断进入的人所在门派人数是否超过10人
        int g = MpNum(s,mp2,mpnum);
        for (int m = 0;m < 11;m++) {
            int o =MpNum(s,mp2,mpnum);
            System.out.println(o);
        }
    }

    //判断进入灵境之人的年龄
    public static int Uage(Users u) {
        if (u != null) {
            if (u.age >= 10 && u.age <= 30) {
                return 1;
            }
        }
        return -1;
    }

    //记录进入的人
    public static int SaveName(Users u, Users[] uar) {
        for (int i = 0; i < uar.length; i++) {
            if (uar[i] != null) {
                if (uar[i].uname.equals(u.uname)) {
                    return -1;
                }
            }
        }
        for (int i = 0; i < uar.length; i++) {
            if (uar[i] == null) {
                uar[i] = u;
                return 1;
            }
        }
        return -1;
    }
    public static int MpNum(Users u, String[] mp, int[] mpnum){
        if(u != null){
            for (int i = 0;i <mp.length;i++){
            if(mp[i].equals(u.menpai)){
                if (LingJjing.mpnum[i]<10){
                    return 1;
                }
            }
            }
        }
        return -1;
    }
}