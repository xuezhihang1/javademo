package com.demo7;

public class StringDemo5 {
    public static void main(String[] args){
        String s = "helloworld";

        System.out.println("s.length:"+s.length());
        System.out.println("---------------------");

        System.out.println("charAt:"+s.charAt(7));
        System.out.println("---------------------");

        System.out.println("indexOf:"+s.indexOf('l'));
        System.out.println("---------------------");

        System.out.println("indexOf:"+s.indexOf("owo"));
        System.out.println("---------------------");

        System.out.println("indexOf:"+s.indexOf('l',4));
        System.out.println("indexOf:"+s.indexOf('k',4));
        System.out.println("indexOf:"+s.indexOf('l',40));
        System.out.println("--------------------------------------------");

        System.out.println("substring:"+s.substring(5));
        System.out.println("substring:"+s.substring(0));
        System.out.println("----------------------------");

        System.out.println("substring:"+s.substring(3,8));
        System.out.println("substring:"+s.substring(0,s.length()));

    }
}
