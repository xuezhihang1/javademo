package com.zhouce;

import java.util.Scanner;

public class index12 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int a = b.nextInt();
        if ( a >= 80) {
            System.out.println("进入决赛");
        }
        if ( a<80) {
            System.out.println("不能进入决赛");
            return;
        }
        for (int c = 1; c>0; c++) {
            System.out.println("请输入性别：0代表男，1代表女");
            int k = b.nextInt();
            if (k == 0 ) {
                System.out.println("进入男子决赛");
                return;
            } if (k == 1 ) {
                System.out.println("进入女子决赛");
                return;
            } else{
                System.out.println("你输入的数字有误");
                System.out.println("请重新输入：");
            }
        }
    }
}
