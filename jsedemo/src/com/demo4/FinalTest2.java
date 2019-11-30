package com.demo4;

public class FinalTest2 {
    public static void main(String[] args) {
        int x = 10;
        x =10;
        System.out.println(x);
        final int y =10;

//        y = 100;
        System.out.println(y);
        System.out.println("-------------");

        Student6 s = new Student6();
        System.out.println(s.age);
        s.age = 100;
        System.out.println(s.age);
        System.out.println("-------------");

        final Student6 ss =new Student6();
        System.out.println(ss.age);
        ss.age = 100;
        System.out.println(ss.age);

//        ss = new Student6();
    }
}
