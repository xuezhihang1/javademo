package com.demo1;

import java.util.Scanner;
public class Text2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int a=sc.nextInt();
        System.out.print("请再输入一个数字：");
        int b= sc.nextByte();
        ss(a,b);
    }

    public static void ss(int c,int d){
        System.out.print("他们的和是：");
        System.out.println(c+d);
        System.out.print("他们的差是：");
        System.out.println(c-d);
        System.out.print("他们的积是：");
        System.out.println(c*d);
        System.out.print("他们的商是：");
        System.out.println(c/d);
        System.out.print("C对D的取模是：");
        System.out.print(c%d);
    }
}

