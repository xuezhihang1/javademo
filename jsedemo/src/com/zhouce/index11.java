package com.zhouce;

import java.util.Scanner;
public class index11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄：");
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("成年");
        }else{
            System.out.println("未成年");
        }
    }
}
