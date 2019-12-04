package com.demo7;


public class TestDemo2 {
    public static void main(String[] args){
        byte[] bys = {97,98,99,100,101};
        String s = new String(bys);
        System.out.println(s);

        String s3 = new String(bys,1,3);
        System.out.println("s3.length():"+s3);
        System.out.println("s3.length()"+s3.length());

        char[] chs = {'a','b','c','d','e','爱','林','亲'};
        String s4 = new String(chs);
        System.out.println("s4:"+s4);
        System.out.println("s4.length()"+s4.length());
    }
}
