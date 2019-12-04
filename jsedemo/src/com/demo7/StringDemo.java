package com.demo7;

public class StringDemo {
    public static void main(String[] args){
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "HelloWorld";

        System.out.println("equals:"+s1.equals(s2));
        System.out.println("equals:"+s1.equals(s3));

        System.out.println("equals:"+s1.equalsIgnoreCase(s2));
        System.out.println("equals:"+s1.equalsIgnoreCase(s3));

        System.out.println("contains:"+s1.contains("hello"));
        System.out.println("contains:"+s1.contains("hw"));

        System.out.println("startsWith:"+s1.startsWith("h"));
        System.out.println("startsWith:"+s1.startsWith("hello"));
        System.out.println("startsWith:"+s1.startsWith("world"));

        System.out.println("isEmpty:"+s1.isEmpty());

        String s4 = "";
        String s5 = null;
        System.out.println("isEmpty:"+s4.isEmpty());
        System.out.println("isEmpty:"+s5.isEmpty());
    }
}
