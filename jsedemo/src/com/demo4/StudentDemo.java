package com.demo4;

public class StudentDemo {
    static {
        System.out.println("我喜欢Java");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");
        Student s1 = new Student();
        Student s2 = new Student();
    }
}
