package com.itdr;

import java.util.Scanner;
public class index1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长方形长度");
        int x=sc.nextInt();
        System.out.print("请输入长方形宽度");
        int y=sc.nextInt();;

        int z=x*y;
        System.out.print("长方形的面积是：");
        System.out.print(z);
    }
}
