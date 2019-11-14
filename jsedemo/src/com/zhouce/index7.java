package com.zhouce;

import java.util.Scanner;
public class index7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a=sc.nextInt();
        int num=999;
        int count=0;
        if( a <10 & a>=0){
            System.out.println("这是一个个位数");
        }
        if(a>=10 & a<100){
            System.out.println("这是一个两位数");
        }
        if(a>99 & a<=999){
            System.out.println("这是一个三位数");
        }
        if(a>999 & a<=9999){
            System.out.println("这是一个四位数");
        }
        if(a>9999 & a<=99999){
            System.out.println("这是一个五位数");
        }
        if(a>99999 & a<=999999){
            System.out.println("这是一个六位数");
        }
        if(a>999999 & a<=9999999){
            System.out.println("这是一个七位数");
        }
        if(a>9999999 & a<=99999999){
            System.out.println("这是一个八位数");
        }
        if(a>99999999 & a<=999999999){
            System.out.println("这是一个九位数");
        }
    }
}
