package com.demo1;

import java.util.Scanner;
public class Text3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        System.out.println("请再输入一个数字：");
        int b = sc.nextByte();
        int c= ss (a,b);
        System.out.println("他们的和是：");
        System.out.println(c);
    }
    public static int ss(int f,int g){
        int h=f+g;
        return h;
    }
}
