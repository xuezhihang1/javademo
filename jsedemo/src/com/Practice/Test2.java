package com.Practice;

public class Test2 {
    public static void main(String[] args){
        int k=0;
        int i=1;
        for(;i<1001;i++){
            if (i%3 == 2 && i%5 ==3 && i%7 ==2){
                k++;
                System.out.println(i);
            }
        }System.out.println("同时满足这三个条件的数总共有："+k+"个");
    }
}
