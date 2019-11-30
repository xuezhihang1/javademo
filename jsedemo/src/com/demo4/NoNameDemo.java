package com.demo4;

public class NoNameDemo {
    public static void main(String[] args) {
        Student3 s =   new Student3();
        s.show();
        s.show();
        System.out.println("-----------");

        new Student3().show();
        new Student3().show();
        System.out.println("-----------");

        StudentDemo3 sd = new StudentDemo3();
        sd.method(new Student3());

        new StudentDemo3().method(new Student3());
    }
}
