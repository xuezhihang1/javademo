package com.demo1;

import java.util.Scanner;
public class PictureUtill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行：");
        int h=sc.nextInt();
        System.out.println(("请输入列："));
        int l=sc.nextInt();

        OutPutRect(h,l);
    }
    public static void OutPutRect(int c,int k){
        for(int i=0;i<c;i++){
            for(int j=0;j<k-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
