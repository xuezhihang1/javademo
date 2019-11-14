package com.zhouce;

import java.util.Scanner;
public class index12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩：");
        int a = sc.nextInt();
        String sex="女";
        if(a>80){
            System.out.println("进入女子组决赛");
        }
    }
}
