package com.zhouce;

import java.util.Scanner;
public class index10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("变量a的值为：");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("偶数");
        }
    }
}