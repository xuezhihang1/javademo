package com.zhouce;

public class index14 {
    public static void main(String[] args){

        String a="吃包子";
        String b="吃油条";
        String c="吃主席套餐";
        switch (c){
            case"a":
                System.out.println("星期一");
                System.out.println("星期三");
                System.out.println("星期五");
                break;
            case"b":
                System.out.println("星期二");
                System.out.println("星期四");
                System.out.println("星期六");
                break;
            case"c":
                System.out.println("星期日");
                break;
        }
        System.out.println("今天的早餐是："+c);
    }
}
