package com.zhouce;

import java.util.Scanner;
public class index9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        System.out.println("考试成绩如何：");
        if (a >= 60) {
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
