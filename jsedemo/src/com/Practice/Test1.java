package com.Practice;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int i= sc.nextInt();
        for(;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
