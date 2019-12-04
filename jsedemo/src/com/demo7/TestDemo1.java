package com.demo7;

import java.util.Scanner;
public class TestDemo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[20];

        System.out.println("请输入一个数字:");
        while(sc.hasNextInt()){
            System.out.println("请输入一个数字：");
            int i = sc.nextInt();
            for (int j = 0;j <ar.length;j++){
                if (ar[j] == 0){
                    ar[j] = i;
                    break;
                }
            }
        }
        for (int j = 0;j<ar.length;j++){
            if (ar[j] != 0){
                System.out.println(ar[j]);
            }
        }
    }
}
