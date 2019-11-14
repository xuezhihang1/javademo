package com.zhouce;

import java.util.Scanner;
public class index13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄：");
        int a=sc.nextInt();
        if(a<18){
            System.out.println("童年");
        }if(a>18 && a<40){
            System.out.println("少年");
        }if(a>=40 && a<60){
            System.out.println("中年");
        }if (a>60){
            System.out.println("老年");
        }
    }
}
