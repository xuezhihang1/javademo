package com.demo7;

public class StringDemo7 {
    public static void main(String[] args) {
        String s =  "helloWORLD";

        String s1 = s.substring(0,1);
        String s2 = s.substring(1);
        String s3 = s1.toUpperCase();
        String s4 = s2.toLowerCase();
        String s5 = s3.concat(s4);
        System.out.println(s5);

        String result = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(result);
    }
}
