package com.demo7;


public class TestDemo4 {
    public static void main(String[] args){
//水仙花练习
        int a,b,c,d;
        for ( a =100;a<999;a++){
            b = a%10;
            c = a/10%10;
            d = a/10/10%10;

            if (a == b*b*b+c*c*c+d*d*d){
                System.out.println(a);
            }
        }
    }
}
